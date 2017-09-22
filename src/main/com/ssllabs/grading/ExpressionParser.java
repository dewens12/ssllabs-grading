
// line 1 "ExpressionParser.rl"
package com.ssllabs.grading;


// line 117 "ExpressionParser.rl"


public class ExpressionParser {

    
// line 13 "ExpressionParser.java"
private static byte[] init__ssllabs_grading_expression_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,
	    5,    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,
	   11,    1,   12,    1,   13,    1,   14,    1,   15,    1,   16,    2,
	    0,   14,    2,    1,    0,    2,    2,    0,    2,    3,    0,    2,
	    4,    0,    2,    5,    0,    2,    6,    0,    2,    7,    0,    2,
	    8,    0,    2,    9,   15,    2,   13,    9
	};
}

private static final byte _ssllabs_grading_expression_actions[] = init__ssllabs_grading_expression_actions_0();


private static short[] init__ssllabs_grading_expression_key_offsets_0()
{
	return new short [] {
	    0,    0,   12,   15,   18,   24,   25,   37,   49,   52,   55,   56,
	   68,   77,   85,   98,   99,  111,  127,  134,  151,  152,  164,  171,
	  184,  196,  213,  230,  247,  254,  259,  262,  265,  268,  274,  279,
	  285,  294,  295,  297,  299,  316,  333,  351,  368,  385,  402,  419,
	  436,  442,  459,  476,  493,  499,  505,  517,  523,  535,  538,  544,
	  549,  562,  576,  590,  604,  619,  633,  647,  661,  675,  689,  703,
	  706,  720,  734,  748,  751,  754
	};
}

private static final short _ssllabs_grading_expression_key_offsets[] = init__ssllabs_grading_expression_key_offsets_0();


private static char[] init__ssllabs_grading_expression_trans_keys_0()
{
	return new char [] {
	   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,   97,  122,
	   34,   32,  126,   34,   32,  126,   32,   33,   60,   61,   62,  105,
	   61,   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,   97,
	  122,   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,   97,
	  122,   34,   32,  126,   34,   32,  126,   38,   32,   34,   48,   95,
	  102,  116,   49,   57,   65,   90,   97,  122,   32,   33,   60,   61,
	   62,  105,  120,   48,   57,   32,   33,   60,   61,   62,  105,   48,
	   57,   32,   34,   48,   61,   95,  102,  116,   49,   57,   65,   90,
	   97,  122,  124,   32,   34,   48,   95,  102,  116,   49,   57,   65,
	   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,  102,  105,
	  116,   48,   57,   65,   90,   97,  122,   95,  102,  116,   65,   90,
	   97,  122,   32,   33,   46,   60,   61,   62,   95,   97,  102,  105,
	  116,   48,   57,   65,   90,   98,  122,   61,   32,   34,   48,   95,
	  102,  116,   49,   57,   65,   90,   97,  122,   95,  102,  116,   65,
	   90,   97,  122,   32,   34,   48,   61,   95,  102,  116,   49,   57,
	   65,   90,   97,  122,   32,   34,   48,   95,  102,  116,   49,   57,
	   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,  102,
	  105,  108,  116,   48,   57,   65,   90,   97,  122,   32,   33,   46,
	   60,   61,   62,   95,  102,  105,  110,  116,   48,   57,   65,   90,
	   97,  122,   32,   33,   46,   60,   61,   62,   91,   95,  102,  105,
	  116,   48,   57,   65,   90,   97,  122,   32,   33,   60,   61,   62,
	   91,  105,   32,   34,   48,   49,   57,   34,   32,  126,   34,   32,
	  126,   32,   44,   93,   32,   44,   93,  120,   48,   57,   32,   44,
	   93,   48,   57,   48,   57,   65,   70,   97,  102,   32,   44,   93,
	   48,   57,   65,   70,   97,  102,  110,   32,   91,   32,   91,   32,
	   33,   46,   60,   61,   62,   95,  102,  105,  114,  116,   48,   57,
	   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,  102,
	  105,  116,  117,   48,   57,   65,   90,   97,  122,   32,   33,   46,
	   60,   61,   62,   95,  102,  105,  116,   48,   57,   65,   90,   97,
	  100,  103,  122,   32,   33,   46,   60,   61,   62,   95,  102,  105,
	  115,  116,   48,   57,   65,   90,   97,  122,   32,   33,   46,   60,
	   61,   62,   95,   97,  102,  105,  116,   48,   57,   65,   90,   98,
	  122,   32,   33,   46,   60,   61,   62,   95,  102,  105,  108,  116,
	   48,   57,   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,
	   95,  102,  105,  115,  116,   48,   57,   65,   90,   97,  122,   32,
	   33,   46,   60,   61,   62,   95,  101,  102,  105,  116,   48,   57,
	   65,   90,   97,  122,   32,   33,   60,   61,   62,  105,   32,   33,
	   46,   60,   61,   62,   95,  102,  105,  114,  116,   48,   57,   65,
	   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,  102,  105,
	  116,  117,   48,   57,   65,   90,   97,  122,   32,   33,   46,   60,
	   61,   62,   95,  101,  102,  105,  116,   48,   57,   65,   90,   97,
	  122,   32,   33,   60,   61,   62,  105,   48,   57,   65,   70,   97,
	  102,   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,   97,
	  122,   48,   57,   65,   70,   97,  102,   32,   33,   60,   61,   62,
	  105,   48,   57,   65,   70,   97,  102,   32,   38,  124,   32,   38,
	  120,  124,   48,   57,   32,   38,  124,   48,   57,   32,   38,   46,
	   95,  102,  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,
	   46,   95,   97,  102,  116,  124,   48,   57,   65,   90,   98,  122,
	   32,   38,   46,   95,  102,  108,  116,  124,   48,   57,   65,   90,
	   97,  122,   32,   38,   46,   95,  102,  115,  116,  124,   48,   57,
	   65,   90,   97,  122,   32,   38,   46,   95,  102,  116,  124,   48,
	   57,   65,   90,   97,  100,  103,  122,   32,   38,   46,   95,  102,
	  114,  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,
	   95,  102,  116,  117,  124,   48,   57,   65,   90,   97,  122,   32,
	   38,   46,   95,   97,  102,  116,  124,   48,   57,   65,   90,   98,
	  122,   32,   38,   46,   95,  102,  108,  116,  124,   48,   57,   65,
	   90,   97,  122,   32,   38,   46,   95,  102,  115,  116,  124,   48,
	   57,   65,   90,   97,  122,   32,   38,   46,   95,  101,  102,  116,
	  124,   48,   57,   65,   90,   97,  122,   32,   38,  124,   32,   38,
	   46,   95,  102,  114,  116,  124,   48,   57,   65,   90,   97,  122,
	   32,   38,   46,   95,  102,  116,  117,  124,   48,   57,   65,   90,
	   97,  122,   32,   38,   46,   95,  101,  102,  116,  124,   48,   57,
	   65,   90,   97,  122,   32,   38,  124,   32,   38,  124,   32,   38,
	  124,   48,   57,   65,   70,   97,  102,    0
	};
}

private static final char _ssllabs_grading_expression_trans_keys[] = init__ssllabs_grading_expression_trans_keys_0();


private static byte[] init__ssllabs_grading_expression_single_lengths_0()
{
	return new byte [] {
	    0,    6,    1,    1,    6,    1,    6,    6,    1,    1,    1,    6,
	    7,    6,    7,    1,    6,   10,    3,   11,    1,    6,    3,    7,
	    6,   11,   11,   11,    7,    3,    1,    1,    3,    4,    3,    0,
	    3,    1,    2,    2,   11,   11,   10,   11,   11,   11,   11,   11,
	    6,   11,   11,   11,    6,    0,    6,    0,    6,    3,    4,    3,
	    7,    8,    8,    8,    7,    8,    8,    8,    8,    8,    8,    3,
	    8,    8,    8,    3,    3,    3
	};
}

private static final byte _ssllabs_grading_expression_single_lengths[] = init__ssllabs_grading_expression_single_lengths_0();


private static byte[] init__ssllabs_grading_expression_range_lengths_0()
{
	return new byte [] {
	    0,    3,    1,    1,    0,    0,    3,    3,    1,    1,    0,    3,
	    1,    1,    3,    0,    3,    3,    2,    3,    0,    3,    2,    3,
	    3,    3,    3,    3,    0,    1,    1,    1,    0,    1,    1,    3,
	    3,    0,    0,    0,    3,    3,    4,    3,    3,    3,    3,    3,
	    0,    3,    3,    3,    0,    3,    3,    3,    3,    0,    1,    1,
	    3,    3,    3,    3,    4,    3,    3,    3,    3,    3,    3,    0,
	    3,    3,    3,    0,    0,    3
	};
}

private static final byte _ssllabs_grading_expression_range_lengths[] = init__ssllabs_grading_expression_range_lengths_0();


private static short[] init__ssllabs_grading_expression_index_offsets_0()
{
	return new short [] {
	    0,    0,   10,   13,   16,   23,   25,   35,   45,   48,   51,   53,
	   63,   72,   80,   91,   93,  103,  117,  123,  138,  140,  150,  156,
	  167,  177,  192,  207,  222,  230,  235,  238,  241,  245,  251,  256,
	  260,  267,  269,  272,  275,  290,  305,  320,  335,  350,  365,  380,
	  395,  402,  417,  432,  447,  454,  458,  468,  472,  482,  486,  492,
	  497,  508,  520,  532,  544,  556,  568,  580,  592,  604,  616,  628,
	  632,  644,  656,  668,  672,  676
	};
}

private static final short _ssllabs_grading_expression_index_offsets[] = init__ssllabs_grading_expression_index_offsets_0();


private static byte[] init__ssllabs_grading_expression_trans_targs_0()
{
	return new byte [] {
	    1,    2,   12,   17,   44,   49,   13,   17,   17,    0,    4,    3,
	    0,    4,    3,    0,    4,    5,   14,   20,   23,   37,    0,    6,
	    0,    7,    8,   58,   60,   67,   72,   59,   60,   60,    0,    7,
	    8,   58,   60,   67,   72,   59,   60,   60,    0,   57,    9,    0,
	   57,    9,    0,   11,    0,    1,    2,   12,   17,   44,   49,   13,
	   17,   17,    0,    4,    5,   14,   20,   23,   37,   55,   13,    0,
	    4,    5,   14,   20,   23,   37,   13,    0,    7,    8,   58,   54,
	   60,   67,   72,   59,   60,   60,    0,   16,    0,    1,    2,   12,
	   17,   44,   49,   13,   17,   17,    0,    4,    5,   18,   14,   20,
	   23,   17,   19,   26,   40,   17,   17,   17,    0,   17,   19,   40,
	   17,   17,    0,    4,    5,   18,   14,   20,   23,   17,   25,   19,
	   26,   40,   17,   17,   17,    0,   21,    0,    7,    8,   58,   60,
	   67,   72,   59,   60,   60,    0,   60,   61,   65,   60,   60,    0,
	    7,    8,   58,   24,   60,   67,   72,   59,   60,   60,    0,    7,
	    8,   58,   60,   67,   72,   59,   60,   60,    0,    4,    5,   18,
	   14,   20,   23,   17,   19,   26,   43,   40,   17,   17,   17,    0,
	    4,    5,   18,   14,   20,   23,   17,   19,   26,   27,   40,   17,
	   17,   17,    0,   28,    5,   18,   14,   20,   23,   29,   17,   19,
	   26,   40,   17,   17,   17,    0,   28,    5,   14,   20,   23,   29,
	   37,    0,   29,   30,   33,   34,    0,   32,   31,    0,   32,   31,
	    0,   32,   29,   76,    0,   32,   29,   76,   35,   34,    0,   32,
	   29,   76,   34,    0,   36,   36,   36,    0,   32,   29,   76,   36,
	   36,   36,    0,   38,    0,   39,   29,    0,   39,   29,    0,    4,
	    5,   18,   14,   20,   23,   17,   19,   26,   41,   40,   17,   17,
	   17,    0,    4,    5,   18,   14,   20,   23,   17,   19,   26,   40,
	   42,   17,   17,   17,    0,    4,    5,   18,   14,   20,   23,   17,
	   19,   26,   40,   17,   17,   17,   17,    0,    4,    5,   18,   14,
	   20,   23,   17,   19,   26,   42,   40,   17,   17,   17,    0,    4,
	    5,   18,   14,   20,   23,   17,   45,   19,   26,   40,   17,   17,
	   17,    0,    4,    5,   18,   14,   20,   23,   17,   19,   26,   46,
	   40,   17,   17,   17,    0,    4,    5,   18,   14,   20,   23,   17,
	   19,   26,   47,   40,   17,   17,   17,    0,    4,    5,   18,   14,
	   20,   23,   17,   48,   19,   26,   40,   17,   17,   17,    0,    4,
	    5,   14,   20,   23,   37,    0,    4,    5,   18,   14,   20,   23,
	   17,   19,   26,   50,   40,   17,   17,   17,    0,    4,    5,   18,
	   14,   20,   23,   17,   19,   26,   40,   51,   17,   17,   17,    0,
	    4,    5,   18,   14,   20,   23,   17,   52,   19,   26,   40,   17,
	   17,   17,    0,    4,    5,   14,   20,   23,   37,    0,   77,   77,
	   77,    0,    7,    8,   58,   60,   67,   72,   59,   60,   60,    0,
	   56,   56,   56,    0,    4,    5,   14,   20,   23,   37,   56,   56,
	   56,    0,   57,   10,   15,    0,   57,   10,   53,   15,   59,    0,
	   57,   10,   15,   59,    0,   57,   10,   22,   60,   61,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   62,   61,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   61,   63,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   61,   64,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   61,   65,   15,   60,
	   60,   60,   60,    0,   57,   10,   22,   60,   61,   66,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   61,   65,   64,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   68,   61,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   61,   69,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   61,   70,   65,   15,
	   60,   60,   60,    0,   57,   10,   22,   60,   71,   61,   65,   15,
	   60,   60,   60,    0,   57,   10,   15,    0,   57,   10,   22,   60,
	   61,   73,   65,   15,   60,   60,   60,    0,   57,   10,   22,   60,
	   61,   65,   74,   15,   60,   60,   60,    0,   57,   10,   22,   60,
	   75,   61,   65,   15,   60,   60,   60,    0,   57,   10,   15,    0,
	   57,   10,   15,    0,   57,   10,   15,   77,   77,   77,    0,    0
	};
}

private static final byte _ssllabs_grading_expression_trans_targs[] = init__ssllabs_grading_expression_trans_targs_0();


private static byte[] init__ssllabs_grading_expression_trans_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    1,    1,    1,    1,    1,    0,   35,    1,
	    0,   29,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    9,   47,   47,   47,   47,   47,   47,   47,   47,    0,    0,
	    1,    1,    1,    1,    1,    1,    1,    1,    0,   35,    1,    0,
	   29,    0,    0,    0,    0,    3,   38,   38,   38,   38,   38,   38,
	   38,   38,    0,   25,   25,   25,   25,   25,   25,    0,    0,    0,
	   25,   25,   25,   25,   25,   25,    0,    0,   13,   53,   53,    0,
	   53,   53,   53,   53,   53,   53,    0,    0,    0,    5,   41,   41,
	   41,   41,   41,   41,   41,   41,    0,   27,   27,    0,   27,   27,
	   27,    0,    0,   27,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,
	   27,    0,    0,    0,    0,    0,    0,    0,    7,   44,   44,   44,
	   44,   44,   44,   44,   44,    0,    0,    0,    0,    0,    0,    0,
	   11,   50,   50,    0,   50,   50,   50,   50,   50,   50,    0,   15,
	   56,   56,   56,   56,   56,   56,   56,   56,    0,   27,   27,    0,
	   27,   27,   27,    0,    0,   27,    0,    0,    0,    0,    0,    0,
	   27,   27,    0,   27,   27,   27,    0,    0,   27,    0,    0,    0,
	    0,    0,    0,   65,   27,    0,   27,   27,   27,   62,    0,    0,
	   27,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,   31,
	    0,    0,    0,    1,    1,    1,    0,   35,    1,    0,   29,    0,
	    0,    0,    0,    0,    0,   25,   25,   25,    0,    0,    0,   25,
	   25,   25,    0,    0,    0,    0,    0,    0,   25,   25,   25,    0,
	    0,    0,    0,    0,    0,   19,   62,    0,    0,   31,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,   27,    0,    0,    0,    0,
	    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,   27,    0,
	    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,
	    0,   27,    0,    0,    0,    0,    0,    0,   27,   27,    0,   27,
	   27,   27,    0,    0,   27,    0,    0,    0,    0,    0,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,    0,   27,    0,    0,    0,
	    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,   27,    0,
	    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,
	    0,   27,    0,    0,    0,    0,    0,    0,   27,   27,    0,   27,
	   27,   27,    0,    0,    0,   27,    0,    0,    0,    0,    0,   23,
	   23,   23,   23,   23,   23,    0,   27,   27,    0,   27,   27,   27,
	    0,    0,   27,    0,    0,    0,    0,    0,    0,   27,   27,    0,
	   27,   27,   27,    0,    0,   27,    0,    0,    0,    0,    0,    0,
	   27,   27,    0,   27,   27,   27,    0,    0,    0,   27,    0,    0,
	    0,    0,    0,   21,   21,   21,   21,   21,   21,    0,    0,    0,
	    0,    0,   17,   59,   59,   59,   59,   59,   59,   59,   59,    0,
	    0,    0,    0,    0,   25,   25,   25,   25,   25,   25,    0,    0,
	    0,    0,    0,    0,    0,    0,   25,   25,    0,   25,    0,    0,
	   25,   25,   25,    0,    0,   27,   27,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,   27,    0,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   27,   27,    0,    0,    0,    0,    0,   27,
	    0,    0,    0,    0,   23,   23,   23,    0,   27,   27,    0,    0,
	    0,    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,
	    0,    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,
	    0,    0,    0,   27,    0,    0,    0,    0,   21,   21,   21,    0,
	   33,   33,   33,    0,   25,   25,   25,    0,    0,    0,    0,    0
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
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,   25,   25,
	   27,   27,   27,   27,   27,   27,   27,   27,   27,   27,   27,   23,
	   27,   27,   27,   21,   33,   25
	};
}

private static final byte _ssllabs_grading_expression_eof_actions[] = init__ssllabs_grading_expression_eof_actions_0();


static final int ssllabs_grading_expression_start = 1;
static final int ssllabs_grading_expression_first_final = 57;
static final int ssllabs_grading_expression_error = 0;

static final int ssllabs_grading_expression_en_main = 1;


// line 122 "ExpressionParser.rl"

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

        
// line 338 "ExpressionParser.java"
	{
	cs = ssllabs_grading_expression_start;
	}

// line 138 "ExpressionParser.rl"
        
// line 345 "ExpressionParser.java"
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
// line 6 "ExpressionParser.rl"
	{
        start = p;
    }
	break;
	case 1:
// line 10 "ExpressionParser.rl"
	{
    }
	break;
	case 2:
// line 13 "ExpressionParser.rl"
	{
    }
	break;
	case 3:
// line 16 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.eq);
    }
	break;
	case 4:
// line 20 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.neq);
    }
	break;
	case 5:
// line 24 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.gt);
    }
	break;
	case 6:
// line 28 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.lt);
    }
	break;
	case 7:
// line 32 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.gte);
    }
	break;
	case 8:
// line 36 "ExpressionParser.rl"
	{;
        expression.pushOperator(Operator.lte);
    }
	break;
	case 9:
// line 40 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.in);
    }
	break;
	case 10:
// line 44 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.TRUE);
    }
	break;
	case 11:
// line 48 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.FALSE);
    }
	break;
	case 12:
// line 52 "ExpressionParser.rl"
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
// line 61 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
    }
	break;
	case 14:
// line 65 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start).toLowerCase();
        expression.pushOperand(s);
    }
	break;
	case 15:
// line 70 "ExpressionParser.rl"
	{
        listNeedle = expression.popOperand();
        expression.pushOperand(Expression.LIST_TERMINATOR);
    }
	break;
	case 16:
// line 75 "ExpressionParser.rl"
	{
        expression.pushOperand(listNeedle);
    }
	break;
// line 531 "ExpressionParser.java"
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
// line 44 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.TRUE);
    }
	break;
	case 11:
// line 48 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.FALSE);
    }
	break;
	case 12:
// line 52 "ExpressionParser.rl"
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
// line 61 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
    }
	break;
	case 16:
// line 75 "ExpressionParser.rl"
	{
        expression.pushOperand(listNeedle);
    }
	break;
// line 587 "ExpressionParser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 139 "ExpressionParser.rl"

        if (cs < 57) {
            throw new RuntimeException("Syntax error at position " + p);
        }

        return expression;
    }

    public static boolean evaluate(String text) {
        Expression expression = ExpressionParser.parse(text);
        return expression.evaluate();
    }
}