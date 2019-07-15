/*
 ============================================================================
 Name        : 2019-07-15_Null_terminated_strings.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	char a[] = "ABC";
	printf("%s\n", a);

	char b[] = "BCD";
	printf("%s\n", b);

	a[3] = 'a';
	printf("%s\n", a);

	a[3] = '\0';
	printf("%s\n", a);

	a[1] = '\0';
	printf("%s\n", a);

	return EXIT_SUCCESS;
}
