/*
 ============================================================================
 Name        : 2019-06-26_Arrays.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int even[5] = {2, 4, 6, 8, 10};

	printf("even[0]=%d\n", even[0]);
	printf("even[4]=%d\n", even[4]);

	char string[] = "Preved Medved";

	printf("string=%s\n", string);

	printf("string[5]=%c\n", string[5]);

	string[0] = ' ';
	string[2] = ' ';
	string[4] = ' ';

	printf("string=%s\n", string);

	return EXIT_SUCCESS;
}
