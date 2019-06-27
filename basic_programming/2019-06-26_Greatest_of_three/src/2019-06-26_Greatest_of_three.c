/*
 ============================================================================
 Name        : 2019-06-26_Greatest_of_three.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int greatest(int a, int b, int c);
void print_greatest(int a, int b, int c);

int main(void) {
	print_greatest(2, 5, 3);
	print_greatest(2, 2, 2);
	print_greatest(2, 5, 5);
	print_greatest(2, 2, 5);

	return EXIT_SUCCESS;
}

void print_greatest(int a, int b, int c)
{
	printf("The greatest of %d, %d, %d is %d\n", a, b, c, greatest(a, b, c));
}

int greatest(int a, int b, int c)
{
	int greatest;

	if (a > b)
	{
		if (a > c)
			greatest = a;
		else
			greatest = c;
	} else
	{
		if (b > c)
			greatest = b;
		else
			greatest = c;
	}

	return greatest;
}
