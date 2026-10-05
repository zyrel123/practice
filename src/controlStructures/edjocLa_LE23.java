package controlStructures;

import javax.swing.JOptionPane;

public class edjocLa_LE23 {
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a decimal number:");
		
		int decimal = Integer.parseInt(input);
		
		String hex = "";
		
		if (decimal == 0) {
			hex = "0";
		} else {
			while (decimal > 0) {
				int remainder = decimal % 16;
				
				if (remainder < 10) {
					hex = remainder + hex;
				} else {
					hex = (char)('A' + remainder - 10) + hex;
				}
				
				decimal = decimal / 16;
			}
		}
		
		JOptionPane.showMessageDialog(
				null,
				"Hexadecimal number: " + hex,
				"Dec to Hex",
				JOptionPane.PLAIN_MESSAGE
		);
	}
}
