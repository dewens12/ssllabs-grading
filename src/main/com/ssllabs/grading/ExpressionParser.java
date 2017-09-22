
// line 1 "ExpressionParser.rl"
package com.ssllabs.grading;


// line 120 "ExpressionParser.rl"


public class ExpressionParser {

    
// line 13 "ExpressionParser.java"
private static byte[] init__ssllabs_grading_expression_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,
	    5,    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,
	   11,    1,   12,    1,   13,    1,   14,    1,   15,    1,   16,    1,
	   17,    2,    2,    1,    2,    3,    1,    2,    4,    1,    2,    5,
	    1,    2,    6,    1,    2,    7,    1,    2,    8,    1,    2,    9,
	    1,    2,   14,   10,    2,   15,   16
	};
}

private static final byte _ssllabs_grading_expression_actions[] = init__ssllabs_grading_expression_actions_0();


private static short[] init__ssllabs_grading_expression_key_offsets_0()
{
	return new short [] {
	    0,    0,   12,   15,   21,   22,   34,   46,   49,   50,   62,   71,
	   79,   92,   93,  105,  121,  128,  145,  146,  158,  165,  178,  190,
	  207,  224,  241,  248,  253,  256,  259,  262,  268,  273,  279,  288,
	  289,  291,  293,  310,  327,  345,  362,  379,  396,  413,  430,  436,
	  453,  470,  487,  493,  499,  511,  517,  529,  532,  538,  543,  556,
	  570,  584,  598,  613,  627,  641,  655,  669,  683,  697,  700,  714,
	  728,  742,  745,  748
	};
}

private static final short _ssllabs_grading_expression_key_offsets[] = init__ssllabs_grading_expression_key_offsets_0();


private static char[] init__ssllabs_grading_expression_trans_keys_0()
{
	return new char [] {
	   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,   97,  122,
	   34,   32,  126,   32,   33,   60,   61,   62,  105,   61,   32,   34,
	   48,   95,  102,  116,   49,   57,   65,   90,   97,  122,   32,   34,
	   48,   95,  102,  116,   49,   57,   65,   90,   97,  122,   34,   32,
	  126,   38,   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,
	   97,  122,   32,   33,   60,   61,   62,  105,  120,   48,   57,   32,
	   33,   60,   61,   62,  105,   48,   57,   32,   34,   48,   61,   95,
	  102,  116,   49,   57,   65,   90,   97,  122,  124,   32,   34,   48,
	   95,  102,  116,   49,   57,   65,   90,   97,  122,   32,   33,   46,
	   60,   61,   62,   95,  102,  105,  116,   48,   57,   65,   90,   97,
	  122,   95,  102,  116,   65,   90,   97,  122,   32,   33,   46,   60,
	   61,   62,   95,   97,  102,  105,  116,   48,   57,   65,   90,   98,
	  122,   61,   32,   34,   48,   95,  102,  116,   49,   57,   65,   90,
	   97,  122,   95,  102,  116,   65,   90,   97,  122,   32,   34,   48,
	   61,   95,  102,  116,   49,   57,   65,   90,   97,  122,   32,   34,
	   48,   95,  102,  116,   49,   57,   65,   90,   97,  122,   32,   33,
	   46,   60,   61,   62,   95,  102,  105,  108,  116,   48,   57,   65,
	   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,  102,  105,
	  110,  116,   48,   57,   65,   90,   97,  122,   32,   33,   46,   60,
	   61,   62,   91,   95,  102,  105,  116,   48,   57,   65,   90,   97,
	  122,   32,   33,   60,   61,   62,   91,  105,   32,   34,   48,   49,
	   57,   34,   32,  126,   32,   44,   93,   32,   44,   93,   32,   44,
	   93,  120,   48,   57,   32,   44,   93,   48,   57,   48,   57,   65,
	   70,   97,  102,   32,   44,   93,   48,   57,   65,   70,   97,  102,
	  110,   32,   91,   32,   91,   32,   33,   46,   60,   61,   62,   95,
	  102,  105,  114,  116,   48,   57,   65,   90,   97,  122,   32,   33,
	   46,   60,   61,   62,   95,  102,  105,  116,  117,   48,   57,   65,
	   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,  102,  105,
	  116,   48,   57,   65,   90,   97,  100,  103,  122,   32,   33,   46,
	   60,   61,   62,   95,  102,  105,  115,  116,   48,   57,   65,   90,
	   97,  122,   32,   33,   46,   60,   61,   62,   95,   97,  102,  105,
	  116,   48,   57,   65,   90,   98,  122,   32,   33,   46,   60,   61,
	   62,   95,  102,  105,  108,  116,   48,   57,   65,   90,   97,  122,
	   32,   33,   46,   60,   61,   62,   95,  102,  105,  115,  116,   48,
	   57,   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,   95,
	  101,  102,  105,  116,   48,   57,   65,   90,   97,  122,   32,   33,
	   60,   61,   62,  105,   32,   33,   46,   60,   61,   62,   95,  102,
	  105,  114,  116,   48,   57,   65,   90,   97,  122,   32,   33,   46,
	   60,   61,   62,   95,  102,  105,  116,  117,   48,   57,   65,   90,
	   97,  122,   32,   33,   46,   60,   61,   62,   95,  101,  102,  105,
	  116,   48,   57,   65,   90,   97,  122,   32,   33,   60,   61,   62,
	  105,   48,   57,   65,   70,   97,  102,   32,   34,   48,   95,  102,
	  116,   49,   57,   65,   90,   97,  122,   48,   57,   65,   70,   97,
	  102,   32,   33,   60,   61,   62,  105,   48,   57,   65,   70,   97,
	  102,   32,   38,  124,   32,   38,  120,  124,   48,   57,   32,   38,
	  124,   48,   57,   32,   38,   46,   95,  102,  116,  124,   48,   57,
	   65,   90,   97,  122,   32,   38,   46,   95,   97,  102,  116,  124,
	   48,   57,   65,   90,   98,  122,   32,   38,   46,   95,  102,  108,
	  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,   95,
	  102,  115,  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,
	   46,   95,  102,  116,  124,   48,   57,   65,   90,   97,  100,  103,
	  122,   32,   38,   46,   95,  102,  114,  116,  124,   48,   57,   65,
	   90,   97,  122,   32,   38,   46,   95,  102,  116,  117,  124,   48,
	   57,   65,   90,   97,  122,   32,   38,   46,   95,   97,  102,  116,
	  124,   48,   57,   65,   90,   98,  122,   32,   38,   46,   95,  102,
	  108,  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,
	   95,  102,  115,  116,  124,   48,   57,   65,   90,   97,  122,   32,
	   38,   46,   95,  101,  102,  116,  124,   48,   57,   65,   90,   97,
	  122,   32,   38,  124,   32,   38,   46,   95,  102,  114,  116,  124,
	   48,   57,   65,   90,   97,  122,   32,   38,   46,   95,  102,  116,
	  117,  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,   95,
	  101,  102,  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,
	  124,   32,   38,  124,   32,   38,  124,   48,   57,   65,   70,   97,
	  102,    0
	};
}

private static final char _ssllabs_grading_expression_trans_keys[] = init__ssllabs_grading_expression_trans_keys_0();


private static byte[] init__ssllabs_grading_expression_single_lengths_0()
{
	return new byte [] {
	    0,    6,    1,    6,    1,    6,    6,    1,    1,    6,    7,    6,
	    7,    1,    6,   10,    3,   11,    1,    6,    3,    7,    6,   11,
	   11,   11,    7,    3,    1,    3,    3,    4,    3,    0,    3,    1,
	    2,    2,   11,   11,   10,   11,   11,   11,   11,   11,    6,   11,
	   11,   11,    6,    0,    6,    0,    6,    3,    4,    3,    7,    8,
	    8,    8,    7,    8,    8,    8,    8,    8,    8,    3,    8,    8,
	    8,    3,    3,    3
	};
}

private static final byte _ssllabs_grading_expression_single_lengths[] = init__ssllabs_grading_expression_single_lengths_0();


private static byte[] init__ssllabs_grading_expression_range_lengths_0()
{
	return new byte [] {
	    0,    3,    1,    0,    0,    3,    3,    1,    0,    3,    1,    1,
	    3,    0,    3,    3,    2,    3,    0,    3,    2,    3,    3,    3,
	    3,    3,    0,    1,    1,    0,    0,    1,    1,    3,    3,    0,
	    0,    0,    3,    3,    4,    3,    3,    3,    3,    3,    0,    3,
	    3,    3,    0,    3,    3,    3,    3,    0,    1,    1,    3,    3,
	    3,    3,    4,    3,    3,    3,    3,    3,    3,    0,    3,    3,
	    3,    0,    0,    3
	};
}

private static final byte _ssllabs_grading_expression_range_lengths[] = init__ssllabs_grading_expression_range_lengths_0();


private static short[] init__ssllabs_grading_expression_index_offsets_0()
{
	return new short [] {
	    0,    0,   10,   13,   20,   22,   32,   42,   45,   47,   57,   66,
	   74,   85,   87,   97,  111,  117,  132,  134,  144,  150,  161,  171,
	  186,  201,  216,  224,  229,  232,  236,  240,  246,  251,  255,  262,
	  264,  267,  270,  285,  300,  315,  330,  345,  360,  375,  390,  397,
	  412,  427,  442,  449,  453,  463,  467,  477,  481,  487,  492,  503,
	  515,  527,  539,  551,  563,  575,  587,  599,  611,  623,  627,  639,
	  651,  663,  667,  671
	};
}

private static final short _ssllabs_grading_expression_index_offsets[] = init__ssllabs_grading_expression_index_offsets_0();


private static byte[] init__ssllabs_grading_expression_trans_targs_0()
{
	return new byte [] {
	    1,    2,   10,   15,   42,   47,   11,   15,   15,    0,    3,    2,
	    0,    3,    4,   12,   18,   21,   35,    0,    5,    0,    6,    7,
	   56,   58,   65,   70,   57,   58,   58,    0,    6,    7,   56,   58,
	   65,   70,   57,   58,   58,    0,   55,    7,    0,    9,    0,    1,
	    2,   10,   15,   42,   47,   11,   15,   15,    0,    3,    4,   12,
	   18,   21,   35,   53,   11,    0,    3,    4,   12,   18,   21,   35,
	   11,    0,    6,    7,   56,   52,   58,   65,   70,   57,   58,   58,
	    0,   14,    0,    1,    2,   10,   15,   42,   47,   11,   15,   15,
	    0,    3,    4,   16,   12,   18,   21,   15,   17,   24,   38,   15,
	   15,   15,    0,   15,   17,   38,   15,   15,    0,    3,    4,   16,
	   12,   18,   21,   15,   23,   17,   24,   38,   15,   15,   15,    0,
	   19,    0,    6,    7,   56,   58,   65,   70,   57,   58,   58,    0,
	   58,   59,   63,   58,   58,    0,    6,    7,   56,   22,   58,   65,
	   70,   57,   58,   58,    0,    6,    7,   56,   58,   65,   70,   57,
	   58,   58,    0,    3,    4,   16,   12,   18,   21,   15,   17,   24,
	   41,   38,   15,   15,   15,    0,    3,    4,   16,   12,   18,   21,
	   15,   17,   24,   25,   38,   15,   15,   15,    0,   26,    4,   16,
	   12,   18,   21,   27,   15,   17,   24,   38,   15,   15,   15,    0,
	   26,    4,   12,   18,   21,   27,   35,    0,   27,   28,   31,   32,
	    0,   29,   28,    0,   30,   27,   74,    0,   30,   27,   74,    0,
	   30,   27,   74,   33,   32,    0,   30,   27,   74,   32,    0,   34,
	   34,   34,    0,   30,   27,   74,   34,   34,   34,    0,   36,    0,
	   37,   27,    0,   37,   27,    0,    3,    4,   16,   12,   18,   21,
	   15,   17,   24,   39,   38,   15,   15,   15,    0,    3,    4,   16,
	   12,   18,   21,   15,   17,   24,   38,   40,   15,   15,   15,    0,
	    3,    4,   16,   12,   18,   21,   15,   17,   24,   38,   15,   15,
	   15,   15,    0,    3,    4,   16,   12,   18,   21,   15,   17,   24,
	   40,   38,   15,   15,   15,    0,    3,    4,   16,   12,   18,   21,
	   15,   43,   17,   24,   38,   15,   15,   15,    0,    3,    4,   16,
	   12,   18,   21,   15,   17,   24,   44,   38,   15,   15,   15,    0,
	    3,    4,   16,   12,   18,   21,   15,   17,   24,   45,   38,   15,
	   15,   15,    0,    3,    4,   16,   12,   18,   21,   15,   46,   17,
	   24,   38,   15,   15,   15,    0,    3,    4,   12,   18,   21,   35,
	    0,    3,    4,   16,   12,   18,   21,   15,   17,   24,   48,   38,
	   15,   15,   15,    0,    3,    4,   16,   12,   18,   21,   15,   17,
	   24,   38,   49,   15,   15,   15,    0,    3,    4,   16,   12,   18,
	   21,   15,   50,   17,   24,   38,   15,   15,   15,    0,    3,    4,
	   12,   18,   21,   35,    0,   75,   75,   75,    0,    6,    7,   56,
	   58,   65,   70,   57,   58,   58,    0,   54,   54,   54,    0,    3,
	    4,   12,   18,   21,   35,   54,   54,   54,    0,   55,    8,   13,
	    0,   55,    8,   51,   13,   57,    0,   55,    8,   13,   57,    0,
	   55,    8,   20,   58,   59,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   60,   59,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   59,   61,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   59,   62,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   59,   63,   13,   58,   58,   58,   58,    0,   55,
	    8,   20,   58,   59,   64,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   59,   63,   62,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   66,   59,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   59,   67,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   59,   68,   63,   13,   58,   58,   58,    0,   55,
	    8,   20,   58,   69,   59,   63,   13,   58,   58,   58,    0,   55,
	    8,   13,    0,   55,    8,   20,   58,   59,   71,   63,   13,   58,
	   58,   58,    0,   55,    8,   20,   58,   59,   63,   72,   13,   58,
	   58,   58,    0,   55,    8,   20,   58,   73,   59,   63,   13,   58,
	   58,   58,    0,   55,    8,   13,    0,   55,    8,   13,    0,   55,
	    8,   13,   75,   75,   75,    0,    0
	};
}

private static final byte _ssllabs_grading_expression_trans_targs[] = init__ssllabs_grading_expression_trans_targs_0();


private static byte[] init__ssllabs_grading_expression_trans_actions_0()
{
	return new byte [] {
	    0,    3,    3,    3,    3,    3,    3,    3,    3,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,   11,   46,
	   46,   46,   46,   46,   46,   46,   46,    0,    0,    3,    3,    3,
	    3,    3,    3,    3,    3,    0,    0,    0,    0,    0,    0,    5,
	   37,   37,   37,   37,   37,   37,   37,   37,    0,   27,   27,   27,
	   27,   27,   27,    0,    0,    0,   27,   27,   27,   27,   27,   27,
	    0,    0,   15,   52,   52,    0,   52,   52,   52,   52,   52,   52,
	    0,    0,    0,    7,   40,   40,   40,   40,   40,   40,   40,   40,
	    0,   29,   29,    0,   29,   29,   29,    0,    0,   29,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,   29,   29,    0,
	   29,   29,   29,    0,    0,    0,   29,    0,    0,    0,    0,    0,
	    0,    0,    9,   43,   43,   43,   43,   43,   43,   43,   43,    0,
	    0,    0,    0,    0,    0,    0,   13,   49,   49,    0,   49,   49,
	   49,   49,   49,   49,    0,   17,   55,   55,   55,   55,   55,   55,
	   55,   55,    0,   29,   29,    0,   29,   29,   29,    0,    0,   29,
	    0,    0,    0,    0,    0,    0,   29,   29,    0,   29,   29,   29,
	    0,    0,   29,    0,    0,    0,    0,    0,    0,   61,   29,    0,
	   29,   29,   29,   21,    0,    0,   29,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    1,    1,    1,
	    0,    0,    0,    0,   31,   31,   64,    0,    0,    0,   33,    0,
	   31,   31,   64,    0,    0,    0,   31,   31,   64,    0,    0,    0,
	    0,    0,    0,   31,   31,   64,    0,    0,    0,    0,    0,    0,
	   21,   21,    0,    0,    0,    0,   29,   29,    0,   29,   29,   29,
	    0,    0,   29,    0,    0,    0,    0,    0,    0,   29,   29,    0,
	   29,   29,   29,    0,    0,   29,    0,    0,    0,    0,    0,    0,
	   29,   29,    0,   29,   29,   29,    0,    0,   29,    0,    0,    0,
	    0,    0,    0,   29,   29,    0,   29,   29,   29,    0,    0,   29,
	    0,    0,    0,    0,    0,    0,   29,   29,    0,   29,   29,   29,
	    0,    0,    0,   29,    0,    0,    0,    0,    0,   29,   29,    0,
	   29,   29,   29,    0,    0,   29,    0,    0,    0,    0,    0,    0,
	   29,   29,    0,   29,   29,   29,    0,    0,   29,    0,    0,    0,
	    0,    0,    0,   29,   29,    0,   29,   29,   29,    0,    0,    0,
	   29,    0,    0,    0,    0,    0,   25,   25,   25,   25,   25,   25,
	    0,   29,   29,    0,   29,   29,   29,    0,    0,   29,    0,    0,
	    0,    0,    0,    0,   29,   29,    0,   29,   29,   29,    0,    0,
	   29,    0,    0,    0,    0,    0,    0,   29,   29,    0,   29,   29,
	   29,    0,    0,    0,   29,    0,    0,    0,    0,    0,   23,   23,
	   23,   23,   23,   23,    0,    0,    0,    0,    0,   19,   58,   58,
	   58,   58,   58,   58,   58,   58,    0,    0,    0,    0,    0,   27,
	   27,   27,   27,   27,   27,    0,    0,    0,    0,    0,    0,    0,
	    0,   27,   27,    0,   27,    0,    0,   27,   27,   27,    0,    0,
	   29,   29,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,   29,    0,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   29,
	   29,    0,    0,    0,    0,    0,   29,    0,    0,    0,    0,   25,
	   25,   25,    0,   29,   29,    0,    0,    0,    0,    0,   29,    0,
	    0,    0,    0,   29,   29,    0,    0,    0,    0,    0,   29,    0,
	    0,    0,    0,   29,   29,    0,    0,    0,    0,    0,   29,    0,
	    0,    0,    0,   23,   23,   23,    0,   35,   35,   35,    0,   27,
	   27,   27,    0,    0,    0,    0,    0
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
	    0,    0,    0,    0,    0,    0,    0,    0,   27,   27,   29,   29,
	   29,   29,   29,   29,   29,   29,   29,   29,   29,   25,   29,   29,
	   29,   23,   35,   27
	};
}

private static final byte _ssllabs_grading_expression_eof_actions[] = init__ssllabs_grading_expression_eof_actions_0();


static final int ssllabs_grading_expression_start = 1;
static final int ssllabs_grading_expression_first_final = 55;
static final int ssllabs_grading_expression_error = 0;

static final int ssllabs_grading_expression_en_main = 1;


// line 125 "ExpressionParser.rl"

    public static Expression parse(String input) {
        char[] data = input.toCharArray();
        int eof = data.length;
        int cs;
        int p = 0;
        int pe = eof;

        int start = 0;
        int tagStart = 0;

        Expression expression = new Expression();

        
// line 336 "ExpressionParser.java"
	{
	cs = ssllabs_grading_expression_start;
	}

// line 139 "ExpressionParser.rl"
        
// line 343 "ExpressionParser.java"
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
        start = p;
    }
	break;
	case 2:
// line 18 "ExpressionParser.rl"
	{
    }
	break;
	case 3:
// line 21 "ExpressionParser.rl"
	{
    }
	break;
	case 4:
// line 24 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.eq);
    }
	break;
	case 5:
// line 28 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.neq);
    }
	break;
	case 6:
// line 32 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.gt);
    }
	break;
	case 7:
// line 36 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.lt);
    }
	break;
	case 8:
// line 40 "ExpressionParser.rl"
	{
        expression.pushOperator(Operator.gte);
    }
	break;
	case 9:
// line 44 "ExpressionParser.rl"
	{;
        expression.pushOperator(Operator.lte);
    }
	break;
	case 10:
// line 48 "ExpressionParser.rl"
	{
    }
	break;
	case 11:
// line 51 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.TRUE);
    }
	break;
	case 12:
// line 55 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.FALSE);
    }
	break;
	case 13:
// line 59 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
        if (s.startsWith("0x")) {
            expression.pushOperand(Integer.valueOf(s.substring(2), 16));
        } else {
            expression.pushOperand(Integer.valueOf(s));
        }
    }
	break;
	case 14:
// line 68 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
    }
	break;
	case 15:
// line 72 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
    }
	break;
	case 16:
// line 76 "ExpressionParser.rl"
	{
    }
	break;
	case 17:
// line 79 "ExpressionParser.rl"
	{
    }
	break;
// line 530 "ExpressionParser.java"
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
	case 11:
// line 51 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.TRUE);
    }
	break;
	case 12:
// line 55 "ExpressionParser.rl"
	{
        expression.pushOperand(Boolean.FALSE);
    }
	break;
	case 13:
// line 59 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
        if (s.startsWith("0x")) {
            expression.pushOperand(Integer.valueOf(s.substring(2), 16));
        } else {
            expression.pushOperand(Integer.valueOf(s));
        }
    }
	break;
	case 14:
// line 68 "ExpressionParser.rl"
	{
        String s = new String(data, start, p - start);
    }
	break;
	case 17:
// line 79 "ExpressionParser.rl"
	{
    }
	break;
// line 585 "ExpressionParser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 140 "ExpressionParser.rl"

        if (cs < 55) {
            throw new RuntimeException("Syntax error at position " + p);
        }

        return expression;
    }

    public static boolean evaluate(String text) {
        Expression expression = ExpressionParser.parse(text);
        return expression.evaluate();
    }
}