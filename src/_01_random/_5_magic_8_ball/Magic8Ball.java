//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below

	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog(null,"What would u like to ask the 8 ball?");
	Random ran = new Random();
	int outcome = ran.nextInt(4-2 -1 +1) +1;
	if (outcome ==1) {
		System.out.println("Yes");
	}else if (outcome==2) {
		System.out.println("No");
	}else if (outcome == 3) {
		System.out.println("maybe");
	}else if (outcome ==4) {
		System.out.println("ask again");
	}
	
	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	
	// 4. If the random number is 0

	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer
	
	}

}
