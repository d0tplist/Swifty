package com.swifty.domain;


import com.swifty.bytecodegeneration.MethodGenerator;
import com.swifty.domain.node.expression.Parameter;
import com.swifty.domain.node.statement.Statement;
import com.swifty.domain.scope.FunctionSignature;
import com.swifty.domain.type.Type;

import java.util.Collections;
import java.util.List;

/**
 * Created by Alex
 */
public class Function {

    private final FunctionSignature functionSignature;
    private final Statement rootStatement;


    public Function(FunctionSignature functionSignature, Statement rootStatement) {
        this.functionSignature = functionSignature;
        this.rootStatement = rootStatement;
    }

    public String getName() {
        return functionSignature.getName();
    }

    public List<Parameter> getParameters() {
        return Collections.unmodifiableList(functionSignature.getParameters());
    }

    public Statement getRootStatement() {
        return rootStatement;
    }

    public Type getReturnType() {
        return functionSignature.getReturnType();
    }

    public void accept(MethodGenerator generator) {
        generator.generate(this);
    }
}
