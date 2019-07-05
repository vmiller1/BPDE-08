/*
 ============================================================================
 Name        : 2019-07-05_While_loop.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int n = 5;
	int i = 0;

	while (i++ < n) {
		printf("Hello, World\n");
	}

	i = 1;

	i += ++i;

	printf("%d", i);

	return EXIT_SUCCESS;
}
