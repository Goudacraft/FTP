package fr.Gouda.FTP;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

/**
 * User: Alexandre
 *
 * Class pour sortir des types de messages différent dans la console.
 */
public class Console extends Frame{
	public static void Error(String error){
		JTextArea_Console.setForeground(Color.RED);
		//JTextArea_Console.add(error + "\n");
	}

	public static void Info(String info){
		JTextArea_Console.setForeground(Color.BLACK);
	//	JTextArea_Console.append(info + "\n");
	}

	public static void Warning(String warn){
		JTextArea_Console.setForeground(Color.ORANGE);
	//	JTextArea_Console.append(warn + "\n");
	}

/*	public static void Error(String error){
		JTextArea_Console.append("<html><font color=red>" + error + "</font><br/></html>");
	}

	public static void Info(String info){
		JTextArea_Console.append("<html><font color=red>" + info + "</font><br/></html>");
	}

	public static void Warning(String warn){
		JTextArea_Console.append("<html><font color=red>" + warn + "</font><br/></html>");
	}*/

}