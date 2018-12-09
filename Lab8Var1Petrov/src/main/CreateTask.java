package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CreateTask {
	int i = 0;
	protected JTextArea textArea;
	JTextField input,output;
    JButton print;
	public JPanel createContentPane (){
		JPanel taskGUI = new JPanel();
		taskGUI.setBackground(Color.white);
		JButton b=new JButton("Submit");    
		b.setBounds(150,200,100, 40);    
		JLabel taskLabel = new JLabel();
		
		taskLabel.setText("Task text: ");
		taskLabel.setBounds(10, 10, 100, 30);
		
		
		//Time
		 MaskFormatter mask = null;
	        try {
	            mask = new MaskFormatter("##h##min##s");//the # is for numeric values
	            mask.setPlaceholderCharacter('#');
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        final JFormattedTextField timeField = new JFormattedTextField(mask);

	        //Add ActionListener for when enter is pressed
	        timeField.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent ae) {
	                Object source = ae.getSource();
	                if (source == timeField) {
	                    //parse to a valid time here
	                    System.out.println(timeField.getText());
	                }
	            }
	        });
	        timeField.setBounds(90, 50, 200, 30);
	        taskGUI.add(timeField);
	        
	        //TimeLabel
	        
	        JLabel time_label = new JLabel();
	        time_label.setText("Task time: ");
	        time_label.setBounds(10, 50, 100, 30);
	        taskGUI.add(time_label);
	        
	        //ImportanceBox
	        
	        JComboBox<String> impBox = new JComboBox<String>();
	        impBox.addItem("Important");
	        impBox.addItem("Not really");
	        impBox.addItem("Not important");
	        impBox.setEditable(false);
	        impBox.setBounds(90, 100, 200, 30);
	        taskGUI.add(impBox);
	        
	        //ImportanceLabel
	        
	        JLabel imp_label = new JLabel();
	        imp_label.setText("Task time: ");
	        imp_label.setBounds(10, 100, 100, 30);
	        taskGUI.add(imp_label);
	       
	        //SetColorPanel
	        JLabel color_label = new JLabel();
	        color_label.setText("Choose color: ");
	        color_label.setBounds(10, 150, 100, 30);
	        taskGUI.add(color_label);
	        
	        JComboBox<String> setColor = new JComboBox<String>();
	        setColor.addItem("Red");
	        setColor.addItem("Green");
	        setColor.addItem("Yellow");
	        setColor.addItem("White");
	        
	        setColor.addActionListener(new ActionListener() {
	        	@Override
	        	 public void actionPerformed(ActionEvent e) {
	        		switch (String.valueOf(setColor.getSelectedItem())) {
	        		case "Red": taskGUI.setBackground(Color.red); break;
	        		case "Green": taskGUI.setBackground(Color.green); break;
	        		case "Yellow": taskGUI.setBackground(Color.yellow); break;
	        		case "White": taskGUI.setBackground(Color.white); break;
	        		default:
	                    throw new IllegalArgumentException("Invalid day of the week: " + String.valueOf(setColor.getSelectedItem()));
	        		}
	        	}});
	        setColor.setBounds(90, 150, 200, 30);
	        taskGUI.add(setColor);
					//textfield to enter name
		JTextField textfield= new JTextField();
		textfield.setBounds(90, 10, 200, 30);
					//add to frame
			taskGUI.add(textfield);
			taskGUI.add(taskLabel);
			taskGUI.add(b);    
			taskGUI.setSize(300,300);    
			taskGUI.setLayout(null);    
			taskGUI.setVisible(true);
		
		
		b.addActionListener(new ActionListener() {
	        
			
			public void actionPerformed(ActionEvent arg0) {
					mainFrame myMain = new 	mainFrame();	
					String task = textfield.getText() + ' ' + timeField.getText() + ' ' + impBox.getSelectedItem();
					System.out.println(task);
					myMain.setLabelText(task, i);
					i++;
			}          
	      });
		
		return taskGUI;
	} 
}
