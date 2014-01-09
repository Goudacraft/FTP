package fr.Gouda.FTP;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;



public class Frame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L; // Salut je vais faire un peu plus. Kikou lol.

		public JButton	JButton_Parcourir_Local = new JButton("Parcourir"),
						JButton_Parcourir_FTP = new JButton("Parcourir");
		
		public JTree 	JTree_Local = new JTree(),
						JTree_FTP = new JTree();
		
		public JMenuBar JMB = new JMenuBar();
		
		public JMenu JM = new JMenu("JM");
		
		public JTextArea 	JTA = new JTextArea(),
							JTA2 = new JTextArea();
		
		public JScrollPane 	JSP = new JScrollPane(JTree_Local, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER),
							JSP2 = new JScrollPane();
		
		public JMenuItem JMI = new JMenuItem("JMI");
		
		
		
		public void Button(){					  
			JButton_Parcourir_Local.setFocusPainted(false);
			JButton_Parcourir_Local.addActionListener(this);
			JButton_Parcourir_Local.setBounds(575, 225,100,25);
			
			add(JButton_Parcourir_Local);
			
			/*-------------------------*/
			
			JButton_Parcourir_FTP.setFocusPainted(false);
			JButton_Parcourir_FTP.addActionListener(this);
			JButton_Parcourir_FTP.setBounds(575, 20,100,25);
			
			add(JButton_Parcourir_FTP);
		}
		
		public void Tree(){
			JTree_Local.add(JSB);
			JTree_Local.setBounds(20,20,520,175);
			JTree_Local.setEditable(true);
			JTree_Local.setLayout(null);
			
			add(JTree_Local);		
			
			/*-------------------------*/
			
			JTree_FTP.add(JSP2);
			JTree_FTP.setBounds(20,225, 520,175);
			JTree_FTP.setEditable(true);
			
			add(JTree_FTP);
		}
		
		public void MenuBar(){
			setJMenuBar(JMB);
			JMB.add(JM);
			
		}
		
		public void JMI(){
			
			add(JMI);
			
		}
		
		public void JSB(){
			JSB.setAutoscrolls(isVisible());
			add(JSB);
		}
		
		public void JSP2(){
			JSP2.setAlignmentX(getX());;
			
		}
		
		/*public void JTA(){
			JTA.add(JT);
			JTA.setBounds(20,20,520,175);
			JTA.setEditable(false);
			add(JTA);
			
		}
		
		public void JTA2(){
			JTA2.add(JT2);
			JTA2.setBounds(20,225, 520,175);
			JTA2.setEditable(false);
			add(JTA2);
		}
		
		public void JSP(){
			JSP.setBounds(20,225,50,175);
			add(JSP);
		}
		
		public void JTree(Hashtable value){
		JTree tree = new JTree(System.getProperties());
		}
		
	
		  
			
		public void JTree(Vector value){
		Vector vector = new Vector();
		vector.add("One");
		vector.add("Two");
		JTree tree = new JTree(vector);
		}

		public void JTree(TreeModel value){
		Object[] aTreeModel;
		JTree tree = new JTree(aTreeModel);
		}
		
		public void JTree(TreeNode value, boolean asksAllowsChildren){
		TreeNode aTreeNode;
		JTree tree = new JTree(aTreeNode, true);
		
		}
		*/
		
		public void init(){
			Button();
			Tree();
			JMB();
		//	JTA();
			//JTA2();
			//JSP();
			JSP2();
			JSB();
		}
		
		public Frame(){
			super("FTP");
			setLayout(null);
			
			init();
		}		

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == FTP){//??
				String[] url = {"ftp://cucch_13675533:Halimi02@ftp.cuccfree.com"};
				
			try {
				for(int i=0; i<=url.length; i++){
					try{
						Desktop.getDesktop().browse(java.net.URI.create(url[i]));
					}catch(Exception ee){
						
					}
				}
			
			} catch (Exception er) {	
				System.out.println(er.getMessage());		  
			}    
		}		
	}
}

		