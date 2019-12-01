package org.oscar.algo.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-12-01
 */
public class StackUtilsTest {

    @Test
    public void isValidParentheses() {
        String one = "()";
        StackUtils stackUtils = StackUtils.getInstance();
        assertTrue(stackUtils.isValid(one));

        String two = "()[]{}";
        assertTrue(stackUtils.isValid(two));

        String three = "(]";
        assertFalse(stackUtils.isValid(three));

        String four = "([)]";
        assertFalse(stackUtils.isValid(four));

        String five = "{[]}";
        assertTrue(stackUtils.isValid(five));

    }
}