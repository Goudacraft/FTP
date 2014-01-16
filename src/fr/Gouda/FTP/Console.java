package fr.Gouda.FTP;

import javax.swing.text.*;
import java.awt.*;

/**
 * User: Alexandre
 *
 * Class pour sortir des types de messages différent dans la console.
 */

public class Console extends Frame{

	private static StyledDocument Text = JTextPane_Console.getStyledDocument();
	private static SimpleAttributeSet Colors = new SimpleAttributeSet();

	public static void Error(String error){
		StyleConstants.setForeground(Colors, Color.RED);
		try{
			Text.insertString(0, error+"\n", Colors);
		}catch(Exception e) { System.out.println(e); }

	}

	public static void Info(String info){
		StyleConstants.setForeground(Colors, Color.BLACK);
		try{
			Text.insertString(0, info+"\n", Colors);
		}catch(Exception e) { System.out.println(e); }
	}

	public static void Warning(String warn){
		StyleConstants.setForeground(Colors, Color.ORANGE);
		try{
			Text.insertString(0, warn+"\n", Colors);
		}catch(Exception e) { System.out.println(e); }
	}
}