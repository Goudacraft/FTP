package fr.Gouda.FTP;

import java.awt.Adjustable;
import java.awt.Desktop;
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



public class Frame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L; // OYOYO

		public JButton FTP = new JButton("Parcourir");
		public JTree JT = new JTree();
		public JMenuBar JMB = new JMenuBar();
		public JMenu JM = new JMenu("JM");
		public JTextArea JTA = new JTextArea();
		public JScrollPane JSP = new JScrollPane(JT,
			      JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		public JTextArea JTA2 = new JTextArea();
		public JButton JB2 = new JButton("Parcourir");
		public JTree JT2 = new JTree();
		public JScrollPane JSP2 = new JScrollPane();
		public JMenuItem JMI = new JMenuItem("JMI");
		
		
		public void Next_Button(){					  
			FTP.setFocusPainted(false);
			FTP.addActionListener(this);
			FTP.setBounds(575, 225,100,25);
			
			add(FTP);
		}
		
		public void browse_Button(){
			JB2.setFocusPainted(false);
			JB2.addActionListener(this);
			JB2.setBounds(575, 20,100,25);
			add(JB2);
		}
		
		
		
		public void JTree(){

			JT.setBounds(20,20,520,175);
			JT.setEditable(true);
			JT.setLayout(null);
			add(JT);		
			
			
		}
		
		
		public void JT2(){
			JT2.add(JSP2);
			JT2.setBounds(20,225, 520,175);
			JT2.setEditable(true);
			add(JT2);
			
		}
		
		
		
		public void JMB(){
			setJMenuBar(JMB);
			JMB.add(JM);
			
				}
		
		public void JMI(){
			
			add(JMI);
			
		}
		
		public void JSP(){
			add(JSP);
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
		
		
		public void preInit(){
			
		}
		
		
		public void init(){
			Next_Button();
			JTree();
			JMB();
		//	JTA();
			//JTA2();
			browse_Button();
			JSP();
			JT2();
			JSP2();
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
			if(src == FTP){
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

		