#ifndef TRIANGLE_TYPE_INCLUDED
#define TRIANGLE_TYPE_INCLUDED

enum TRIANGLE_TYPE {
    INVALID, SCALENE, EQUILATERAL, ISOSCELES
};

typedef enum TRIANGLE_TYPE TriangleType;

TriangleType classify(int a, int b, int c);

#endif

