#include "triangle_type.h"
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
 * Implements the core functionality for the self-assessment test in 
 * "The Art of Software Testing, 2nd Edition" by Glenford Myers.
 *
 * @author Melvin Perez-Cedano
 *
 */

/**
 * To form a triangle, the sum of the lengths of any two sides must be greater 
 * than or equal to the length of the third side. However, this implementation 
 * treats the degenerate case (sum of the lengths of two sides equal to the third)
 * as invalid.
 *
 * @return True if the sum of the lengths of any two sides is greater than the i
 *         length of the third side.
 */
int sidesFormATriangle(int a, int b, int c) {
	return (a + b > c && b + c > a && a + c > b);
}

int allSidesAreEqual(int a, int b, int c) {
	return (a == b && b == c);
}

int twoSidesAreEqual(int a, int b, int c) {
	return (a == b || b == c || a == c);
}

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
 *         INVALID if the three lengths do not form a triangle.
 *         EQUILATERAL if the three lengths are equal.
 *         ISOSCELES if two lengths are equal.
 *         SCALENE if all three lengths are different.
 *
 */
TriangleType classify(int a, int b, int c) {
	if (sidesFormATriangle(a, b, c))
		if (allSidesAreEqual(a, b, c))
			return (EQUILATERAL);
		else if (twoSidesAreEqual(a, b, c))
			return (ISOSCELES);
		else
			return (SCALENE);
	else
		return (INVALID);
}
