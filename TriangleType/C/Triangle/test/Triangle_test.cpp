/*****************************************************************************
 * Copyright (c) 2012-2015, Construx Software, Inc., All Rights Reserved.
 *
 * This code is the exclusive property of Construx Software, Inc. It may ONLY
 * be used by learners during Construx's workshops or by individuals who are
 * being coached by Construx on a project.
 *
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 *******************************************************************************/
/**
 * This testcase class implements the test cases recommended in Myers'
 * "The Art of Software Testing" for the classic triangle problem.
 *
 * @author melvinperez
 *
 */
#include "gtest/gtest.h"

/* This extern "C" declaration is critical to enable mixing C and C++ code */
extern "C" {
#include "Triangle.h"
}

class TriangleTest: public ::testing::Test {

};

/**
 * 1. Do you have a test case that represents a valid scalene triangle?
 * (Note that test cases such as 1, 2, 3 and 2, 5, 10 do not warrant a "yes"
 * answer because there does not exist a triangle having these dimensions.)
 */
TEST(ValidTriangles, Scalene) {
	EXPECT_TRUE(classify(3, 5, 4) == SCALENE);
}

/*
 * 2. Do you have a test case that represents a valid equilateral triangle?
 */
TEST(ValidTriangles, Equilateral) {
	EXPECT_TRUE(classify(3, 3, 3) == EQUILATERAL);
}

/*
 * 3. Do you have a test case that represents a valid isosceles triangle?
 * (Note that a test case representing 2, 2, 4 would not count because it is
 * not a valid triangle.)
 *
 * 4. Do you have at least three test cases that represent valid isosceles
 * triangles such that you have tried all three permutations of two equal
 * sides (such as 3, 3, 4; 3, 4, 3; and 4, 3, 3)?
 */
TEST(ValidTriangles, Isosceles) {
	/* Valid isosceles triangles with all three permutations */
	EXPECT_EQ(ISOSCELES, classify(3, 3, 4));
	EXPECT_EQ(ISOSCELES, classify(3, 4, 3));
	EXPECT_EQ(ISOSCELES, classify(4, 4, 3));
}

/*
 * 5. Do you have a test case in which one side has a zero value?
 *
 */
TEST(InvalidTriangles, OneSideHasAZeroValue) {
	EXPECT_EQ(INVALID, classify(0, 4, 5));
}

/*
 * 6. Do you have a test case in which one side has a negative value?
 */
TEST(InvalidTriangles, OneSideHasANegativeValue) {
	ASSERT_EQ(INVALID, classify(-1, 4, 5));
}

/*
 * 7. Do you have a test case with three integers greater than zero such
 * that the sum of two of the numbers is equal to the third? (That is, if
 * the program said that 1, 2, 3 represents a scalene triangle, it would
 * contain a bug.)
 *
 * 8. Do you have at least three test cases in category 7 such that you have
 * tried all three permutations?
 */
TEST(InvalidTriangles, TheSumOfTwoSidesIsEqualToTheThird) {
	EXPECT_EQ(INVALID, classify(1, 2, 3));
	EXPECT_EQ(INVALID, classify(2, 3, 1));
	EXPECT_EQ(INVALID, classify(3, 2, 1));
}

/**
 * 9. Do you have a test case with three integers greater than zero such
 * that the sum of two of the numbers is less than the third (1, 2, 4 or 12,
 * 15, 30)?
 *
 * 10. Do you have at least three test cases in category 9 such that you
 * have tried all three permutations (for example, 1, 2, 4; 1, 4, 2; and 4,
 * 1, 2)?
 */
TEST(InvalidTriangles, TheSumOfTwoSidesIsLessThanTheThird) {
	EXPECT_EQ(INVALID, classify(1, 2, 4));
	EXPECT_EQ(INVALID, classify(2, 4, 1));
	EXPECT_EQ(INVALID, classify(4, 2, 1));
}

/*
 * 11. Do you have a test case in which all sides are 0 (0, 0, 0)?
 */
TEST(InvalidTriangles, AllSidesHaveZeroValue) {
	EXPECT_EQ(INVALID, classify(0, 0, 0));
}

/*
 * 12.	Do you have a test case specifying non-integer values (such as 2.5, 3.5, 5.5)?
 */
TEST(InvalidTriangles, NonIntegerValues) {
	//EXPECT_TRUE(classify("a", "b", "c") == INVALID); <-- Covered by compiler
}

/*
 * 13.	Do you have at least one test case specifying the wrong number of values (two rather than three integers, for example)?
 */
TEST(InvalidTriangles, WrongNumberOfArguments) {
	//EXPECT_TRUE(classify(1, 2) == INVALID); <-- Covered by compiler
}
