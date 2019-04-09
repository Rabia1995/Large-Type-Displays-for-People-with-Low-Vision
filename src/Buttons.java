//RABIA TARIQ

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class Buttons {

	private JFrame frame;
    private JTextArea textArea;
    private JComboBox<String> comboBox;
    private JCheckBox checkBox;
    private JButton decrease;
    private JButton increase;
    private JButton TextColor;
    private JButton BackgroundColor;
    private JButton textAreaColor;
    private JPanel panel;
	/*
	  Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buttons window = new Buttons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/*
	  Create the application.
	 */
	public Buttons() {
		initialize();
	}

	/*
	  Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 20));
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//Create Text Area
		textArea = new JTextArea("ENTER TEXT");
		textArea.setFont(new Font("Arial", Font.PLAIN, 20));
		textArea.setBounds(26, 249, 366, 101);
		frame.getContentPane().add(textArea);
		
		//Create Font Options
		comboBox = new JComboBox<String>();
		comboBox.addItem("Serif");
		comboBox.addItem("SansSerif");
		comboBox.addItem("Monospaced");
        comboBox.addActionListener(new ActionListener() {
 	    public void actionPerformed(ActionEvent e) {
 	    	if(checkBox.isSelected()) {
 	    	JComboBox<?> source =(JComboBox<?>) e.getSource();
 	    	String item = (String)source.getSelectedItem();
 	    	textArea.setFont(new Font(item, Font.BOLD, 20));}
 	    	else
 	    	{
 	    	JComboBox<?>source =(JComboBox<?>) e.getSource();
 	    	String item = (String)source.getSelectedItem();
 	    	textArea.setFont(new Font(item, Font.PLAIN, 20));
 	    	}
 	}
 });
		comboBox.setBounds(26, 150, 235, 52);
		frame.getContentPane().add(comboBox);
		
		
		//Create Checkbox
		checkBox = new JCheckBox("Bold");
		checkBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Font font = null;
				if(checkBox.isSelected())
				
					font = new Font(null,Font.BOLD, 20);
				else
					font = new Font(null, Font.PLAIN,20);
				textArea.setFont(font);
			
			}
		});
				
					
		
		checkBox.setFont(new Font("Arial", Font.BOLD, 20));
		checkBox.setBounds(332, 163, 105, 34);
		frame.getContentPane().add(checkBox);
		
		//Create decrease button
		decrease = new JButton("Decrease Font Size");
		decrease.setFont(new Font("SansSerif", Font.PLAIN, 20));
		decrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font font = textArea.getFont();
				float size = font.getSize() - 1.0f;
				textArea.setFont(font.deriveFont(size));
			}
		});
		decrease.setBounds(26, 28, 225, 66);
		frame.getContentPane().add(decrease);
		
		//Create increase button
		increase = new JButton("Increase Font Size");
		increase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font font = textArea.getFont();
				float size = font.getSize() + 1.0f;
				textArea.setFont(font.deriveFont(size));
			}
		});
		increase.setFont(new Font("Arial", Font.PLAIN, 20));
		increase.setBounds(283, 28, 217, 66);
		frame.getContentPane().add(increase);	
		
		BackgroundColor = new JButton("Background Color");
		BackgroundColor.addActionListener(new ActionListener() {
			
			//Change the color of background
			
			public void actionPerformed(ActionEvent e) {
				JColorChooser colorpicker = new JColorChooser();
				Color c = JColorChooser.showDialog(null, "Pick a color", null);
				panel.setBackground(c); 
				
			}
				
		});
		BackgroundColor.setFont(new Font("Arial", Font.PLAIN, 20));
		BackgroundColor.setBounds(555, 243, 193, 41);
		frame.getContentPane().add(BackgroundColor);
		
		TextColor = new JButton("Text Color");
		TextColor.addActionListener(new ActionListener() {
			
			//Change the color of text
			
			public void actionPerformed(ActionEvent e) {
				JColorChooser colorpicker = new JColorChooser();
				Color c = JColorChooser.showDialog(null, "Pick a color", null);
				textArea.setForeground(c);
				
			
			}
		});
		TextColor.setFont(new Font("Arial", Font.PLAIN, 20));
		TextColor.setBounds(555, 104, 193, 41);
		frame.getContentPane().add(TextColor);
		
		textAreaColor = new JButton("Text Box Color");
		textAreaColor.addActionListener(new ActionListener() {
			
			//Change the color of Text Area
			
			public void actionPerformed(ActionEvent e) {
				JColorChooser colorpicker = new JColorChooser();
				Color c = JColorChooser.showDialog(null, "Pick a color", null);
				textArea.setBackground(c);
			}
		});
		textAreaColor.setFont(new Font("Arial", Font.PLAIN, 20));
		textAreaColor.setBounds(555, 173, 193, 41);
		frame.getContentPane().add(textAreaColor);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 968, 412);
		frame.getContentPane().add(panel);
		
		
	}
}
