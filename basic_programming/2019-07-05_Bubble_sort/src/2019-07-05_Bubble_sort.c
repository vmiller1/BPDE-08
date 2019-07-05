/*
 ============================================================================
 Name        : 2019-07-05_Bubble_sort.c
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

	int a[4] = {4, 3, 2, 1};
	pretty_print_array(a, 4);
	printf("\n");

	int n = 4;
	int flag;
	do {
		flag = 0;
		int i;
		for (i = 0; i < n - 1 ; i++) {
			if (a[i] > a[i + 1]) {
				int buffer = a[i];
				a[i] = a[i + 1];
				a[i + 1] = buffer;
				flag = 1;
			}
			pretty_print_array(a, n);
		}
		printf("\n");
	} while (flag == 1);

	pretty_print_array(a, n);

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
