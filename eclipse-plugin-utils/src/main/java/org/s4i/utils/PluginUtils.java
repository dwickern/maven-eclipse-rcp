package org.s4i.utils;

/**
 *
 * @author dwickern
 */
public final class PluginUtils {
    private PluginUtils() {
        throw new AssertionError();
    }
    
    public static String[] getViewElements() {
        return new String[] { "One", "Two", "Three" };
    }
}
