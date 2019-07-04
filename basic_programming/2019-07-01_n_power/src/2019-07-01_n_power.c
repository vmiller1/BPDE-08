/*
 ============================================================================
 Name        : 2019-07-01_n_power.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int power_n(int x, int n);

int main(void) {


	printf("2^2=%d\n", power_n(2,2));
	printf("2^0=%d\n", power_n(2,0));

	printf("27^0=%d\n", power_n(27,0));
	printf("16^2=%d\n", power_n(16,2));

	return EXIT_SUCCESS;
}

int power_n(int x, int n) {

	int i, power = 1;
	for (i = 1; i <= n; i++) {
		power = power * x;
	}
	return power;
}
