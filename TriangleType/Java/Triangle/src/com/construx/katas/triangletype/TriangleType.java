/*******************************************************************************
 * Copyright (c) 2010-2017, Construx Software, Inc., All Rights Reserved.
 * 
 * This code is the exclusive property of Construx Software, Inc. and it may ONLY 
 * be used by individuals who are being trained and coached by Construx Software, Inc..
 * 
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 ******************************************************************************/

package com.construx.katas.triangletype;

/**
 * Implements the core functionality for the self-assessment test in "The Art of Software Testing,
 * Second Edition" by Glenford Myers.
 * 
 * @author Melvin Perez-Cedano
 * 
 */
public enum TriangleType {
    INVALID, SCALENE, EQUILATERAL, ISOSCELES;

    /**
     * Return the type of triangle that three provided lengths would form.
     * 
     * @param a
     *            length of the first side
     * @param b
     *            length of the second side
     * @param c
     *            length of the third side
     * 
     * @return
     *         <ul>
     *         <li>INVALID if the three lengths do not form a triangle.
     *         <li>EQUILATERAL if the three lengths are equal.
     *         <li>ISOSCELES if two lengths are equal.
     *         <li>SCALENE if all three lengths are different.
     *         </ul>
     * 
     */
    public static TriangleType classify(final int a, final int b, final int c) {
        if (sidesFormATriangle(a, b, c)) {
            if (allSidesAreEqual(a, b, c)) {
                return EQUILATERAL;
            } else if (twoSidesAreEqual(a, b, c)) {
                return ISOSCELES;
            } else {
                return SCALENE;
            }
        } else {
            return INVALID;
        }
    }

    private static boolean twoSidesAreEqual(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    private static boolean allSidesAreEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    /**
     * To form a triangle, the sum of the lengths of any two sides must be greater than or equal
     * (i.e., degenerate) to the length of the third side. However, this implementation treats the
     * degenerate case (a + b = c) as invalid.
     * 
     * @return True if the sum of the lengths of any two sides is greater than the length of the
     *         third side.
     * 
     * TODO: Avoid overflow when side lengths == MAXINT
     */
    private static boolean sidesFormATriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
