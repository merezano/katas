#ifndef TRIANGLE_H_
#define TRIANGLE_H_

/*
 * Kinds of triangles
 */
enum TRIANGLE_TYPE { INVALID, SCALENE, EQUILATERAL, ISOSCELES };

typedef enum TRIANGLE_TYPE TriangleType;

TriangleType classify(int sideA, int sideB, int sideC);

#endif /* TRIANGLE_H_ */
