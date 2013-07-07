import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicBorders;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;


@SuppressWarnings("serial")
public class MainWin extends JFrame implements ActionListener
{
	private JPanel contentPane;
	private final JButton nextButton = new JButton("Next");
	private JLabel lblNewLabel_1 = new JLabel("<html>Text Output Area (What we see)</html>");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
					MainWin frame = new MainWin();
					frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWin() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Images of...something</html>");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(12, 0, 47, 40);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnAreaToEnter = new JEditorPane();
		dtrpnAreaToEnter.setText("Enter Commands Here");
		dtrpnAreaToEnter.setBounds(68, 536, 477, 25);
		contentPane.add(dtrpnAreaToEnter);
		

		lblNewLabel_1.setBounds(649, 0, 297, 397);
		lblNewLabel_1.setBorder(new LineBorder(Color.black));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Put a map here....");
		lblNewLabel_2.setBorder(new LineBorder(Color.black));
		lblNewLabel_2.setBounds(71, 0, 451, 536);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("Image of our player");
		label.setBorder(new LineBorder(new Color(0, 0, 0)));
		label.setBounds(12, 194, 47, 40);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Image of our player");
		label_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_1.setBounds(12, 233, 47, 40);
		contentPane.add(label_1);
		nextButton.setBounds(713, 397, 158, 25);
		contentPane.add(nextButton);
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				lblNewLabel_1.setText("<html>We can read this information from a text file just as soon as I figure out how to...</html>");		
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}
