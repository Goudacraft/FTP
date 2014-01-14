package fr.Gouda.FTP;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;


import javax.swing.*;
import javax.swing.border.Border;


/*
TODO: Faire Des JPanel.

 */

public class Frame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public JPanel   JPanel_Local = new JPanel(),
					Jpanel_FTP = new JPanel();

	public JButton	JButton_Parcourir_Local = new JButton("Parcourir"),
					JButton_Parcourir_FTP = new JButton("Parcourir"),
					JButton_Console = new JButton("Console");

	public JTree 	JTree_Local = new JTree(),
					JTree_FTP = new JTree();

	public JMenuBar JMB = new JMenuBar();

	public JMenu JM = new JMenu("File"),
				 JM2 = new JMenu("Edit"); 

	public JTextArea 	JTA = new JTextArea(),
						JTA2 = new JTextArea();
		
	public JScrollPane 	JSP = new JScrollPane(JTree_Local, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER),
						JSP2 = new JScrollPane();
		
	public JMenuItem JMI = new JMenuItem("Ouvrir"),
					 JMI2 = new JMenuItem("Enregistrer");

	public JSeparator JSeperator_Split = new JSeparator();


	public void JPanel(){
		JPanel_Local.setBounds(0,0,695,225);
		Border border = BorderFactory.createLineBorder(Color.blue);
		JPanel_Local.setBorder(border);
		add(JPanel_Local);
	}

	public void Seperator(){
		JSeperator_Split.setOrientation(SwingConstants.HORIZONTAL);

		add(JSeperator_Split);
	}

	public void Button(){
		JButton_Parcourir_Local.setFocusPainted(false);
		JButton_Parcourir_Local.addActionListener(this);
		JButton_Parcourir_Local.setBounds(575, 225, 100, 25);
			
		add(JButton_Parcourir_Local);
			
		/*-------------------------*/
			
		JButton_Parcourir_FTP.setFocusPainted(false);
		JButton_Parcourir_FTP.addActionListener(this);
		JButton_Parcourir_FTP.setBounds(575, 20,100,25);
			
			
		add(JButton_Parcourir_FTP);
			
		/*--------------------------*/
			
		JButton_Console.setFocusPainted(false);
		JButton_Console.addActionListener(this);
		JButton_Console.setBounds(613, 418,100,25);
		JButton_Console.setOpaque(false);
		JButton_Console.setContentAreaFilled(false);
		JButton_Console.setBorderPainted(false);
		JButton_Console.setBorder(null);

		
		add(JButton_Console);
	}
		
	public void Tree(){
		JTree_Local.setBounds(20, 20, 520, 175);
		JTree_Local.setEditable(true);
		JTree_Local.setLayout(null);

		JPanel_Local.add(JTree_Local);

		/*-------------------------*/

		JTree_FTP.add(JSP2);
		JTree_FTP.setBounds(20,225, 520,175);
		JTree_FTP.setEditable(true);

		add(JTree_FTP);
	}
		
	public void MenuBar(){
		setJMenuBar(JMB);
		JMB.add(JM);
		JMB.add(JM2);

	}
		
	public void Menu(){

		JM.add(JMI);
		JM.add(JMI2);
	}
		
	public void JMI(){
		add(JMI);
	}
	
	public void JSP2(){
		JSP2.setAlignmentX(getX());;
			
	}

	public void init(){
		JPanel();
		Seperator();
		Button();
		Tree();
		MenuBar();
		JSP2();
		JMI();
		Menu();
	}
		
	public Frame(){
		super("FTP");
		setLayout(null);
			
		init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == JButton_Parcourir_FTP){
			String[] url = {"ftp://cucch_13675533:Halimi02@ftp.cuccfree.com/htdocs/"};
			try {
				for(int i=0; i<=url.length; i++){
					try{
						Desktop.getDesktop().browse(java.net.URI.create(url[i]));
					}catch(Exception ee){}
				}
			} catch (Exception er) {
				System.out.println(er.getMessage());
			}
		}
	}
}
