/*******************************************************************************
 * Copyright (c) 2015-2017, Construx Software, Inc., All Rights Reserved.
 * 
 * This code is the exclusive property of Construx Software, Inc. and it may ONLY 
 * be used by individuals who are being trained and coached by Construx Software, Inc..
 * 
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 ******************************************************************************/

package com.construx.katas.triangletype.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.construx.katas.triangletype.TriangleType;

/**
 * Implements test cases to fulfill the self-assessment test in "The Art of Software Testing, Second
 * Edition" by Glenford Myers.
 * 
 * <i>The program reads three integer values from an input dialog. The three values represent the
 * lengths of the sides of a triangle. The program displays a message that states whether the
 * triangle is scalene, isosceles, or equilateral. </i>
 * 
 * @author Melvin Perez-Cedano
 * 
 */
public class TriangleTypeTest {

    /**
     * Test case for valid scalene triangle.
     * 
     * <i>(1) Do you have a test case that represents a valid scalene triangle? (Note that test
     * cases such as 1, 2, 3 and 2, 5, 10 do not warrant a "yes" answer because there does not exist
     * a triangle having these dimensions.)</i>
     */
    @Test
    public void classify_AsScalene_WhenTheThreeSidesAreDifferent() {
        assertEquals(TriangleType.SCALENE, TriangleType.classify(3, 4, 5));
    }

    /**
     * Test case for valid equilateral triangle.
     * 
     * <i>(2) Do you have a test case that represents a valid equilateral triangle?</i>
     */
    @Test
    public void classify_AsEquilateral_WhenTheThreeSidesAreEqual() {
        assertEquals(TriangleType.EQUILATERAL, TriangleType.classify(3, 3, 3));
    }

    /**
     * Test cases for valid isosceles triangles.
     * 
     * <ul>
     * <li><i>(3) Do you have a test case that represents a valid isosceles triangle? (Note that a
     * test case representing 2, 2, 4 would not count because it is not a valid triangle)</i>
     * <li><i>(4) Do you have at least three test cases that represent valid isosceles triangles
     * such that you have tried all three permutations of two equal sides (such as, 3, 3, 4; 3, 4,
     * 3; and 4, 3, 3)?</i>
     * </ul>
     */
    @Test
    public void classify_AsIsosceles_WhenTwoSidesAreEqual() {
        assertEquals(TriangleType.ISOSCELES, TriangleType.classify(3, 3, 4));
        assertEquals(TriangleType.ISOSCELES, TriangleType.classify(3, 4, 3));
        assertEquals(TriangleType.ISOSCELES, TriangleType.classify(4, 3, 3));
    }

    /**
     * Test cases for invalid triangles with a zero side length.
     * <ul>
     * <li><i>(5) Do you have a test case in which one side has a zero value?</i>
     * <li><i>(11) Do you have a test case in which all sides are zero (0, 0, 0)?</i>
     * </ul>
     */
    @Test
    public void classify_AsInvalid_WhenAnySideIsZero() {
        assertEquals(TriangleType.INVALID, TriangleType.classify(0, 4, 5));
        assertEquals(TriangleType.INVALID, TriangleType.classify(0, 0, 0));
    }

    /**
     * Test cases for invalid triangles with a negative side length.
     * 
     * <i>(6) Do you have a test case in which one side has a negative value?</i>
     */
    @Test
    public void classify_AsInvalid_WhenAnySideIsNegative() {
        assertEquals(TriangleType.INVALID, TriangleType.classify(-1, 4, 5));
    }

    /**
     * Test cases for invalid triangles with the sum of two sides equal to the third.
     * <ul>
     * <li><i>(7) Do you have a test case with three integers greater than zero such that the sum of
     * two of the numbers is equal to the third? (That is, if the program said that 1, 2, 3
     * represents a scalene triangle, it would contain a bug.)</i>
     * <li><i>(8) Do you have at least three test cases in category (7) such that you have tried all
     * three permutations where the length of one side is equal to the sum of the lengths of the
     * other two sides (for example, 1, 2, 3; 1, 3, 2; and 3, 1, 2)?</i>
     * </ul>
     */
    @Test
    public void classify_AsInvalid_WhenTheSumOfTwoSidesIsEqualToTheThird() {
        assertEquals(TriangleType.INVALID, TriangleType.classify(1, 2, 3));
        assertEquals(TriangleType.INVALID, TriangleType.classify(2, 3, 1));
        assertEquals(TriangleType.INVALID, TriangleType.classify(3, 2, 1));
    }

    /**
     * Test cases for invalid triangles with the sum of two sides less than the third.
     * 
     * <ul>
     * <li><i>(9) Do you have a test case with three integers greater than zero such that the sum of
     * two of the numbers is less than the third (such as 1, 2, 4 or 12,15,30)?</i>
     * <li><i>(10) Do you have at least three test cases in category 9 such that you have tried all
     * three permutations (for example, 1, 2, 4; 1, 4, 2; and 4, 1, 2)?</i>
     * </ul>
     */
    @Test
    public void classify_AsInvalid_WhenTheSumOfTwoSidesIsLessThanTheThird() {
        assertEquals(TriangleType.INVALID, TriangleType.classify(1, 2, 4));
        assertEquals(TriangleType.INVALID, TriangleType.classify(1, 4, 2));
        assertEquals(TriangleType.INVALID, TriangleType.classify(4, 1, 2));
    }
}