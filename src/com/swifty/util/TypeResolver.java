package com.swifty.util;

import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.swifty.domain.type.BultInType;
import com.swifty.domain.type.ClassType;
import com.swifty.domain.type.Type;
import com.swifty.parser.SwiftyParser;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by Alex
 */
public final class TypeResolver {

    public static Type getFromTypeContext(SwiftyParser.TypeContext typeContext) {
        if(typeContext == null) return BultInType.VOID;
        return getFromTypeName(typeContext.getText());
    }

    public static Type getFromTypeName(String typeName) {
        if(typeName.equals("java.lang.String")) return BultInType.STRING;
        Optional<? extends Type> builtInType = getBuiltInType(typeName);
        if(builtInType.isPresent()) return builtInType.get();
        return new ClassType(typeName);
    }

    public static Type getFromValue(SwiftyParser.ValueContext value) {
        String stringValue = value.getText();
        if (StringUtils.isEmpty(stringValue)) return BultInType.VOID;
        if (value.NUMBER() != null) {
            if (Ints.tryParse(stringValue) != null) {
                return BultInType.INT;
            } else if (Floats.tryParse(stringValue) != null) {
                return BultInType.FLOAT;
            } else if (Doubles.tryParse(stringValue) != null) {
                return BultInType.DOUBLE;
            }
        } else if (value.BOOL() != null) {
            return BultInType.BOOLEAN;
        }
        return BultInType.STRING;
    }

    public static Object getValueFromString(String stringValue, Type type) {
        if (TypeChecker.isInt(type)) {
            return Integer.valueOf(stringValue);
        }
        if (TypeChecker.isFloat(type)) {
            return Float.valueOf(stringValue);
        }
        if (TypeChecker.isDouble(type)) {
            return Double.valueOf(stringValue);
        }
        if (TypeChecker.isBool(type)) {
            return Boolean.valueOf(stringValue);
        }
        if (type == BultInType.STRING) {
            stringValue = StringUtils.removeStart(stringValue, "\"");
            stringValue = StringUtils.removeEnd(stringValue, "\"");
            return stringValue;
        }
        throw new AssertionError("Objects not yet implemented!");
    }

    private static Optional<BultInType> getBuiltInType(String typeName) {
        return Arrays.stream(BultInType.values())
                .filter(type -> type.getName().equals(typeName))
                .findFirst();
    }
}
