package com.ssllabs.grading;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionTests {

    @Test
    public void simpleComparisons() {
        Assert.assertTrue(ExpressionParser.evaluate("true == true"));
        Assert.assertTrue(ExpressionParser.evaluate("false == false"));
        Assert.assertTrue(ExpressionParser.evaluate("true != false"));
        Assert.assertTrue(ExpressionParser.evaluate("false != true"));

        Assert.assertFalse(ExpressionParser.evaluate("true == false"));
        Assert.assertFalse(ExpressionParser.evaluate("false == true"));
        Assert.assertFalse(ExpressionParser.evaluate("false != false"));
        Assert.assertFalse(ExpressionParser.evaluate("true != true"));
    }
}
