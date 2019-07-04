/*
 ============================================================================
 Name        : 2019-07-01_Scope_of_variables.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#define	PI 3.1415926

int multiply_by_2(int a);

int a = 8;

int main(void) {
	int a = 5;
	printf("%d\n", a);
	printf("%d\n", multiply_by_2(a));
	printf("%.5f\n", PI);
	if (1 == 1) {
		printf("1 == 1");
	}
	return EXIT_SUCCESS;
}

int multiply_by_2(int a) {
	return a * 2;
}
