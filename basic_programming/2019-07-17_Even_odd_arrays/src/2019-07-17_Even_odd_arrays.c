/*
 ============================================================================
 Name        : 2019-07-17_Even_odd_arrays.c
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

	int n = 6;
	int a[] = {1, 2, 3, 4, 5, 6};

	int even_index = 0, odd_index = 0;

	int even[n], odd[n];

	pretty_print_array(a, n);

	int i;
	for (i = 0; i < n; i++) {
		if (a[i] % 2 == 0)
			even[even_index++] = a[i];
		else
			odd[odd_index++] = a[i];
	}

	printf("Array of even numbers:");
	pretty_print_array(even, even_index);

	printf("Array of odd numbers:");
	pretty_print_array(odd, odd_index);

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
