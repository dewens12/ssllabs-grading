package com.ssllabs.grading;

public class ExpressionParserMain {

    private static void evaluate(String text) {
        try {
            Expression expression = ExpressionParser.parse(text);
            System.out.println("# [" + text + "] " + expression.evaluate());
        } catch(RuntimeException e) {
            System.out.println("# [" + text + "] " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        evaluate("true == true");
        evaluate("true == false");
        evaluate("true != false");
        evaluate("false != false");
        //ExpressionParser.parse("true != false");
        //ExpressionParser.parse("http.redirectsToHTTPS == true");
        //ExpressionParser.parse("http.hsts.enabled == true && http.hsts.policy.duration >= 31536000");
        //ExpressionParser.parse("serverProtocol in [ 0x0303, 0x0302, 0x0301 ]");
    }
}
