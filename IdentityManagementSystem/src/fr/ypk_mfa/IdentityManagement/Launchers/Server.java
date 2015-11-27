package fr.ypk_mfa.IdentityManagement.Launchers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import fr.ypk_mfa.IdentityManagement.DAO.DataAccessObject;

public class Server{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String clientSentence; 
		String capitalizedSentence; 
		ServerSocket welcomeSocket = new ServerSocket(6777); 
		while(true) { 
		Socket connectionSocket = welcomeSocket.accept(); 
		BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); 
		DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream());
		clientSentence = inFromClient.readLine(); 
		capitalizedSentence = clientSentence.toUpperCase() + '\n'; 
		outToClient.writeBytes(capitalizedSentence); 
		}
	}

}
