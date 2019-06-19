
/*
 ============================================================================
 Name        : 2019-06-17_Hello_world.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	printf("This is a %s", "string");
	printf("\nThis is a number %d", 5);
	printf("\n2 + 2 = 4");
	printf("\n375 * 5271 = %d", 375 * 5271);
	printf("\n375 * 5271 = %d + 1856 = %d", 375 * 5271, 375 * 5271 + 1856);

	int a = 375;
	int b = 5271;
	int multi_result = a * b;
	printf("\n%d * %d = %d", a, b, multi_result);

	int c = 1856;
	int sum = multi_result + c;

	printf("\n%d * %d = %d + %d = %d", a, b, multi_result, c, sum);

	return EXIT_SUCCESS;
}
