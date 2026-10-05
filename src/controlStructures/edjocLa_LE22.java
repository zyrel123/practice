package controlStructures;

import javax.swing.JOptionPane;
import java.util.Random;

public class edjocLa_LE22 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, 
				"This program will flip a coin 2,000,000 times.", 
				"Coin Flip",
				JOptionPane.PLAIN_MESSAGE);
		
		int heads = 0, tails = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < 2000000; i++) {
			
			if (random.nextBoolean()) {
				heads++;
			} else {
				tails++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Heads: " + heads + "\nTails: " + tails, "Coin Flip", JOptionPane.PLAIN_MESSAGE);
	}
}
