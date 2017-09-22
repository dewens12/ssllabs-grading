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

        Assert.assertTrue(ExpressionParser.evaluate("1 == 1"));
        Assert.assertFalse(ExpressionParser.evaluate("1 == 2"));
        Assert.assertTrue(ExpressionParser.evaluate("1 != 2"));

        Assert.assertTrue(ExpressionParser.evaluate("1 < 2"));
        Assert.assertFalse(ExpressionParser.evaluate("1 < 1"));
        Assert.assertFalse(ExpressionParser.evaluate("2 < 1"));

        Assert.assertTrue(ExpressionParser.evaluate("2 > 1"));
        Assert.assertFalse(ExpressionParser.evaluate("2 > 2"));
        Assert.assertFalse(ExpressionParser.evaluate("1 > 2"));
    }

    @Test
    public void numberParsing() {
        Assert.assertTrue(ExpressionParser.evaluate("16 == 0x10"));
    }
}
