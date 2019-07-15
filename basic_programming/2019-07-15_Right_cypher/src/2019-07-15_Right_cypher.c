/*
 ============================================================================
 Name        : 2019-07-15_Right_cypher.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

int main(void) {

	int low = 65;
	int high = 90;

	char string[] = ",WORLD";
	int size = 6;
	int key = 1;

	char ciphered_string[size + 1];

	char expected[] = ",XPSME";

	printf("Source string:");
	printf("%s\n", string);
	int i;
	for (i = 0; i < 6; i++) {
		if (string[i] >= low && string[i] <= high) {
			ciphered_string[i] = string[i] + key;
			//ciphered_string[i] = low
			//		+ ((string[i] + key - low) % (high - low + 1));
		} else {
			ciphered_string[i] = string[i];
		}
	}
	ciphered_string[size] = '\0';

	printf("Ciphered string:");
	printf("%s\n", ciphered_string);

	//assert(expected == ciphered_string);

	return EXIT_SUCCESS;
}
