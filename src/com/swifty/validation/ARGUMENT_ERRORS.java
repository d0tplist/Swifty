package com.swifty.validation;

public enum ARGUMENT_ERRORS {
    NONE (""),
    NO_FILE ("Specify files for compilation"),
    BAD_FILE_EXTENSION ("File has to end with .swift extension");

    private final String message;

    ARGUMENT_ERRORS(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
