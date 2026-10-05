package controlStructures;
// lanzjhjhjbhjbjhgjg
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class edjocLa_LE21 {
	public static void main(String[] args) {
		
		JTextField yearField = new JTextField();
        JTextField monthField = new JTextField();
        JTextField dayField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        //labels and text fields
        panel.add(new JLabel("Enter year:"));
        panel.add(yearField);

        panel.add(new JLabel("Enter month (1-12):"));
        panel.add(monthField);

        panel.add(new JLabel("Enter the day of the month (1-31):"));
        panel.add(dayField);
        
        int option = JOptionPane.showConfirmDialog(
        		null, panel, "Day of the Week", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE
        );
        
        if (option == JOptionPane.OK_OPTION) {
        	int year = Integer.parseInt(yearField.getText());				//k	
        	int month = Integer.parseInt(monthField.getText());				//m
        	int day = Integer.parseInt(dayField.getText()); 				//q
        	
        	if (month == 1 || month == 2) {
        		month += 12;
        		year--;
        	}
        	
        	int j = year / 100;
        	int k = year % 100;
        	
        	int h = (day 
        			+ (13 * (month + 1)) / 5 
        			+ k 
        			+ k / 4
        			+ j / 4
        			+ (5 * j)) % 7;
        	
        	String[] days = {
        			"Saturday",
        			"Sunday",
        			"Monday",
        			"Tuesday",
        			"Wednesday",
        			"Thursday",
        			"Friday",
        	};
        	
        	JOptionPane.showMessageDialog(
        			null,
        			"Day of the week: " + days[h], 
        			"Day of the week",
        			JOptionPane.PLAIN_MESSAGE
        	);
        }

	}
}
