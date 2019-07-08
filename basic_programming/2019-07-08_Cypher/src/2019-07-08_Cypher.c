/*
 ============================================================================
 Name        : 2019-07-08_Cypher.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	char coded_string[12];
	char string[12] = "HELLO, WORLD";
	short key = 5;

	int i;
	for (i = 0; i < 12; i++) {
		if (string[i] >= 65 && string[i] <= 90) {
			coded_string[i] = string[i] + key;
			if (coded_string[i] > 90)
				coded_string[i] = 65 + (coded_string[i] % 90);
		}
		else
			coded_string[i] = string[i];
	}

	for (i = 0; i < 12; i++)
		printf("%c", coded_string[i]);

	//printf ("%d", (100 % 122));

	/*||
		(string[i] >=97 && string[i] <= 120)*/

	return EXIT_SUCCESS;
}
