package fr.Gouda.FTP;
import it.sauronsoftware.ftp4j.FTPClient;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch (Exception e){
			System.out.println("Unable to load Windows look and feel");
		}
		
		Frame GUI = new Frame();
			
		GUI.setSize(700, 500);
		GUI.setLocationRelativeTo(null);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setVisible(true);
		GUI.setResizable(false);
	}
	
	
	public static FTPClient connect(String "ftp.cuccfree.com", String "cucch_13675533", String "Halimi02");
	FTPClient client = new FTPClient();
    System.out.println("Connecting to " + ipAddress + " as " + userName + "/" + password);
    try
    {
            client.setType(FTPClient.TYPE_BINARY);
            client.connect("ftp.cuccfree.com");
            client.login("cucch_13675533", "Halimi02");
            return client;
    }
    catch (Exception e)
    {
            e.printStackTrace();
            return null;
    }
}

//}
