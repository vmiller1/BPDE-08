/*
 ============================================================================
 Name        : 2019-07-03_Binary_converter.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void convert(char bin[], int n);

int main(void) {

	convert("1010",4);
	convert("1111",4);
	return EXIT_SUCCESS;
}

void convert(char bin[], int n) {

	int power2[4] = {8, 4, 2, 1};

	int i;
	int dec = 0;
	int mult;

	for (i = n - 1; i >= 0; i--) {

		if (bin[i] == '1')
			mult = 1;
		else
			mult = 0;

		dec = dec + mult * power2[i];
	}

	printf("%s = %d\n", bin, dec);
}
