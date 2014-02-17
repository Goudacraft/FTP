package fr.FTP.Console;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

/**
 * User: Alexandre
 *
 * Class pour sortir des types de messages différent dans la console.
 */

/*
	TODO: do as [Origin error] MSG
	 so setFoobar(String A, String B)

 */

public class Console {

	private static StyledDocument Text = null;

	/**
	 * @param Name Gets the name of the JTextPane to be able to use the Console features.
	 */
	public static void getName(JTextPane Name){
		Text = Name.getStyledDocument();
	}

	private static SimpleAttributeSet Colors = new SimpleAttributeSet();

	/**
	 * @param Error Adds a error message to the console.
	 */
	public static void setError(String Error){
		StyleConstants.setForeground(Colors, Color.RED);
		try{
			Text.insertString(0, Error + "\n", Colors);
		}catch(Exception e) { ConsoleError(); }

	}

	/**
	 * @param Info Adds an info message to the console.
	 */
	public static void setInfo(String Info){
		StyleConstants.setForeground(Colors, Color.BLACK);
		try{
			Text.insertString(0, Info + "\n", Colors);
		}catch(Exception e) { ConsoleError(); }
	}

	/**
	 * @param Warn Adds a warning message to the console.
	 */
	public static void setWarning(String Warn){
		Color ORANGE = new Color(252, 156, 51);
		StyleConstants.setForeground(Colors, ORANGE);
		try{
			Text.insertString(0, Warn + "\n", Colors);
		}catch(Exception e) { ConsoleError(); }
	}

	/**
	 * @param Succes Adds a succesful message to the console.
	 */
	public static void setSucces(String Succes){
		Color DARK_GREEN = new Color(58, 157, 52);
		StyleConstants.setForeground(Colors, DARK_GREEN);
		try{
			Text.insertString(0, Succes + "\n", Colors);
		}catch(Exception e) { ConsoleError(); }
	}

	/**
	 * @param R Red Color. 0 <= R <= 255  |  [0;255]
	 * @param G Green Color. 0 <= R <= 255  |  [0;255]
	 * @param B Blue Color. 0 <= R <= 255  |  [0;255]
	 * @param Custom Adds a custom message with a specific givin color to the console.
	 */
	public static void setCustom(int R, int G, int B, String Custom){
		try{
			Color CUSTOM = new Color(R, G, B);
			StyleConstants.setForeground(Colors, CUSTOM);
		}catch(Exception e){
			System.err.println("RBG colors must be in between 0 and 255");
		}
		try{
			Text.insertString(0, Custom + "\n", Colors);
		}catch(Exception e) { ConsoleError(); }
	}


	private static void ConsoleError(){
		if(Text == null){
			System.err.println("[Console API] No Name set for the JTextPane\n[Console API] Please do Console.setName(JTextPane);");
		}
	}
}