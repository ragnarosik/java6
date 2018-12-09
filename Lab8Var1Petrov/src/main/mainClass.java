package main;

import main.mainFrame;
import javax.swing.*;

public class mainClass {
	 public static void main(String[] args) {
         JFrame frame = new JFrame("Daily manager");
         mainFrame demo = new mainFrame();
         frame.setContentPane(demo.createContentPane());
   
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 300);
         frame.setVisible(true);
		  }
}
