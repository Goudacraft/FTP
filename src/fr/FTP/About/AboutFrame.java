package fr.FTP.About;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: Alexandre
 */
public class AboutFrame extends JFrame implements ActionListener{

	public JLabel JLabel_Info = new JLabel();

	public void Label(){
		JLabel_Info.setText("A"+
				"B"+
				"C");
		JLabel_Info.setLocation(5,5);
		add(JLabel_Info);
	}

	public void init(){
		Label();
	}

	public AboutFrame(){
		setLayout(null);
		setTitle("Sur Nous");

		init();
	}

	@Override
	public void actionPerformed(ActionEvent e){

	}
}
