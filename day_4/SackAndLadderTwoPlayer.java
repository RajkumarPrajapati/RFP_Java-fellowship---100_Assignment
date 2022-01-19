package com.bridgelabz.assignment.day_4;

import java.util.Random;

public class SackAndLadderTwoPlayer {
	int position = 0;
	int position2 = 0;
	int counter = 0;

	Random random = new Random();

	public void startGame() {
		while (position <= 100) {
			counter = counter + 1;
			if (position % 2 == 0) { // Player 1 is playing
				int number = random.nextInt(6) + 1;
				int check = random.nextInt(3);
				if (check == 0) { // Player is not playing
					position = position + 0;
				} else if (check == 1) { // Player is playing and get Ladder
					position = position + number;
				} else if (check == 2) {
					position = position - number; // Player is Get Ladder
				}
				if (position >= 100) {
					System.out.println("Player One is Won");
					break;
				}
			} else { // Player two is Playing
				int number = random.nextInt(6) + 1;
				int check = random.nextInt(3);
				if (check == 0) { // Player is not playing
					position = position + 0;
				} else if (check == 1) { // Player is playing and get Ladder
					position = position + number;
				} else if (check == 2) {
					position = position - number; // Player is Get Ladder
				}

				if (position >= 100) {
					System.out.println("Player Two is Won");
					break;
				}
			}
		}
		System.out.println("Count of Played : " + counter);
	}

	public static void main(String[] args) {
		SackAndLadderTwoPlayer sl = new SackAndLadderTwoPlayer();
		sl.startGame();
	}

}
