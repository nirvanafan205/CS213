import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing*; // will give all above
public class gui
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia Lab 12");

		JFrame frame = new JFrame("Ayyy Lmao"); // out put message object JFrame is made to make the frame 

		frame.setSize(500, 500); // this is setting the width and height of a frame 

		fram.setDeafaultCloseOperation(JFrame.EXIT_ON_CLOSE); // gives user the ability to close 
		// if not added terminal will not be able to close the GUI

		JPanel panel = new JPanel();
		// adding a panel 
		// it is created and added them specific positions in JFrame. Inside panels we can
		// add text fields, buttons and other components

		fram.add(panel);
		// calling user defined method for adding components to the panel

		placeComponents(panel);

		frame.setVisible(true);
		// is important to show the actual gui
	}

	private static void placeComponents(JPanel panel)
	{
		panel.setLayout(null);

		JLabel userLabel = new Label("User");
		// this will give a specific location and size of component, set Bounds (x, y, width, height)
		// x and y are cordinatnes from the top left corner and remaining two arguements are the 
		// width and height of component
		//
		userLabel.setBoundes(10,20,80,25);
		panel.add(userLabel);

		// this is were user is able to enter text

		JTextField userText = new JTextField(20); // how many charactrers can one type in
		userText.setBounds(100,20,165,25);
		panel.add(userText);

		JLabel passwordLabel = new Label("User");
		passwordLabel.setBoundes(10,50,80,25);
		panel.add(passwordLabel);

		//creating login button
		//

		JButton loginButton
	}

}
