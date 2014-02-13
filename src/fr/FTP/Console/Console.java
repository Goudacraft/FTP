package fr.FTP.Console;

import javax.swing.text.*;
import java.awt.*;

/**
 * User: Alexandre
 *
 * Class pour sortir des types de messages différent dans la console.
 */

public class Console extends fr.FTP.Main.Frame {

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
		Color ORANGE = new Color(252, 156, 51);
		StyleConstants.setForeground(Colors, ORANGE);
		try{
			Text.insertString(0, warn+"\n", Colors);
		}catch(Exception e) { System.out.println(e); }
	}

	public static void Succes(String succes){
		Color DARK_GREEN = new Color(58, 157, 52);
		StyleConstants.setForeground(Colors, DARK_GREEN);
		try{
			Text.insertString(0, succes+"\n", Colors);
		}catch(Exception e) { System.out.println(e); }
	}
}