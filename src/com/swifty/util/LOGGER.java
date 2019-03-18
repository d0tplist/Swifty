package com.swifty.util;

import java.nio.file.Path;

public class LOGGER {

    public static void info(String s, Path absolutePath) {
        info(s, absolutePath.toString());
    }

    public static void info(String s, String absolutePath) {

    }

    public static void info(String s) {

    }

    public static void error(String errorMsg) {

    }
}
