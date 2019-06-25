/*
 ============================================================================
 Name        : 2019-06-24_Conditions.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void print_compare(int a, int b, int c) ;

int main(void) {

	print_compare(242, 85, 5000);
	print_compare(567, 2347, 50000);

	return EXIT_SUCCESS;
}

void print_compare(int a, int b, int c)
{
	int result = a * b;
	printf("%d * %d = %d", a, b, result);

	if (result < c) {
		printf(" < ");
	} else {
		printf(" > ");
	}

	printf("%d\n", c);
}
