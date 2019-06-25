/*
 ============================================================================
 Name        : 2019-06-24_Functions3.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int sum(int a, int b);
int sub(int a, int b);
int multi(int a, int b);
int division(int a, int b);
void print_sum(int a, int b);
void print_division(int a, int b);

int main(void)
{
	// 0, 1; 256, 800; 1024, 2; 758, 0;
	print_sum(3, 5);
	print_sum(0, 1);

	printf("3 - 5 = %d\n", sub(3, 5));
	printf("3 * 5 = %d\n", multi(3,5));
	print_division(10,2);
	print_division(10,0);

	printf("0 + 1 = %d\n", sum(0,1));
	return EXIT_SUCCESS;
}

void print_sum(int a, int b)
{
	printf("%d + %d = %d\n", a, b, sum(a, b));
}

void print_division(int a, int b)
{
	printf("%d / %d = ", a, b);
	if (b == 0) {
		printf("Divider can not be zero!!!\n");
		return;
	}

	printf("%d\n", division(a,b));
}

int sum(int a, int b)
{
	return a + b;
}

int sub(int a, int b)
{
	return a - b;
}

int multi(int a, int b)
{
	return a * b;
}

int division(int a, int b)
{
	return a / b;
}
