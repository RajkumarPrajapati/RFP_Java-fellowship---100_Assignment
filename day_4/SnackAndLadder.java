package com.bridgelabz.assignment.day_4;

import java.util.Random;

public class SnackAndLadder {
	int position=0;
	int counter=0;
	
	Random random = new Random();
	public void Game() {
		while(position <= 100) {
			counter = counter+1;
			int number = random.nextInt(6)+1;
			int check =random.nextInt(3);
			
			if(check == 0) {  //Player is not playing
				position = position+0;
			}
			else if(check == 1){  //Player is playing and get Ladder
				position = position+number; 
			}
			else if(check == 2) {
				position = position-number; //Player is Get Ladder
			}
		}
		System.out.println("Position : "+position);
		System.out.println("Total Count of Dice Played : " + counter);
	}
	
	

	public static void main(String[] args) {
		
		SnackAndLadder sl = new SnackAndLadder();
		sl.Game();
		
		
	}

}
