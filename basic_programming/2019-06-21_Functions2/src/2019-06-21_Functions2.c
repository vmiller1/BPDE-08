/*
 ============================================================================
 Name        : 2019-06-21_Functions2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int sum(int a, int b);

int main(void) {
	printf("3 + 5 = %d", sum(3, 5));
	return EXIT_SUCCESS;
}

int sum(int a, int b) {
	return a + b;
}

