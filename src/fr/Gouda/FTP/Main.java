package fr.Gouda.FTP;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) {
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch (Exception e){
			System.out.println("Unable to load Windows look and feel");
		}
		
		Frame GUI = new Frame();
			
		GUI.setSize(700, 500);
		GUI.setLocationRelativeTo(null);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setVisible(true);
		GUI.setResizable(false);
	//	GUI.getContentPane().setBackground(Color.BLUE);
	
		/*
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}catch (Exception e){
				System.out.println("Unable to load Windows look and feel");
			}
		
			Frame GUI2 = new Frame();
				
			GUI2.setSize(275, 100);
			GUI2.setLocationRelativeTo(null);
			GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GUI2.setVisible(true);
			GUI2.setResizable(false);
			GUI2.getContentPane().setBackground(Color.BLUE);
		
		}
*/
	}
		
}
