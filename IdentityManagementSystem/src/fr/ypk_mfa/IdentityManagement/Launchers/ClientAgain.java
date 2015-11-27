/**
 * 
 */
package fr.ypk_mfa.IdentityManagement.Launchers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;


/**
 * @author Kevan and Marcelo
 *
 */
public class Client {
	

	public static void main(String[] args) throws Exception{
		String userID;
		String password;
		Scanner scanner= new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("Enter your userID:");
		userID = scanner.nextLine();
		System.out.println("Enter the password:");
		password = scanner.nextLine();
		System.out.println("**************************");
		Authentication auth = new Authentication(userID,password);
		
		//TODO things to do
		
		//FIXME things to fix
		
		// Creating the socket for link to the server
		
		// The password needs to hashed before they are send in the network!!!
		
		Socket clientSocket = new Socket("127.0.0.1", 6777); 
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  
		outToServer.writeBytes(auth.getPassword() +"\n"+ auth.getUserID() +"\n"); 
		String modifiedSentence = inFromServer.readLine(); 
		System.out.println("FROM SERVER: " + modifiedSentence); 
		clientSocket.close();  //Closing the connection to the server.
		
		System.out.println("**************************");
		System.out.println("**************************");
	}
}
