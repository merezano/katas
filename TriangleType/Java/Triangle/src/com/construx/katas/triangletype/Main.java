/*
 * Copyright (c) 2015-2017, Construx Software, Inc., All Rights Reserved.
 *
 * This code is the exclusive property of Construx Software, Inc. It may ONLY
 * be used by learners during Construx's workshops or by individuals who are
 * being coached by Construx on a project.
 *
 * This code may NOT be copied or used for any other purpose without the prior
 * written consent of Construx Software, Inc.
 *
 */

package com.construx.katas.triangletype;

import java.util.Scanner;

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
class Main {
    public static void main(String[] args) {
        final Scanner userInput = new Scanner(System.in);

        System.out.println("Triangle Classifier");
        System.out.println("Enter the length of the three sides of the triangle");

        System.out.printf("%s", "Side a: ");
        int a = Integer.parseInt(userInput.next());

        System.out.printf("%s", "Side b: ");
        int b = Integer.parseInt(userInput.next());

        System.out.printf("%s", "Side c: ");
        int c = Integer.parseInt(userInput.next());

        System.out.printf("The triangle is %s", TriangleType.classify(a, b, c).toString());
        userInput.close();
    }
}
