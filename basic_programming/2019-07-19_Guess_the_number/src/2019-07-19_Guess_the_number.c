/*
 ============================================================================
 Name        : 2019-07-19_Guess_the_number.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int play_game = 1;

	int min;
	int max;

	char play_game_answer;

	while (play_game == 1) {

		printf("Please enter min possible number to guess:");
		fflush(stdout);
		scanf("%d", &min);

		printf("Please enter max possible number to guess:");
		fflush(stdout);
		scanf("%d", &max);
		fflush(stdin);

		int candidate;
		int answer;

		printf("Please make the number from %d to %d\n", min, max);

		candidate = (max + min) / 2;
		printf("Candidate=%d\n", candidate);
		while (min != max) {
			printf("Is this number more than %d (1/0)?\n", candidate);
			fflush(stdout);
			scanf("%d", &answer);

			if (answer == 1) {
				min = candidate + 1;
				printf("min = %d\n", min);
			} else {
				max = candidate;
				printf("max = %d\n", max);
			}
			candidate = (max + min) / 2;
		};

		printf("Your number is %d\n", min);

		printf("Do you want to play once more(y/n)?\n");
		fflush(stdout);
		scanf("%c", &play_game_answer);
		if (play_game_answer != 'y')
			play_game = 0;
	}

	return EXIT_SUCCESS;
}
