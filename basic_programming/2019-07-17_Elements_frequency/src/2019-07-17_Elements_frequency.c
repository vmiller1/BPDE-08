/*
 ============================================================================
 Name        : 2019-07-17_Elements_frequency.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int find_index(int a[], int n, int number);

int main(void) {
	int a[5] = {1, 3, 2, 5, 4};

	/*index of 1 is 0*/
	printf("index of %d is %d\n", 1, find_index(a, 5, 1));

	/*index of 10 is -1*/
	printf("index of %d is %d\n", 10, find_index(a, 5, 10));

	return EXIT_SUCCESS;
}

int find_index(int a[], int n, int number) {

	int i;
	for (i = 0; i < n; i++) {
		if (number == a[i]) {
			return i;
		}
	}
	return -1;
}
