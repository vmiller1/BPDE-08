/*
 ============================================================================
 Name        : 2019-07-17_Min_max_elements_of_array.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void pretty_print_array(int a[], int length);

int main(void) {
	int n = 5;
	int a[5] = {-1, 2, 5, 3, 4};

	pretty_print_array(a, n);

	int min = a[0];
	int max = a[0];

	int min_index = 0;
	int max_index = 0;

	int i;
	for (i = 1; i < n; i++) {
		if (a[i] < min) {
			min = a[i];
			min_index = i;
		}
		if (a[i] > max) {
			max = a[i];
			max_index = i;
		}
	}

	printf("Min element of the array: %d with index %d\n", min, min_index);
	printf("Max element of the array: %d with index %d\n", max, max_index);

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

	printf("}\n");
}
