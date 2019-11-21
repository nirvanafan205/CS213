import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class other_gui
{
	private JFRame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public showButtonDemo()
	{
		prepareGUI();
	}

	public static void main(String[] args)
	{
		other_gui buttons = new other_gui();
		other_gui.showButtonDemo();
	}

	private void prepareGui()
	{
		mainFrame = new JFRame("Java swing examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3,1) );

		mainFrame.addWindowListener(new WindoAdapter()
				{
					public void windowClosing(WindowEven windowEvent)
					{
						System.exit(0);
					}
				} );

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350,100);

		ControlPanel = new JPanel();
		ControlPanel.setLayout(new FlowLayout() );

		mainFrame.add(headerLabel);

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private static ImageIcon createImageIcon(String path, String description)
	{
		java.net.URL imgURL = SwingControl.class.getResource(path);

		if(imgURL != null)
		{
			return new ImageIcon(imgURL, description);
		}
		else
		{
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	private void showButtonDemo()
	{
		headerLabel.setText("Control in action: Button");

		ImageIcon icon = createImageIcon("java_icon.png", "Java"); // image needs to be in the same directory

		JButton okButton = new JButton("Ok");
	
	JButton submitButton = new JButton("Submit", icon);
	JButton cancelButton = new JButton("cancel", icon);

	cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);

	okButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					StatusLabel.setText("Submit Button clicked." );
				}
			});

	cancelButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					StatusLabel.setText("Cancel Button clicked." );
				}
			});

	controlPanel.add(okButton);
	controlPanel.add(submitButton);
	controlPanel.add(cancelButton);
	mainFrame.setVisible(true);
	}
}
