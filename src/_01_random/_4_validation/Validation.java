//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		if (randomNumber == 1) {
			System.out.println("coding is fun");
		} else if (randomNumber == 2) {
			System.out.println("You look so good today");
		} else if (randomNumber == 3) {
			System.out.println("Good luck in what ever you are doin");
		} else if (randomNumber == 4) {
			System.out.println("happy holidays");
		} else if (randomNumber == 5) {
			System.out.println("have a good day");
		} else {
			System.out.println("We love you");
		}

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
