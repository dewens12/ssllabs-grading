package com.ssllabs.grading;

%%{
    machine ssllabs_grading_expression;

    action start {
        start = p;
    }

    action op_and {
    }

    action op_or {
    }

    action op_eq {
        expression.pushOperator(Operator.eq);
    }

    action op_neq {
        expression.pushOperator(Operator.neq);
    }

    action op_gt {
        expression.pushOperator(Operator.gt);
    }

    action op_lt {
        expression.pushOperator(Operator.lt);
    }

    action op_gte {
        expression.pushOperator(Operator.gte);
    }

    action op_lte {;
        expression.pushOperator(Operator.lte);
    }

    action op_in {
        expression.pushOperator(Operator.in);
    }

    action val_true {
        expression.pushOperand(Boolean.TRUE);
    }

    action val_false {
        expression.pushOperand(Boolean.FALSE);
    }

    action val_number {
        String s = new String(data, start, p - start);
        if (s.startsWith("0x")) {
            expression.pushOperand(Integer.valueOf(s.substring(2), 16));
        } else {
            expression.pushOperand(Integer.valueOf(s));
        }
    }

    action val_reference {
        String s = new String(data, start, p - start);
    }

    action val_list_start {
        listNeedle = expression.popOperand();
        expression.pushOperand(Expression.LIST_TERMINATOR);
        System.err.println("List start");
    }

    action val_list_end {
        expression.pushOperand(listNeedle);
        System.err.println("List end");
    }

    SP = ' ';

    BOOLEAN_OP = SP* ( "&&" %op_and | "||" %op_or ) SP*;

    CMP_OP = SP* ( "==" %op_eq | "!=" %op_neq | ">" %op_gt | "<" %op_lt | ">=" %op_gte | "<=" %op_lte ) SP*;

    IN = SP* "in" %op_in SP*;

    LB = SP* "(" SP*;

    RB = SP* ")" SP*;


    identifier = ( ( [a-zA-Z_] [a-zA-Z0-9_]* ) -- "true" -- "false" );

    reference = ( identifier ( "." identifier )* );

    literal = '"' (ascii -- cntrl -- '"')* '"';

    number = ( [0-9]+ | "0x" [0-9a-fA-F]+ ) %val_number;

    value = ( reference %val_reference | literal | number | "true" %val_true | "false" %val_false ) >start;

    list_value = ( literal | number ) >start;

    list = ( "[" >val_list_start SP* list_value ( SP* "," SP* list_value )* SP* "]"  %val_list_end ) ;

    comparison = SP* value (( CMP_OP value ) | ( IN list )) SP*;

    simple_expression = comparison ( BOOLEAN_OP comparison )*;

#    expression =   ( LB expression RB )
#                 | ( simple_expression )
#		    	 | ( simple_expression BOOLEAN_OP expression )
#		    	 | ( expression BOOLEAN_OP simple_expression )
#		    	 | ( expression BOOLEAN_OP expression);

    main := simple_expression;
}%%

public class ExpressionParser {

    %% write data;

    public static Expression parse(String input) {
        char[] data = input.toCharArray();
        int eof = data.length;
        int cs;
        int p = 0;
        int pe = eof;

        int start = 0;
        int tagStart = 0;

        Object listNeedle = null;

        Expression expression = new Expression();

        %% write init;
        %% write exec;

        if (cs < %%{write first_final; }%%) {
            throw new RuntimeException("Syntax error at position " + p);
        }

        return expression;
    }

    public static boolean evaluate(String text) {
        Expression expression = ExpressionParser.parse(text);
        return expression.evaluate();
    }
}