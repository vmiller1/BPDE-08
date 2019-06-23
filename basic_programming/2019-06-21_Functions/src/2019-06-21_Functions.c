/*
 ============================================================================
 Name        : 2019_06_21_Functions.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int calc_day_of_week(int start_day, int days_passed);

int main(void) {

	int week_day_after_passed = calc_day_of_week(5, 127);
	printf("Week day after %d days passed is %d", 5, week_day_after_passed);

	week_day_after_passed = calc_day_of_week(5, 99);
	printf("\nWeek day after %d days passed is %d", 5, week_day_after_passed);

	return EXIT_SUCCESS;
}


int calc_day_of_week(int start_day, int days_passed) {
	int week_day_after_passed = (start_day + days_passed) % 7;
	return week_day_after_passed;
}

