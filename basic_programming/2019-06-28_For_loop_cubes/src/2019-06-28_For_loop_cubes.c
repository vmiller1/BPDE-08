/*
 ============================================================================
 Name        : 2019-06-28_For_loop_cubes.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int cube(int x);
void pretty_print_array(int a[], int length);

int main(void) {

	int a[] = {1, 2, 3, 5, 6, 7, 2};
	int cubes[7];

	int i;
	for (i = 0; i < 7; i++) {
		cubes[i] = cube(a[i]);
	}
	pretty_print_array(cubes, 7);
	return EXIT_SUCCESS;
}

int cube(int x)
{
	return x * x * x;
}

void pretty_print_array(int a[], int length) {
	printf("{");

	int i;
	for (i = 0; i < length; i++ ) {
		printf("%d", a[i]);

		if (i < length - 1)
			printf(", ");
	}

	printf("}");
}
