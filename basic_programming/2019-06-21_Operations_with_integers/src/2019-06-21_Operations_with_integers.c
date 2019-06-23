/*
 ============================================================================
 Name        : 2019-06-21_Operations_with_integers.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int day_of_week = 3;
	int number_of_days = 321;
	int day_of_week_after = (day_of_week + number_of_days) % 7;

	printf("Day of week after %d = %d", number_of_days, day_of_week_after);

	int a = 5;
	int b = 5;

	printf("\n%d", a++);
	printf("\n%d", ++b);

	printf("\n%d", a);
	printf("\n%d", b);
}
