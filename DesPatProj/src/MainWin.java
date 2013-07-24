import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.ScrollPane;
import java.util.*;
import java.io.*;


@SuppressWarnings("serial")
public class MainWin extends JFrame implements ActionListener
{
	private final int WINWIDTH = 1000;
	private final int WINHEIGHT = 600;
	private final int LABELSIZE = 45;
	private final int BORDER = 25;
	private final int TOP = 0;
	private final int EDIT_AREA_HEIGHT = 25;
	private final int OUTPUT_AREA_WIDTH = WINWIDTH/2 - LABELSIZE/2;
	private final int OUTPUT_AREA_HEIGHT = WINHEIGHT - EDIT_AREA_HEIGHT - BORDER;
	private final int MAP_AREA_WIDTH = WINWIDTH/2 - LABELSIZE/2;
	private final int MAP_AREA_HEIGHT = WINHEIGHT - BORDER;
	private final String PATH_TO_FILES = "/home/adam/CSCD454Final/DesPatProj/src/files/";
	
	
		
	private JPanel contentPane;
	private JTextPane mapArea;
	private JEditorPane inputArea;
	private JLabel lblNewLabel;
	private JLabel label;
	private JTextPane outputArea;
	private JLabel label_1;
	private Scanner infile;
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
		
		setWindow();
		createInputArea();
		createMapArea();
		setImages();
		setOutputArea();
		mapArea.setText(get_map());
	}
	
	private String get_map(){
		String map = "";
		
		try{  infile = new Scanner(new FileReader(PATH_TO_FILES + "empty_map.txt"));  }
		
		catch(FileNotFoundException fnf)
		{
			System.err.println(fnf);
			System.exit(0);
		}
		while(infile.hasNext()){
			map += infile.nextLine() + "\n";
		}
			
		return map;
	}
	private void setWindow(){
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();

		int x_pos = dim.width/2 - WINWIDTH/2;
		int y_pos = dim.height/2 - WINHEIGHT/2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x_pos, y_pos, WINWIDTH, WINHEIGHT);
		setSize(WINWIDTH, WINHEIGHT);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
	private void createMapArea(){
		String emptyMap = "";
		mapArea = new JTextPane();
		mapArea.setText(emptyMap);
		mapArea.setBackground(Color.LIGHT_GRAY);
		mapArea.setEditable(false);
		mapArea.setBounds(LABELSIZE, TOP,MAP_AREA_WIDTH, MAP_AREA_HEIGHT);
		contentPane.add(mapArea);
		mapArea.setBorder(new LineBorder(Color.black));
	}
	private void createInputArea(){
		//editable area to enter commands
		inputArea = new JEditorPane();
		inputArea.setText("Enter Commands Here");
		inputArea.setBounds(LABELSIZE + MAP_AREA_WIDTH, WINHEIGHT- EDIT_AREA_HEIGHT - BORDER, OUTPUT_AREA_WIDTH, EDIT_AREA_HEIGHT);
		contentPane.add(inputArea);

	}
	private void setImages(){
		// useful images off to the right
		lblNewLabel = new JLabel("<html>Images of...something</html>");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(0, TOP, LABELSIZE, LABELSIZE);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("Image of something");
		label.setBorder(new LineBorder(new Color(0, 0, 0)));
		label.setBounds(0, 45, LABELSIZE, LABELSIZE);
		contentPane.add(label);
		
		label_1 = new JLabel("Image of something");
		label_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_1.setBounds(0, 90, LABELSIZE, LABELSIZE);
		contentPane.add(label_1);

	}
	private void setOutputArea(){
		//uneditable TextPane to read output
		outputArea = new JTextPane();
		outputArea.setText("Area to read output from game");
		outputArea.setBackground(Color.LIGHT_GRAY);
		outputArea.setEditable(false);
		outputArea.setBounds(LABELSIZE + MAP_AREA_WIDTH, TOP, OUTPUT_AREA_WIDTH, OUTPUT_AREA_HEIGHT);
		contentPane.add(outputArea);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
