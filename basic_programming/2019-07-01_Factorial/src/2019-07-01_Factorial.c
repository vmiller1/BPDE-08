/*
 ============================================================================
 Name        : 2019-07-01_Factorial.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int factorial(int n);

int main(void) {
	printf("1!=%f\n", factorial(1));
	printf("2!=%f\n", factorial(2));
	printf("3!=%f\n", factorial(3));

	printf("(1! + 4! + 6! + 6!) + 1 = %d\n",
		factorial(1) +
		factorial(4) +
		factorial(6) +
		factorial(6) +
		1
	);
	//(8! + 1! + 3! + 6! + 8!) + 1
	//(3! + 7! + 2! + 9! + 7! + 3!) + 1

	return EXIT_SUCCESS;
}

int factorial(int n) {
	int i;
	int f = 1;
	for (i = 1; i <= n; i++) {
		f = f * i;
	}
	return f;
}
