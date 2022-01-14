package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_numbers {
 
	public static void main(String[] args) {
		String code; 
		code = "";
		Random ran = new Random();
		
		for (int bob = 0; bob < 6; bob ++) {
		code += " " + (ran.nextInt(100 ) +1);
		
		}
		JOptionPane.showMessageDialog(null,  code,"Lottery number", JOptionPane.INFORMATION_MESSAGE);
	}

}
