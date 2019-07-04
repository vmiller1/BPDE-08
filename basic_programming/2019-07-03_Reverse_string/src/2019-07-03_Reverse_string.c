/*
 ============================================================================
 Name        : 2019-07-03_Reverse_string.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void reverse(char str[], int n);

int main(void) {

	reverse("Hello", 5);
	return EXIT_SUCCESS;
}

void reverse(char str[], int n){
	char a[n];
	int i;
	for (i = 0; i <= n - 1; i++) {
		a[n - 1 - i] = str[i];
	}
	printf("%s\n", a);
}
