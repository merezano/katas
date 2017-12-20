/*******************************************************************************
 * Copyright (c) 2010-2017, Construx Software, Inc., All Rights Reserved.
 *
 * This code is the exclusive property of Construx Software, Inc. and it may
 * ONLY be used by individuals who are being trained and coached by Construx
 * Software, Inc.
 *
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 ******************************************************************************/

/**
 * TODO: Complete the test cases below to fulfill the self-assessment test in
 * "The Art of Software Testing, Second Edition" by Glenford Myers.
 *
 * Given three integer values representing the lengths of the sides of a
 * triangle, determine what type of triangle it is: scalene, isosceles, or
 * equilateral.
 *
 */
#include "CppUTest/TestHarness.h"

extern "C"
{
#include "../include/triangle_type.h"
}

TEST_GROUP(ValidTriangles)
{
    void setup()
    {
    }

    void teardown()
    {
    }
};

/**
 * Test case for valid scalene triangle.
 * 
 * (Note that test cases such as 1, 2, 3 and 2, 5, 10 do not warrant a "yes"
 * answer because there does not exist a triangle having these dimensions.)
 */
TEST(ValidTriangles, scalene)
{
    CHECK_TRUE(classify(3, 5, 4) == SCALENE)
}

/*
 * A valid equilateral triangle
 */

/*
 * A valid isosceles triangle. (Note that a test case representing 2, 2, 4 would
 * not count because it is not a valid triangle)
 */

/*
 * Valid isosceles triangles such that you have tried all three permutations of
 * two equal sides (such as 3, 3, 4; 3, 4, 3; and 4, 3, 3)
 */

/*
 * An invalid triangle if one side has a zero value
 */

/*
 * An invalid triangle if one side has negative value
 */

/*
 * An invalid triangle if three sides are greater than zero such that the sum of
 * two of the numbers is equal to the third. Try all three permutations.
 */

/*
 * An invalid triangle if three sides are greater than zero such that the sum of
 * two of the numbers is less than the third. Try all three permutations.
 */
