package fr.Gouda.FTP;

public class FTPClient {
	FTPClient client = new FTPClient();
	client.connect("ftp.cuccfree.com");
	client.login("cucch_13675533","Halimi02");
	client.setPassive(true);
	//ftp4j api : sourceforge.net/projects/ftp4j/files/ftp4j/1.7.2/ftp4j-1.7.2.zip/download
	
}