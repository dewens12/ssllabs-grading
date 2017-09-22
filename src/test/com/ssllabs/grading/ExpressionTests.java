package com.ssllabs.grading;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void listOperator() {
        Assert.assertTrue(ExpressionParser.evaluate("1 in [ 1, 2, 3 ]"));
        Assert.assertFalse(ExpressionParser.evaluate("4 in [ 1, 2, 3 ]"));
    }

    @Test
    public void strings() {
        Assert.assertTrue(ExpressionParser.evaluate("\"egg\" == \"egg\""));
        Assert.assertFalse(ExpressionParser.evaluate("\"egg\" == \"chicken\""));
        Assert.assertTrue(ExpressionParser.evaluate("\"chicken\" in [ \"why\", \"did\", \"the\", \"chicken\", \"cross\", \"the\", \"road\", \"?\" ]"));
    }

    @Test
    public void references1() {
        Map<String, Object> farm = new HashMap<>();
        farm.put("chickens", 5);
        farm.put("cows", 2);
        farm.put("dogs", 1);
        Assert.assertTrue(ExpressionParser.evaluate("chickens == 5", farm));
        Assert.assertFalse(ExpressionParser.evaluate("chickens != 5", farm));
        Assert.assertFalse(ExpressionParser.evaluate("cows == 5", farm));
    }

    @Test
    public void references2() {
        Map<String, Object> farm = new HashMap<>();
        Map<String, Object> barn = new HashMap<>();
        barn.put("chickens", 5);
        farm.put("barn", barn);
        Assert.assertTrue(ExpressionParser.evaluate("barn.chickens == 5", farm));
    }

    @Test
    public void referencesPublicFieldAccess() {
        Map<String, Object> farm = new HashMap<>();
        PublicHen hen = new PublicHen(5);
        farm.put("hen", hen);
        Assert.assertTrue(ExpressionParser.evaluate("hen.chickens == 5", farm));
        Assert.assertFalse(ExpressionParser.evaluate("hen.locked == true", farm));
    }

    @Test
    public void referencesGetMethodAccess() {
        Map<String, Object> farm = new HashMap<>();
        PrivateHen hen = new PrivateHen(5);
        farm.put("hen", hen);
        Assert.assertTrue(ExpressionParser.evaluate("hen.chickens == 5", farm));
        Assert.assertFalse(ExpressionParser.evaluate("hen.locked == true", farm));
    }
}
