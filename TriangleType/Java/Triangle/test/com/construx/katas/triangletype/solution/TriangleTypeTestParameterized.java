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

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.construx.katas.triangletype.TriangleType;

public class TriangleTypeTestParameterized {
    /**
     * Parameterized test for all the test cases.
     * 
     * @param a
     *            length of the first side
     * @param b
     *            length of the second side
     * @param c
     *            length of the third side
     * @param expectedTriangle
     *            expected triangle type based on side lenghts.
     */
    @ParameterizedTest
    @MethodSource("testCases")
    public void classify_asExpected(int a, int b, int c, TriangleType expectedTriangle) {
        assertEquals(expectedTriangle, TriangleType.classify(a, b, c));
    }

    static Stream<Arguments> testCases() {
        return Stream.of(Arguments.of(1, 2, 4, TriangleType.INVALID),
                Arguments.of(1, 4, 2, TriangleType.INVALID),
                Arguments.of(4, 1, 2, TriangleType.INVALID),
                Arguments.of(3, 3, 3, TriangleType.EQUILATERAL),
                Arguments.of(3, 4, 3, TriangleType.ISOSCELES),
                Arguments.of(4, 3, 3, TriangleType.ISOSCELES),
                Arguments.of(3, 3, 4, TriangleType.ISOSCELES),
                Arguments.of(3, 4, 5, TriangleType.SCALENE));

    }
}
