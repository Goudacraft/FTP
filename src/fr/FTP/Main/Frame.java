package fr.FTP.Main;

import fr.FTP.Console.Console;
import fr.FTP.About.AboutMain;
import fr.FTP.Console.Console.Level;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * @author : 3751_Creator & Goudacraft
 */

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

	public JMenuBar JMenuBar = new JMenuBar();

	public JMenu    JMenu_File = new JMenu("File"),
					JMenu_Edit = new JMenu("Edit"),
					JMenu_Connexion = new JMenu("Connexion"),   // TODO: Faire nouveau Frame pour entrer connexion.
					JMenu_About = new JMenu("About");

	public JMenuItem 	JMenuItem_Ouvrir = new JMenuItem("Ouvrir"),             // JMenu_File
						JMenuItem_Enregistrer = new JMenuItem("Enregistrer"),   // JMenu_File

						JMenuItem_SurNous = new JMenuItem("Sur Nous"),          // JMenu_About
						JMenuItem_Rapport = new JMenuItem("Rapport Erreur");    // JMenu_About

	public static JTextPane JTextPane_Console = new JTextPane();
		
	public JScrollPane JScrollPane_Console = new JScrollPane(JTextPane_Console, 
															JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
															JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	//public JFileChooser JFileChooser_FTP = new JFileChooser();

	public JLabel Border_Console = new JLabel();


	/** 
		* Sets font for specified Object *
	*/

	public void Font(){
		Border_Console.setFont(new Font("Arial", Font.PLAIN, 12));
	}
	
	/**
		* Sets border to specified object *
	*/

	public void Border(){
		Border_Console.setBorder(BorderFactory.createTitledBorder("Console"));
		Border_Console.setBounds(5, 5, 389, 430);

		JPanel_Console.add(Border_Console, BorderLayout.CENTER);
	}

	/**
		* Init JPanels: FTP section, Local & Console *
	*/

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
	
	/**
		* Init JButtons *
	*/

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
	
	/**
		* Init JTextPane for Console + JScrollPane *
	*/

	public void TextPane(){
		JScrollPane_Console.setBounds(15, 20, 369, 405);
		JTextPane_Console.setEditable(false);

		JPanel_Console.add(JScrollPane_Console);
	}
		
	public void Tree(){	//TODO: Find a better way to display files.
		JTree_Local.setBounds(20, 20, 520, 175);
		JTree_Local.setEditable(true);
		JTree_Local.setLayout(null);

		JPanel_Local.add(JTree_Local);

		/*-------------------------*/

		JTree_FTP.setBounds(20,225, 520,175);
		JTree_FTP.setEditable(true);

		JPanel_FTP.add(JTree_FTP);
	}
		
	public void MenuBar(){
		setJMenuBar(JMenuBar);
		JMenuBar.add(JMenu_File);
		JMenuBar.add(JMenu_Edit);
		JMenuBar.add(JMenu_Connexion);
		JMenuBar.add(JMenu_About);
	}
		
	public void MenuItem(){
		JMenu_File.add(JMenuItem_Enregistrer);
		JMenu_File.add(JMenuItem_Ouvrir);

		JMenu_About.add(JMenuItem_SurNous);
		JMenu_About.addSeparator();
		JMenu_About.add(JMenuItem_Rapport);

		JMenuItem_SurNous.addActionListener(this);
		JMenuItem_Rapport.addActionListener(this);
	}

	public void FileChooser(){
		/*add(JFileChooser_FTP);

		JFileChooser_FTP.addActionListener(this);*/
	}

	public void Tooltip(){
		JMenuItem_Rapport.setToolTipText("Demande une connexion internet");
	}

	public void preInit(){
		Font();
		Border();
		Button();
		Tooltip();
	}

	public void init(){
		TextPane();
		JPanel();
		Tree();
		MenuBar();
		MenuItem();
		Label();
		FileChooser();
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
			if(getSize().getWidth() >= 750){
				/** If True (Retirer) */
				for(int i=1090; i > 689; i--){
					setSize(i, 490);
				}
			}else{
				/** If False (Etirer) */
				for(int i=689; i < 1090; i++){
					setSize(i, 490);
				}
			}
		}
		if(src == JButton_Parcourir_FTP){

			Console.setName(JTextPane_Console);
			Console.add(Level.SUCCES, "SUCCES !!!!!");
			Console.add(Level.ERROR, "This is a error ");
			Console.addCustom("USER", 100, 100, 100, "dg");
			Console.add(Level.INFO, "Yo");
			Console.add(Level.WARNING, "Yo");
		}
		if(src == JMenuItem_SurNous){
			String yo = "<hmtl><b>Auteurs:</b> Goudacraft & 3751_Creator</hmtl>";
			JOptionPane.showMessageDialog(null, yo, "Sur Nous", JOptionPane.PLAIN_MESSAGE); //TODO: faire logo.

		/*	try {
				new AboutMain();
			} catch (Exception e1) {
				System.out.println("Cannot load About.java");
				e1.printStackTrace();
			}*/
		}
		if(src == JMenuItem_Rapport){
			try {
				Desktop.getDesktop().browse(new URL("https://github.com/Goudacraft/FTP/issues").toURI());
			} catch (Exception e1) {
				System.out.println("Cannot load Page");
				e1.printStackTrace();
			}
		}
		if(src == JButton_Parcourir_FTP){
			//JFileChooser_FTP.showOpenDialog(this);
		}
	}
}
