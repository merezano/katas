#include <stdlib.h>
#include "Triangle.h"

/**
 * The sum of the lengths of any two sides must be greater than or equal to
 * the length of the remaining side. However, although valid, this
 * implementation considers the degenerate case (x + y = z) invalid.
 *
 * @return True if the sum of the lengths of any two sides is greater than
 *         the length of the remaining side
 */

int sidesFormATriangle(int sideA, int sideB, int sideC) {
    return sideA + sideB > sideC && sideB + sideC > sideA
            && sideA + sideC > sideB;
}

int allSidesAreEqual(int sideA, int sideB, int sideC) {
    return sideA == sideB && sideB == sideC;
}

int twoSidesAreEqual(int sideA, int sideB, int sideC) {
    return sideA == sideB || sideB == sideC || sideA == sideC;
}

/**
 * This function takes @param three values representing the lengths of the
 * sides of a triangle and @returns the type of triangle they would form.
 */
TriangleType classify(int sideA, int sideB, int sideC) {
    if (sidesFormATriangle(sideA, sideB, sideC))
        if (allSidesAreEqual(sideA, sideB, sideC))
            return EQUILATERAL;
        else if (twoSidesAreEqual(sideA, sideB, sideC))
            return ISOSCELES;
        else
            return SCALENE;
    else
        return INVALID;
}
