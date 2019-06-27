/*
 ============================================================================
 Name        : 2019-06-26_For_loop.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	char a[] = "PrevEd MEdved";

	printf("%s\n", a);

	int i;
	for (i = 0; i < 13; i++) {
		if (a[i] == 'e' || a[i] == 'E')
			a[i] = ' ';
	}
	printf("%s\n", a);

	return EXIT_SUCCESS;
}
