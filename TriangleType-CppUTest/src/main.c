#include <stdio.h>
#include "triangle_type.h"
/*
 * main.c
 *
 *  Created on: Dec 4, 2017
 *      Author: melvinperez
 */
int main(void) {
	int side_a = 0;
	printf("Enter the length of the fist side: ");
	scanf("%d", &side_a);

	int side_b = 0;
	printf("Enter the length of the second side: ");
	scanf("%d", &side_b);

	int side_c = 0;
	printf("Enter the length of the third side: ");
	scanf("%d", &side_c);

	TriangleType type_of_triangle = classify(side_a, side_b, side_c);

	switch (type_of_triangle) {
	case EQUILATERAL:
		printf("Equilateral");
		break;
	case ISOSCELES:
		printf("Isosceles");
		break;
	case SCALENE:
		printf("Scalene");
		break;
	default:
		printf("Invalid");
		break;
	}
}

