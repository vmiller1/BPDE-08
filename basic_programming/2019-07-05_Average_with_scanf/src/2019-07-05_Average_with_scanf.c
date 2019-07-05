#include <stdio.h>
#include <stdlib.h>

void average(int array[], int n);

int main(void) {

	int n;
	printf("Please specify length of the array:");
	fflush(stdout);
	scanf("%d", &n);

	int ar[n];

	int i;
	for (i = 0; i < n; i++) {
		printf("Please enter %d element of the array:", i);
		fflush(stdout);
		scanf("%d", &ar[i]);
	}

	average(ar, n);

	return EXIT_SUCCESS;
}

void average(int array[], int n){
	int i;
	float sum = 0;
	for(i = 0; i <= n-1; i++){
		sum += array[i];
	}
	float average = sum / n;
	printf("Среднее значение = %f", average);
}
