package com.swifty.exception;

import com.swifty.domain.node.expression.Argument;
import com.swifty.domain.node.expression.Parameter;

import java.util.List;

/**
 * Created by Alex
 */
public class WrongArgumentNameException extends RuntimeException {
    public WrongArgumentNameException(Argument argument, List<Parameter> parameters) {
        super("You are trying to call method with argument name" + argument.getParameterName().get() + " where parameters = " + parameters);
    }
}
