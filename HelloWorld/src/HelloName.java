import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelloName {
	static JFrame frame = new JFrame();
	static String birthday;
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		String name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		final String[] month = { "August", " May", " February"};
		final JFrame frame = new JFrame();
		String months = (String) JOptionPane.showInputDialog(frame,
				"What month is your favorite?",
				"Pick month",
				JOptionPane.QUESTION_MESSAGE,
				null,
				month,
				month[0]);
		JOptionPane.showMessageDialog(frame, "Wow, " +months+ " is my favorite month too, " + name + "!");
	}
}
