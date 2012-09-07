/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s4i.eclipsepluginutils;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author dwickern
 */
public class PluginUtilsTest {

    @Test
    public void testGetViewElements() {
        assertNotNull(PluginUtils.getViewElements());
        assertTrue(PluginUtils.getViewElements().length > 0);
    }
}
