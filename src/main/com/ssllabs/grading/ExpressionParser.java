
// line 1 "ExpressionParser.rl"
package com.ssllabs.grading;


// line 114 "ExpressionParser.rl"


public class ExpressionParser {

    
// line 13 "ExpressionParser.java"
private static byte[] init__ssllabs_grading_expression_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,
	    5,    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,
	   11,    1,   12,    1,   13,    1,   14,    1,   15,    2,    1,    0,
	    2,    2,    0,    2,    3,    0,    2,    4,    0,    2,    5,    0,
	    2,    6,    0,    2,    7,    0,    2,    8,    0,    2,    9,   14,
	    2,   13,    9
	};
}

private static final byte _ssllabs_grading_expression_actions[] = init__ssllabs_grading_expression_actions_0();


private static short[] init__ssllabs_grading_expression_key_offsets_0()
{
	return new short [] {
	    0,    0,   12,   15,   21,   22,   34,   46,   49,   50,   62,   71,
	   79,   92,   93,  105,  121,  128,  145,  146,  158,  165,  178,  190,
	  207,  224,  241,  248,  253,  256,  259,  265,  270,  276,  285,  286,
	  288,  290,  307,  324,  342,  359,  376,  393,  410,  427,  433,  450,
	  467,  484,  490,  496,  508,  514,  526,  529,  535,  540,  553,  567,
	  581,  595,  610,  624,  638,  652,  666,  680,  694,  697,  711,  725,
	  739,  742,  745
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
	   57,   34,   32,  126,   32,   44,   93,   32,   44,   93,  120,   48,
	   57,   32,   44,   93,   48,   57,   48,   57,   65,   70,   97,  102,
	   32,   44,   93,   48,   57,   65,   70,   97,  102,  110,   32,   91,
	   32,   91,   32,   33,   46,   60,   61,   62,   95,  102,  105,  114,
	  116,   48,   57,   65,   90,   97,  122,   32,   33,   46,   60,   61,
	   62,   95,  102,  105,  116,  117,   48,   57,   65,   90,   97,  122,
	   32,   33,   46,   60,   61,   62,   95,  102,  105,  116,   48,   57,
	   65,   90,   97,  100,  103,  122,   32,   33,   46,   60,   61,   62,
	   95,  102,  105,  115,  116,   48,   57,   65,   90,   97,  122,   32,
	   33,   46,   60,   61,   62,   95,   97,  102,  105,  116,   48,   57,
	   65,   90,   98,  122,   32,   33,   46,   60,   61,   62,   95,  102,
	  105,  108,  116,   48,   57,   65,   90,   97,  122,   32,   33,   46,
	   60,   61,   62,   95,  102,  105,  115,  116,   48,   57,   65,   90,
	   97,  122,   32,   33,   46,   60,   61,   62,   95,  101,  102,  105,
	  116,   48,   57,   65,   90,   97,  122,   32,   33,   60,   61,   62,
	  105,   32,   33,   46,   60,   61,   62,   95,  102,  105,  114,  116,
	   48,   57,   65,   90,   97,  122,   32,   33,   46,   60,   61,   62,
	   95,  102,  105,  116,  117,   48,   57,   65,   90,   97,  122,   32,
	   33,   46,   60,   61,   62,   95,  101,  102,  105,  116,   48,   57,
	   65,   90,   97,  122,   32,   33,   60,   61,   62,  105,   48,   57,
	   65,   70,   97,  102,   32,   34,   48,   95,  102,  116,   49,   57,
	   65,   90,   97,  122,   48,   57,   65,   70,   97,  102,   32,   33,
	   60,   61,   62,  105,   48,   57,   65,   70,   97,  102,   32,   38,
	  124,   32,   38,  120,  124,   48,   57,   32,   38,  124,   48,   57,
	   32,   38,   46,   95,  102,  116,  124,   48,   57,   65,   90,   97,
	  122,   32,   38,   46,   95,   97,  102,  116,  124,   48,   57,   65,
	   90,   98,  122,   32,   38,   46,   95,  102,  108,  116,  124,   48,
	   57,   65,   90,   97,  122,   32,   38,   46,   95,  102,  115,  116,
	  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,   95,  102,
	  116,  124,   48,   57,   65,   90,   97,  100,  103,  122,   32,   38,
	   46,   95,  102,  114,  116,  124,   48,   57,   65,   90,   97,  122,
	   32,   38,   46,   95,  102,  116,  117,  124,   48,   57,   65,   90,
	   97,  122,   32,   38,   46,   95,   97,  102,  116,  124,   48,   57,
	   65,   90,   98,  122,   32,   38,   46,   95,  102,  108,  116,  124,
	   48,   57,   65,   90,   97,  122,   32,   38,   46,   95,  102,  115,
	  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,   46,   95,
	  101,  102,  116,  124,   48,   57,   65,   90,   97,  122,   32,   38,
	  124,   32,   38,   46,   95,  102,  114,  116,  124,   48,   57,   65,
	   90,   97,  122,   32,   38,   46,   95,  102,  116,  117,  124,   48,
	   57,   65,   90,   97,  122,   32,   38,   46,   95,  101,  102,  116,
	  124,   48,   57,   65,   90,   97,  122,   32,   38,  124,   32,   38,
	  124,   32,   38,  124,   48,   57,   65,   70,   97,  102,    0
	};
}

private static final char _ssllabs_grading_expression_trans_keys[] = init__ssllabs_grading_expression_trans_keys_0();


private static byte[] init__ssllabs_grading_expression_single_lengths_0()
{
	return new byte [] {
	    0,    6,    1,    6,    1,    6,    6,    1,    1,    6,    7,    6,
	    7,    1,    6,   10,    3,   11,    1,    6,    3,    7,    6,   11,
	   11,   11,    7,    3,    1,    3,    4,    3,    0,    3,    1,    2,
	    2,   11,   11,   10,   11,   11,   11,   11,   11,    6,   11,   11,
	   11,    6,    0,    6,    0,    6,    3,    4,    3,    7,    8,    8,
	    8,    7,    8,    8,    8,    8,    8,    8,    3,    8,    8,    8,
	    3,    3,    3
	};
}

private static final byte _ssllabs_grading_expression_single_lengths[] = init__ssllabs_grading_expression_single_lengths_0();


private static byte[] init__ssllabs_grading_expression_range_lengths_0()
{
	return new byte [] {
	    0,    3,    1,    0,    0,    3,    3,    1,    0,    3,    1,    1,
	    3,    0,    3,    3,    2,    3,    0,    3,    2,    3,    3,    3,
	    3,    3,    0,    1,    1,    0,    1,    1,    3,    3,    0,    0,
	    0,    3,    3,    4,    3,    3,    3,    3,    3,    0,    3,    3,
	    3,    0,    3,    3,    3,    3,    0,    1,    1,    3,    3,    3,
	    3,    4,    3,    3,    3,    3,    3,    3,    0,    3,    3,    3,
	    0,    0,    3
	};
}

private static final byte _ssllabs_grading_expression_range_lengths[] = init__ssllabs_grading_expression_range_lengths_0();


private static short[] init__ssllabs_grading_expression_index_offsets_0()
{
	return new short [] {
	    0,    0,   10,   13,   20,   22,   32,   42,   45,   47,   57,   66,
	   74,   85,   87,   97,  111,  117,  132,  134,  144,  150,  161,  171,
	  186,  201,  216,  224,  229,  232,  236,  242,  247,  251,  258,  260,
	  263,  266,  281,  296,  311,  326,  341,  356,  371,  386,  393,  408,
	  423,  438,  445,  449,  459,  463,  473,  477,  483,  488,  499,  511,
	  523,  535,  547,  559,  571,  583,  595,  607,  619,  623,  635,  647,
	  659,  663,  667
	};
}

private static final short _ssllabs_grading_expression_index_offsets[] = init__ssllabs_grading_expression_index_offsets_0();


private static byte[] init__ssllabs_grading_expression_trans_targs_0()
{
	return new byte [] {
	    1,    2,   10,   15,   41,   46,   11,   15,   15,    0,    3,    2,
	    0,    3,    4,   12,   18,   21,   34,    0,    5,    0,    6,    7,
	   55,   57,   64,   69,   56,   57,   57,    0,    6,    7,   55,   57,
	   64,   69,   56,   57,   57,    0,   54,    7,    0,    9,    0,    1,
	    2,   10,   15,   41,   46,   11,   15,   15,    0,    3,    4,   12,
	   18,   21,   34,   52,   11,    0,    3,    4,   12,   18,   21,   34,
	   11,    0,    6,    7,   55,   51,   57,   64,   69,   56,   57,   57,
	    0,   14,    0,    1,    2,   10,   15,   41,   46,   11,   15,   15,
	    0,    3,    4,   16,   12,   18,   21,   15,   17,   24,   37,   15,
	   15,   15,    0,   15,   17,   37,   15,   15,    0,    3,    4,   16,
	   12,   18,   21,   15,   23,   17,   24,   37,   15,   15,   15,    0,
	   19,    0,    6,    7,   55,   57,   64,   69,   56,   57,   57,    0,
	   57,   58,   62,   57,   57,    0,    6,    7,   55,   22,   57,   64,
	   69,   56,   57,   57,    0,    6,    7,   55,   57,   64,   69,   56,
	   57,   57,    0,    3,    4,   16,   12,   18,   21,   15,   17,   24,
	   40,   37,   15,   15,   15,    0,    3,    4,   16,   12,   18,   21,
	   15,   17,   24,   25,   37,   15,   15,   15,    0,   26,    4,   16,
	   12,   18,   21,   27,   15,   17,   24,   37,   15,   15,   15,    0,
	   26,    4,   12,   18,   21,   27,   34,    0,   27,   28,   30,   31,
	    0,   29,   28,    0,   29,   27,   73,    0,   29,   27,   73,   32,
	   31,    0,   29,   27,   73,   31,    0,   33,   33,   33,    0,   29,
	   27,   73,   33,   33,   33,    0,   35,    0,   36,   27,    0,   36,
	   27,    0,    3,    4,   16,   12,   18,   21,   15,   17,   24,   38,
	   37,   15,   15,   15,    0,    3,    4,   16,   12,   18,   21,   15,
	   17,   24,   37,   39,   15,   15,   15,    0,    3,    4,   16,   12,
	   18,   21,   15,   17,   24,   37,   15,   15,   15,   15,    0,    3,
	    4,   16,   12,   18,   21,   15,   17,   24,   39,   37,   15,   15,
	   15,    0,    3,    4,   16,   12,   18,   21,   15,   42,   17,   24,
	   37,   15,   15,   15,    0,    3,    4,   16,   12,   18,   21,   15,
	   17,   24,   43,   37,   15,   15,   15,    0,    3,    4,   16,   12,
	   18,   21,   15,   17,   24,   44,   37,   15,   15,   15,    0,    3,
	    4,   16,   12,   18,   21,   15,   45,   17,   24,   37,   15,   15,
	   15,    0,    3,    4,   12,   18,   21,   34,    0,    3,    4,   16,
	   12,   18,   21,   15,   17,   24,   47,   37,   15,   15,   15,    0,
	    3,    4,   16,   12,   18,   21,   15,   17,   24,   37,   48,   15,
	   15,   15,    0,    3,    4,   16,   12,   18,   21,   15,   49,   17,
	   24,   37,   15,   15,   15,    0,    3,    4,   12,   18,   21,   34,
	    0,   74,   74,   74,    0,    6,    7,   55,   57,   64,   69,   56,
	   57,   57,    0,   53,   53,   53,    0,    3,    4,   12,   18,   21,
	   34,   53,   53,   53,    0,   54,    8,   13,    0,   54,    8,   50,
	   13,   56,    0,   54,    8,   13,   56,    0,   54,    8,   20,   57,
	   58,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   59,
	   58,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   58,
	   60,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   58,
	   61,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   58,
	   62,   13,   57,   57,   57,   57,    0,   54,    8,   20,   57,   58,
	   63,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   58,
	   62,   61,   13,   57,   57,   57,    0,   54,    8,   20,   57,   65,
	   58,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   58,
	   66,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   58,
	   67,   62,   13,   57,   57,   57,    0,   54,    8,   20,   57,   68,
	   58,   62,   13,   57,   57,   57,    0,   54,    8,   13,    0,   54,
	    8,   20,   57,   58,   70,   62,   13,   57,   57,   57,    0,   54,
	    8,   20,   57,   58,   62,   71,   13,   57,   57,   57,    0,   54,
	    8,   20,   57,   72,   58,   62,   13,   57,   57,   57,    0,   54,
	    8,   13,    0,   54,    8,   13,    0,   54,    8,   13,   74,   74,
	   74,    0,    0
	};
}

private static final byte _ssllabs_grading_expression_trans_targs[] = init__ssllabs_grading_expression_trans_targs_0();


private static byte[] init__ssllabs_grading_expression_trans_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    1,    1,    1,    1,    1,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    9,   42,
	   42,   42,   42,   42,   42,   42,   42,    0,    0,    1,    1,    1,
	    1,    1,    1,    1,    1,    0,    0,    0,    0,    0,    0,    3,
	   33,   33,   33,   33,   33,   33,   33,   33,    0,   25,   25,   25,
	   25,   25,   25,    0,    0,    0,   25,   25,   25,   25,   25,   25,
	    0,    0,   13,   48,   48,    0,   48,   48,   48,   48,   48,   48,
	    0,    0,    0,    5,   36,   36,   36,   36,   36,   36,   36,   36,
	    0,   27,   27,    0,   27,   27,   27,    0,    0,   27,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,   27,   27,    0,
	   27,   27,   27,    0,    0,    0,   27,    0,    0,    0,    0,    0,
	    0,    0,    7,   39,   39,   39,   39,   39,   39,   39,   39,    0,
	    0,    0,    0,    0,    0,    0,   11,   45,   45,    0,   45,   45,
	   45,   45,   45,   45,    0,   15,   51,   51,   51,   51,   51,   51,
	   51,   51,    0,   27,   27,    0,   27,   27,   27,    0,    0,   27,
	    0,    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,   27,
	    0,    0,   27,    0,    0,    0,    0,    0,    0,   60,   27,    0,
	   27,   27,   27,   57,    0,    0,   27,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,   29,    0,    0,    0,    1,    1,    1,
	    0,    0,    0,    0,    0,    0,    0,    0,   25,   25,   25,    0,
	    0,    0,   25,   25,   25,    0,    0,    0,    0,    0,    0,   25,
	   25,   25,    0,    0,    0,    0,    0,    0,   19,   57,    0,    0,
	   29,    0,   27,   27,    0,   27,   27,   27,    0,    0,   27,    0,
	    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,
	    0,   27,    0,    0,    0,    0,    0,    0,   27,   27,    0,   27,
	   27,   27,    0,    0,   27,    0,    0,    0,    0,    0,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,   27,    0,    0,    0,    0,
	    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,   27,
	    0,    0,    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,
	    0,   27,    0,    0,    0,    0,    0,    0,   27,   27,    0,   27,
	   27,   27,    0,    0,   27,    0,    0,    0,    0,    0,    0,   27,
	   27,    0,   27,   27,   27,    0,    0,    0,   27,    0,    0,    0,
	    0,    0,   23,   23,   23,   23,   23,   23,    0,   27,   27,    0,
	   27,   27,   27,    0,    0,   27,    0,    0,    0,    0,    0,    0,
	   27,   27,    0,   27,   27,   27,    0,    0,   27,    0,    0,    0,
	    0,    0,    0,   27,   27,    0,   27,   27,   27,    0,    0,    0,
	   27,    0,    0,    0,    0,    0,   21,   21,   21,   21,   21,   21,
	    0,    0,    0,    0,    0,   17,   54,   54,   54,   54,   54,   54,
	   54,   54,    0,    0,    0,    0,    0,   25,   25,   25,   25,   25,
	   25,    0,    0,    0,    0,    0,    0,    0,    0,   25,   25,    0,
	   25,    0,    0,   25,   25,   25,    0,    0,   27,   27,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,   27,    0,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   27,   27,    0,    0,    0,
	    0,    0,   27,    0,    0,    0,    0,   23,   23,   23,    0,   27,
	   27,    0,    0,    0,    0,    0,   27,    0,    0,    0,    0,   27,
	   27,    0,    0,    0,    0,    0,   27,    0,    0,    0,    0,   27,
	   27,    0,    0,    0,    0,    0,   27,    0,    0,    0,    0,   21,
	   21,   21,    0,   31,   31,   31,    0,   25,   25,   25,    0,    0,
	    0,    0,    0
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
	    0,    0,    0,    0,    0,    0,    0,   25,   25,   27,   27,   27,
	   27,   27,   27,   27,   27,   27,   27,   27,   23,   27,   27,   27,
	   21,   31,   25
	};
}

private static final byte _ssllabs_grading_expression_eof_actions[] = init__ssllabs_grading_expression_eof_actions_0();


static final int ssllabs_grading_expression_start = 1;
static final int ssllabs_grading_expression_first_final = 54;
static final int ssllabs_grading_expression_error = 0;

static final int ssllabs_grading_expression_en_main = 1;


// line 119 "ExpressionParser.rl"

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

        
// line 337 "ExpressionParser.java"
	{
	cs = ssllabs_grading_expression_start;
	}

// line 135 "ExpressionParser.rl"
        
// line 344 "ExpressionParser.java"
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
        listNeedle = expression.popOperand();
        expression.pushOperand(Expression.LIST_TERMINATOR);
        System.err.println("List start");
    }
	break;
	case 15:
// line 71 "ExpressionParser.rl"
	{
        expression.pushOperand(listNeedle);
        System.err.println("List end");
    }
	break;
// line 525 "ExpressionParser.java"
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
	case 15:
// line 71 "ExpressionParser.rl"
	{
        expression.pushOperand(listNeedle);
        System.err.println("List end");
    }
	break;
// line 582 "ExpressionParser.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 136 "ExpressionParser.rl"

        if (cs < 54) {
            throw new RuntimeException("Syntax error at position " + p);
        }

        return expression;
    }

    public static boolean evaluate(String text) {
        Expression expression = ExpressionParser.parse(text);
        return expression.evaluate();
    }
}