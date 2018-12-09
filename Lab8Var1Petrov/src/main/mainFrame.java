package main;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class mainFrame {
	public Label[] result = new Label[10];
	public JPanel totalGUI = new JPanel();
	
	
	public JPanel createContentPane (){
		totalGUI.setLayout(null);
		JLabel blueLabel = new JLabel("");
		blueLabel.setLocation(-60, -30);
		blueLabel.setSize(300, 100);
		blueLabel.setHorizontalAlignment(0);
		blueLabel.setForeground(Color.blue);
		totalGUI.add(blueLabel);
		// Создаём кнопку
		JButton redButton = new JButton("Новая задача");
		
		redButton.setLocation(120, 200); // это координаты кнопки
		redButton.setSize(150,30 ); // это размер кнопки
		totalGUI.add(redButton);
		redButton.addActionListener(new newTask());
		
		return totalGUI;
	}
	public void setLabelText(String text, int i) {
		result[i].setText(text);
		result[i].setBounds(10, 10 + 50* i, 200, 30);;
		totalGUI.add(result[i]);
	}
}

class newTask implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	 JFrame frame1 = new JFrame("Task");
    	 CreateTask demo = new CreateTask();
         frame1.setContentPane(demo.createContentPane());
   
         frame1.setDefaultCloseOperation(1);
         frame1.setSize(400, 300);
         frame1.setVisible(true);
    }
}

