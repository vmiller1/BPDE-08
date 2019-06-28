/*
 ============================================================================
 Name        : 2019-06-28_Pretty_print_array.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void pretty_print_array(int a[], int length);

int main(void) {

	int a[3] = {1, 7, 19};
	int b[4] = {1, 2, 3, 4};
	int c[1] = {1};
	int d[0] = {};

	pretty_print_array(a, 3);

	pretty_print_array(b, 4);

	pretty_print_array(c, 1);

	pretty_print_array(d, 0);

	return EXIT_SUCCESS;
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
