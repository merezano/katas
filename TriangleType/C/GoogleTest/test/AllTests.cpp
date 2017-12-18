/*
 * AllTests.cpp
 *
 *  Created on: Dec 2, 2012
 *      Author: melvinperez
 */
#include "gtest/gtest.h"
#include "Triangle_test.cpp"
int main(int argc, char **argv) {
	::testing::InitGoogleTest(&argc, argv);
	return RUN_ALL_TESTS();
}

