################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../test-CppUTest/AllTests.cpp \
../test-CppUTest/triangle_type_test.cpp 

OBJS += \
./test-CppUTest/AllTests.o \
./test-CppUTest/triangle_type_test.o 

CPP_DEPS += \
./test-CppUTest/AllTests.d \
./test-CppUTest/triangle_type_test.d 


# Each subdirectory must supply rules for building sources it contributes
test-CppUTest/%.o: ../test-CppUTest/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -I/usr/local/Cellar/cpputest/3.8/include -I"/Users/melvinperez/Code/TriangleType/C/CppUTest/src" -O0 -g3 -ftest-coverage -fprofile-arcs -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

