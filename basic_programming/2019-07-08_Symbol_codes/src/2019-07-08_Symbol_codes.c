/*
 ============================================================================
 Name        : 2019-07-08_Symbol_codes.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int code;
	for (code = 60; code <= 100; code++) {
		printf("symbol of code=%d is '%c'\n", code, code);
	}

	return EXIT_SUCCESS;
}
