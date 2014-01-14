package fr.Gouda.FTP;

import javax.swing.*;
import javax.swing.border.Border;
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

public class Frame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public JPanel   JPanel_Local = new JPanel(),
					JPanel_FTP = new JPanel(),
					JPanel_Console = new JPanel();

	public JButton	JButton_Parcourir_Local = new JButton("Parcourir"),
					JButton_Parcourir_FTP = new JButton("Parcourir"),
					JButton_Console = new JButton("Console");

	public JTree 	JTree_Local = new JTree(),
					JTree_FTP = new JTree();

	public JMenuBar JMB = new JMenuBar();

	public JMenu    JM = new JMenu("File"),
				    JM2 = new JMenu("Edit"),
					JMenu_Connexion = new JMenu("Connexion");   // TODO: Faire nouveau Frame pour entrer connexion.

	public static JEditorPane JTextArea_Console = new JEditorPane();
		
	public JScrollPane 	JScrollPane_Console = new JScrollPane(JTextArea_Console, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER),
						JSP2 = new JScrollPane();
		
	public JMenuItem JMI = new JMenuItem("Ouvrir"),
					 JMI2 = new JMenuItem("Enregistrer");

	public JSeparator JSeperator_Split = new JSeparator();

	public JLabel   Border_Local = new JLabel(),
					Border_FTP = new JLabel(),
					Border_Console = new JLabel();

	public void Font(){
		Border_Local.setFont(new Font("Arial", Font.PLAIN, 12));
		Border_FTP.setFont(new Font("Arial", Font.PLAIN, 12));
		Border_Console.setFont(new Font("Arial", Font.PLAIN, 12));
	}

	public void Border(){
		Border_Local.setBorder(BorderFactory.createTitledBorder("Local"));
		Border_Local.setBounds(265, 5, 83, 60);

		JPanel_Local.add(Border_Local);

        /*------------------------------*/

		Border_FTP.setBorder(BorderFactory.createTitledBorder("FTP"));
		Border_FTP.setBounds(354, 5, 83, 60);

		JPanel_FTP.add(Border_FTP);

        /*------------------------------*/

		Border_Console.setBorder(BorderFactory.createTitledBorder("Console"));
		Border_Console.setBounds(5, 5, 389, 430);

		JPanel_Console.add(Border_Console, BorderLayout.CENTER);
	}

	public void JPanel(){
		Border border = BorderFactory.createLineBorder(Color.blue);
		Border border2 = BorderFactory.createLineBorder(Color.red);
		Border border3 = BorderFactory.createLineBorder(Color.darkGray);

		JPanel_Local.setBounds(0, 0, 684, 220);
		JPanel_Local.setLayout(null);
		JPanel_Local.setBorder(border);

		add(JPanel_Local);

		/*-------------------------*/

		JPanel_FTP.setBounds(0, 220, 684, 220);
		JPanel_FTP.setLayout(null);
		JPanel_FTP.setBorder(border2);

		add(JPanel_FTP);

		/*-------------------------*/

		JPanel_Console.setBounds(684, 0, 399, 440);
		JPanel_Console.setLayout(new BorderLayout());
		JPanel_Console.setBorder(border3);

		add(JPanel_Console);
	}

	public void Label(){

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
		JButton_Parcourir_FTP.setBounds(575, 20, 100, 25);
			
			
		add(JButton_Parcourir_FTP);
			
		/*--------------------------*/

		Dimension JButton_Console_Size = JButton_Console.getPreferredSize();
		JButton_Console.setFocusPainted(false);
		JButton_Console.addActionListener(this);

		JButton_Console.setBounds(620, 200, JButton_Console_Size.width, JButton_Console_Size.height);
		JButton_Console.setOpaque(false);
		JButton_Console.setContentAreaFilled(false);
		JButton_Console.setBorderPainted(false);
		JButton_Console.setBorder(null);

		
		JPanel_FTP.add(JButton_Console);
	}

	public void TextPane(){
		JScrollPane_Console.setBounds(15, 20, 369, 405);
	//	JTextArea_Console.setWrapStyleWord(false);
		JTextArea_Console.setEditable(false);

		JPanel_Console.add(JScrollPane_Console);
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

		JPanel_FTP.add(JTree_FTP);
	}
		
	public void MenuBar(){
		setJMenuBar(JMB);
		JMB.add(JM);
		JMB.add(JM2);
		JMB.add(JMenu_Connexion);
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

	public void preInit(){
		Font();
		Border();
		Button();
	}

	public void init(){
		TextPane();
		JPanel();
		Seperator();
		
		Tree();
		MenuBar();
		JSP2();
		JMI();
		Menu();
		Label();
	}
		
	public Frame(){
		super("FTP");
		setLayout(null);

		preInit();
		init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == JButton_Console){
			System.out.println(getSize().getWidth());
			if(getSize().getWidth() >= 750){
				/** If True (Retirer) */
				for(int i=1100; i > 699; i--){
					setSize(i, 500);
				}
			}else{
				/** If False (Etirer) */
				for(int i=699; i < 1100; i++){
					setSize(i, 500);
				}
			}
		}
		if(src == JButton_Parcourir_FTP){
			Console.Error("ERROR !!!!!");
			Console.Info("INFO !!!!!");
			Console.Warning("WARNING !!!!!");
		/*	String[] url = {"ftp://cucch_13675533:Halimi02@ftp.cuccfree.com/htdocs/"};
			try {
				for(int i=0; i<=url.length; i++){
					try{
						Desktop.getDesktop().browse(java.net.URI.create(url[i]));
					}catch(Exception ee){}
				}
			} catch (Exception er) {
				System.out.println(er.getMessage());
			}*/
		}
	}
}
