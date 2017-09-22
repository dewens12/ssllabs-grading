
// line 1 "ExpressionParser.rl"
package com.ssllabs.grading;

import java.util.Map;


// line 124 "ExpressionParser.rl"


public class ExpressionParser {

    
// line 15 "ExpressionParser.java"
private static byte[] init__ssllabs_grading_expression_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,
	    5,    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,
	   11,    1,   12,    1,   13,    1,   14,    1,   15,    1,   16,    2,
	    0,   14,    2,    1,    0,    2,    2,    0,    2,    3,    0,    2,
	    4,    0,    2,    5,    0,    2,    6,    0,    2,    7,    0,    2,
	    8,    0
	};
}

private static final byte _ssllabs_grading_expression_actions[] = init__ssllabs_grading_expression_actions_0();


private static short[] init__ssllabs_grading_expression_key_offsets_0()
{
	return new short [] {
	    0,    0,   12,   15,   18,   23,   29,   30,   42,   54,   57,   60,
	   61,   73,   81,   88,  101,  102,  114,  129,  136,  152,  153,  165,
	  172,  185,  197,  213,  229,  246,  262,  278,  294,  310,  326,  342,
	  347,  363,  379,  395,  400,  406,  418,  424,  435,  436,  437,  446,
	  451,  454,  457,  460,  466,  471,  477,  486,  489,  495,  500,  513,
	  527,  541,  555,  570,  584,  598,  612,  626,  640,  654,  657,  671,
	  685,  699,  702,  711
	};
}

private static final short _ssllabs_grading_expression_key_offsets[] = init__ssllabs_grading_expression_key_offsets_0();


private static char[] init__ssllabs_grading_expression_trans_keys_0()
{
	return new char [] {
	   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,   97,  122,
	   34,   32,  126,   34,   32,  126,   32,   33,   60,   61,   62,   32,
	   33,   60,   61,   62,  105,   61,   32,   34,   48,   95,  102,  116,
	   49,   57,   65,   90,   97,  122,   32,   34,   48,   95,  102,  116,
	   49,   57,   65,   90,   97,  122,   34,   32,  126,   34,   32,  126,
	   38,   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,   97,
	  122,   32,   33,   60,   61,   62,  120,   48,   57,   32,   33,   60,
	   61,   62,   48,   57,   32,   34,   48,   61,   95,  102,  116,   49,
	   57,   65,   90,   97,  122,  124,   32,   34,   48,   95,  102,  116,
	   49,   57,   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,
	   95,  102,  116,   48,   57,   65,   90,   97,  122,   95,  102,  116,
	   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,   97,
	  102,  116,   48,   57,   65,   90,   98,  122,   61,   32,   34,   48,
	   95,  102,  116,   49,   57,   65,   90,   97,  122,   95,  102,  116,
	   65,   90,   97,  122,   32,   34,   48,   61,   95,  102,  116,   49,
	   57,   65,   90,   97,  122,   32,   34,   48,   95,  102,  116,   49,
	   57,   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,
	  102,  108,  116,   48,   57,   65,   90,   97,  122,   32,   33,   46,
	   60,   61,   62,   95,  102,  115,  116,   48,   57,   65,   90,   97,
	  122,   32,   33,   46,   60,   61,   62,   95,  102,  116,   48,   57,
	   65,   90,   97,  100,  103,  122,   32,   33,   46,   60,   61,   62,
	   95,  102,  114,  116,   48,   57,   65,   90,   97,  122,   32,   33,
	   46,   60,   61,   62,   95,  102,  116,  117,   48,   57,   65,   90,
	   97,  122,   32,   33,   46,   60,   61,   62,   95,   97,  102,  116,
	   48,   57,   65,   90,   98,  122,   32,   33,   46,   60,   61,   62,
	   95,  102,  108,  116,   48,   57,   65,   90,   97,  122,   32,   33,
	   46,   60,   61,   62,   95,  102,  115,  116,   48,   57,   65,   90,
	   97,  122,   32,   33,   46,   60,   61,   62,   95,  101,  102,  116,
	   48,   57,   65,   90,   97,  122,   32,   33,   60,   61,   62,   32,
	   33,   46,   60,   61,   62,   95,  102,  114,  116,   48,   57,   65,
	   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,  102,  116,
	  117,   48,   57,   65,   90,   97,  122,   32,   33,   46,   60,   61,
	   62,   95,  101,  102,  116,   48,   57,   65,   90,   97,  122,   32,
	   33,   60,   61,   62,   48,   57,   65,   70,   97,  102,   32,   34,
	   48,   95,  102,  116,   49,   57,   65,   90,   97,  122,   48,   57,
	   65,   70,   97,  102,   32,   33,   60,   61,   62,   48,   57,   65,
	   70,   97,  102,  110,   32,   32,   91,   95,  102,  116,   65,   90,
	   97,  122,   32,   34,   48,   49,   57,   34,   32,  126,   34,   32,
	  126,   32,   44,   93,   32,   44,   93,  120,   48,   57,   32,   44,
	   93,   48,   57,   48,   57,   65,   70,   97,  102,   32,   44,   93,
	   48,   57,   65,   70,   97,  102,   32,   38,  124,   32,   38,  120,
	  124,   48,   57,   32,   38,  124,   48,   57,   32,   38,   46,   95,
	  102,  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,
	   95,   97,  102,  116,  124,   48,   57,   65,   90,   98,  122,   32,
	   38,   46,   95,  102,  108,  116,  124,   48,   57,   65,   90,   97,
	  122,   32,   38,   46,   95,  102,  115,  116,  124,   48,   57,   65,
	   90,   97,  122,   32,   38,   46,   95,  102,  116,  124,   48,   57,
	   65,   90,   97,  100,  103,  122,   32,   38,   46,   95,  102,  114,
	  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,   95,
	  102,  116,  117,  124,   48,   57,   65,   90,   97,  122,   32,   38,
	   46,   95,   97,  102,  116,  124,   48,   57,   65,   90,   98,  122,
	   32,   38,   46,   95,  102,  108,  116,  124,   48,   57,   65,   90,
	   97,  122,   32,   38,   46,   95,  102,  115,  116,  124,   48,   57,
	   65,   90,   97,  122,   32,   38,   46,   95,  101,  102,  116,  124,
	   48,   57,   65,   90,   97,  122,   32,   38,  124,   32,   38,   46,
	   95,  102,  114,  116,  124,   48,   57,   65,   90,   97,  122,   32,
	   38,   46,   95,  102,  116,  117,  124,   48,   57,   65,   90,   97,
	  122,   32,   38,   46,   95,  101,  102,  116,  124,   48,   57,   65,
	   90,   97,  122,   32,   38,  124,   32,   38,  124,   48,   57,   65,
	   70,   97,  102,   32,   38,  124,    0
	};
}

private static final char _ssllabs_grading_expression_trans_keys[] = init__ssllabs_grading_expression_trans_keys_0();


private static byte[] init__ssllabs_grading_expression_single_lengths_0()
{
	return new byte [] {
	    0,    6,    1,    1,    5,    6,    1,    6,    6,    1,    1,    1,
	    6,    6,    5,    7,    1,    6,    9,    3,   10,    1,    6,    3,
	    7,    6,   10,   10,    9,   10,   10,   10,   10,   10,   10,    5,
	   10,   10,   10,    5,    0,    6,    0,    5,    1,    1,    5,    3,
	    1,    1,    3,    4,    3,    0,    3,    3,    4,    3,    7,    8,
	    8,    8,    7,    8,    8,    8,    8,    8,    8,    3,    8,    8,
	    8,    3,    3,    3
	};
}

private static final byte _ssllabs_grading_expression_single_lengths[] = init__ssllabs_grading_expression_single_lengths_0();


private static byte[] init__ssllabs_grading_expression_range_lengths_0()
{
	return new byte [] {
	    0,    3,    1,    1,    0,    0,    0,    3,    3,    1,    1,    0,
	    3,    1,    1,    3,    0,    3,    3,    2,    3,    0,    3,    2,
	    3,    3,    3,    3,    4,    3,    3,    3,    3,    3,    3,    0,
	    3,    3,    3,    0,    3,    3,    3,    3,    0,    0,    2,    1,
	    1,    1,    0,    1,    1,    3,    3,    0,    1,    1,    3,    3,
	    3,    3,    4,    3,    3,    3,    3,    3,    3,    0,    3,    3,
	    3,    0,    3,    0
	};
}

private static final byte _ssllabs_grading_expression_range_lengths[] = init__ssllabs_grading_expression_range_lengths_0();


private static short[] init__ssllabs_grading_expression_index_offsets_0()
{
	return new short [] {
	    0,    0,   10,   13,   16,   22,   29,   31,   41,   51,   54,   57,
	   59,   69,   77,   84,   95,   97,  107,  120,  126,  140,  142,  152,
	  158,  169,  179,  193,  207,  221,  235,  249,  263,  277,  291,  305,
	  311,  325,  339,  353,  359,  363,  373,  377,  386,  388,  390,  398,
	  403,  406,  409,  413,  419,  424,  428,  435,  439,  445,  450,  461,
	  473,  485,  497,  509,  521,  533,  545,  557,  569,  581,  585,  597,
	  609,  621,  625,  632
	};
}

private static final short _ssllabs_grading_expression_index_offsets[] = init__ssllabs_grading_expression_index_offsets_0();


private static byte[] init__ssllabs_grading_expression_trans_targs_0()
{
	return new byte [] {
	    1,    2,   13,   18,   31,   36,   14,   18,   18,    0,    4,    3,
	    0,    4,    3,    0,    5,    6,   15,   21,   24,    0,    5,    6,
	   15,   21,   24,   44,    0,    7,    0,    8,    9,   56,   58,   65,
	   70,   57,   58,   58,    0,    8,    9,   56,   58,   65,   70,   57,
	   58,   58,    0,   55,   10,    0,   55,   10,    0,   12,    0,    1,
	    2,   13,   18,   31,   36,   14,   18,   18,    0,    5,    6,   15,
	   21,   24,   42,   14,    0,    5,    6,   15,   21,   24,   14,    0,
	    8,    9,   56,   41,   58,   65,   70,   57,   58,   58,    0,   17,
	    0,    1,    2,   13,   18,   31,   36,   14,   18,   18,    0,    5,
	    6,   19,   15,   21,   24,   18,   20,   29,   18,   18,   18,    0,
	   18,   20,   29,   18,   18,    0,    5,    6,   19,   15,   21,   24,
	   18,   26,   20,   29,   18,   18,   18,    0,   22,    0,    8,    9,
	   56,   58,   65,   70,   57,   58,   58,    0,   58,   59,   63,   58,
	   58,    0,    8,    9,   56,   25,   58,   65,   70,   57,   58,   58,
	    0,    8,    9,   56,   58,   65,   70,   57,   58,   58,    0,    5,
	    6,   19,   15,   21,   24,   18,   20,   27,   29,   18,   18,   18,
	    0,    5,    6,   19,   15,   21,   24,   18,   20,   28,   29,   18,
	   18,   18,    0,    5,    6,   19,   15,   21,   24,   18,   20,   29,
	   18,   18,   18,   18,    0,    5,    6,   19,   15,   21,   24,   18,
	   20,   30,   29,   18,   18,   18,    0,    5,    6,   19,   15,   21,
	   24,   18,   20,   29,   28,   18,   18,   18,    0,    5,    6,   19,
	   15,   21,   24,   18,   32,   20,   29,   18,   18,   18,    0,    5,
	    6,   19,   15,   21,   24,   18,   20,   33,   29,   18,   18,   18,
	    0,    5,    6,   19,   15,   21,   24,   18,   20,   34,   29,   18,
	   18,   18,    0,    5,    6,   19,   15,   21,   24,   18,   35,   20,
	   29,   18,   18,   18,    0,    5,    6,   15,   21,   24,    0,    5,
	    6,   19,   15,   21,   24,   18,   20,   37,   29,   18,   18,   18,
	    0,    5,    6,   19,   15,   21,   24,   18,   20,   29,   38,   18,
	   18,   18,    0,    5,    6,   19,   15,   21,   24,   18,   39,   20,
	   29,   18,   18,   18,    0,    5,    6,   15,   21,   24,    0,   74,
	   74,   74,    0,    8,    9,   56,   58,   65,   70,   57,   58,   58,
	    0,   43,   43,   43,    0,    5,    6,   15,   21,   24,   43,   43,
	   43,    0,   45,    0,   46,    0,   46,   47,   58,   59,   63,   58,
	   58,    0,   47,   48,   51,   52,    0,   50,   49,    0,   50,   49,
	    0,   50,   47,   75,    0,   50,   47,   75,   53,   52,    0,   50,
	   47,   75,   52,    0,   54,   54,   54,    0,   50,   47,   75,   54,
	   54,   54,    0,   55,   11,   16,    0,   55,   11,   40,   16,   57,
	    0,   55,   11,   16,   57,    0,   55,   11,   23,   58,   59,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   60,   59,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   59,   61,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   59,   62,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   59,   63,   16,
	   58,   58,   58,   58,    0,   55,   11,   23,   58,   59,   64,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   59,   63,   62,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   66,   59,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   59,   67,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   59,   68,   63,
	   16,   58,   58,   58,    0,   55,   11,   23,   58,   69,   59,   63,
	   16,   58,   58,   58,    0,   55,   11,   16,    0,   55,   11,   23,
	   58,   59,   71,   63,   16,   58,   58,   58,    0,   55,   11,   23,
	   58,   59,   63,   72,   16,   58,   58,   58,    0,   55,   11,   23,
	   58,   73,   59,   63,   16,   58,   58,   58,    0,   55,   11,   16,
	    0,   55,   11,   16,   74,   74,   74,    0,   55,   11,   16,    0,
	    0
	};
}

private static final byte _ssllabs_grading_expression_trans_targs[] = init__ssllabs_grading_expression_trans_targs_0();


private static byte[] init__ssllabs_grading_expression_trans_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    1,    1,    1,    1,    1,    0,   35,    1,
	    0,   29,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    9,   47,   47,   47,   47,
	   47,   47,   47,   47,    0,    0,    1,    1,    1,    1,    1,    1,
	    1,    1,    0,   35,    1,    0,   29,    0,    0,    0,    0,    3,
	   38,   38,   38,   38,   38,   38,   38,   38,    0,   25,   25,   25,
	   25,   25,    0,    0,    0,   25,   25,   25,   25,   25,    0,    0,
	   13,   53,   53,    0,   53,   53,   53,   53,   53,   53,    0,    0,
	    0,    5,   41,   41,   41,   41,   41,   41,   41,   41,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,   27,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    7,   44,
	   44,   44,   44,   44,   44,   44,   44,    0,    0,    0,    0,    0,
	    0,    0,   11,   50,   50,    0,   50,   50,   50,   50,   50,   50,
	    0,   15,   56,   56,   56,   56,   56,   56,   56,   56,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,    0,    0,    0,    0,    0,
	    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,    0,    0,
	    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,
	    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,
	    0,    0,    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,
	   27,    0,    0,    0,    0,    0,    0,    0,    0,   27,   27,    0,
	   27,   27,   27,    0,    0,    0,    0,    0,    0,    0,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,    0,    0,    0,    0,    0,
	    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,    0,    0,
	    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,
	    0,    0,    0,    0,    0,   23,   23,   23,   23,   23,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,    0,    0,    0,    0,    0,
	    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,    0,    0,
	    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,
	    0,    0,    0,    0,    0,   21,   21,   21,   21,   21,    0,    0,
	    0,    0,    0,   17,   59,   59,   59,   59,   59,   59,   59,   59,
	    0,    0,    0,    0,    0,   25,   25,   25,   25,   25,    0,    0,
	    0,    0,    0,    0,   19,    0,    0,   31,    0,    0,    0,    0,
	    0,    0,    0,    1,    1,    1,    0,   35,    1,    0,   29,    0,
	    0,    0,    0,    0,    0,   25,   25,   25,    0,    0,    0,   25,
	   25,   25,    0,    0,    0,    0,    0,    0,   25,   25,   25,    0,
	    0,    0,    0,    0,    0,    0,    0,   25,   25,    0,   25,    0,
	    0,   25,   25,   25,    0,    0,   27,   27,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,
	   27,    0,    0,    0,    0,   23,   23,   23,    0,   27,   27,    0,
	    0,    0,    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,
	    0,    0,    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,
	    0,    0,    0,    0,   27,    0,    0,    0,    0,   21,   21,   21,
	    0,   25,   25,   25,    0,    0,    0,    0,   33,   33,   33,    0,
	    0
	};
}

private static final byte _ssllabs_grading_expression_trans_actions[] = init__ssllabs_grading_expression_trans_actions_0();


private static byte[] init__ssllabs_grading_expression_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,   25,   25,   27,   27,
	   27,   27,   27,   27,   27,   27,   27,   27,   27,   23,   27,   27,
	   27,   21,   25,   33
	};
}

private static final byte _ssllabs_grading_expression_eof_actions[] = init__ssllabs_grading_expression_eof_actions_0();


static final int ssllabs_grading_expression_start = 1;
static final int ssllabs_grading_expression_first_final = 55;
static final int ssllabs_grading_expression_error = 0;

static final int ssllabs_grading_expression_en_main = 1;


// line 129 "ExpressionParser.rl"

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

        
// line 330 "ExpressionParser.java"
	{
	cs = ssllabs_grading_expression_start;
	}

// line 145 "ExpressionParser.rl"
        
// line 337 "ExpressionParser.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _ssllabs_grading_expression_key_offsets[cs];
	_trans = _ssllabs_grading_expression_index_offsets[cs];
	_klen = _ssllabs_grading_expression_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _ssllabs_grading_expression_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _ssllabs_grading_expression_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _ssllabs_grading_expression_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _ssllabs_grading_expression_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _ssllabs_grading_expression_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	cs = _ssllabs_grading_expression_trans_targs[_trans];

	if ( _ssllabs_grading_expression_trans_actions[_trans] != 0 ) {
		_acts = _ssllabs_grading_expression_trans_actions[_trans];
		_nacts = (int) _ssllabs_grading_expression_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _ssllabs_grading_expression_actions[_acts++] )
			{
	case 0:
// line 8 "ExpressionParser.rl"
	{
        start = p;
    }
	break;
	case 1:
// line 12 "ExpressionParser.rl"
	{
    }
	break;
	case 2:
// line 15 "ExpressionParser.rl"
	{
    }
	break;
	case 3:
// line 18 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.eq);
    }
	break;
	case 4:
// line 22 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.neq);
    }
	break;
	case 5:
// line 26 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.gt);
    }
	break;
	case 6:
// line 30 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.lt);
    }
	break;
	case 7:
// line 34 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.gte);
    }
	break;
	case 8:
// line 38 "ExpressionParser.rl"
	{;
        expression.pushOperator(Operator.lte);
    }
	break;
	case 9:
// line 42 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.in);
    }
	break;
	case 10:
// line 46 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.TRUE);
    }
	break;
	case 11:
// line 50 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.FALSE);
    }
	break;
	case 12:
// line 54 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
        if (s.startsWith("0x")) {
            expression.pushOperand(Integer.valueOf(s.substring(2), 16));
        } else {
            expression.pushOperand(Integer.valueOf(s));
        }
    }
	break;
	case 13:
// line 63 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
        expression.pushOperand(new Reference(s));
    }
	break;
	case 14:
// line 68 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
        expression.pushOperand(s);
    }
	break;
	case 15:
// line 73 "ExpressionParser.rl"
	{
        listNeedle = expression.popOperand();
        expression.pushOperand(Expression.LIST_TERMINATOR);
    }
	break;
	case 16:
// line 78 "ExpressionParser.rl"
	{
        expression.pushOperand(listNeedle);
    }
	break;
// line 524 "ExpressionParser.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	int __acts = _ssllabs_grading_expression_eof_actions[cs];
	int __nacts = (int) _ssllabs_grading_expression_actions[__acts++];
	while ( __nacts-- > 0 ) {
		switch ( _ssllabs_grading_expression_actions[__acts++] ) {
	case 10:
// line 46 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.TRUE);
    }
	break;
	case 11:
// line 50 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.FALSE);
    }
	break;
	case 12:
// line 54 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
        if (s.startsWith("0x")) {
            expression.pushOperand(Integer.valueOf(s.substring(2), 16));
        } else {
            expression.pushOperand(Integer.valueOf(s));
        }
    }
	break;
	case 13:
// line 63 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
        expression.pushOperand(new Reference(s));
    }
	break;
	case 16:
// line 78 "ExpressionParser.rl"
	{
        expression.pushOperand(listNeedle);
    }
	break;
// line 581 "ExpressionParser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 146 "ExpressionParser.rl"

        if (cs < 55) {
            throw new RuntimeException("Syntax error at position " + p);
        }

        return expression;
    }

    public static boolean evaluate(String text) {
        Expression expression = ExpressionParser.parse(text);
        return expression.evaluate();
    }

    public static boolean evaluate(String text, Map<String, Object> model) {
        Expression expression = ExpressionParser.parse(text);
        return expression.evaluate(model);
    }
}