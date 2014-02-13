package fr.FTP.About;


import javax.swing.*;

/**
 * User: Alexandre
 */
public class AboutMain {

	public AboutMain() {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch (Exception e){
			System.out.println("Unable to load Windows look and feel");
		}

		AboutFrame GUI = new AboutFrame();

		GUI.setSize(300, 450);
		GUI.setLocationRelativeTo(null);
		GUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GUI.setVisible(true);
		GUI.setResizable(false);
	}
}
