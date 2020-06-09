package com.cubetiqs.util;

/**
 * String util helper
 *
 * @author sombochea
 * @since 1.0
 */
public final class StringHelper {
    public static String getOrDefault(String text, String fallback) {
        if (text == null || text.isEmpty()) {
            return fallback;
        }
        return text;
    }

    public static String getOrEmpty(String text) {
        return getOrDefault(text, "");
    }
}
