/**
 * 
 */
package fr.tbr.iamcore.tests.services.dao;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.tbr.iamcore.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public class IdentityFileDAO {
	
	//TODO change this path, make it configurable
	private final static String filePath = "/tests/iam/identities.txt"; 
	
	//Writer to insert identities into the file
	private PrintWriter writer;
	
	//Used to get the data from the file
	private Scanner scanner;
	
	
	
	public IdentityFileDAO() throws IOException {
		
		File file = ensureFileExists(filePath);
		this.writer = new PrintWriter(file);
		this.scanner = new Scanner(file);
		
	}
	
	
	public void create(Identity identity){
		writer.println("--- identity:begin ---");
		writer.println(identity.getDisplayName());
		writer.println(identity.getEmailAddress());
		writer.println(identity.getUid());
		writer.println("--- identity:end ---");
		writer.flush();
	}
	
	
	public List<Identity> search(Identity criteria){
		
		
		return new ArrayList<Identity>();
	}
	
	
	public List<Identity> readAll(){
		
		return new ArrayList<Identity>();
	}
	
	public void update(Identity identity){
		
	}
	
	public void delete(Identity identity){
		
	}
	
	
	/**
	 * This method will check that the file exists or create it if it doesn't
	 * @param pathname
	 * @throws IOException
	 */
	public static File ensureFileExists(String pathname) throws IOException {
		File file = new File(pathname);
		if (!file.exists()){
			//creation code after
			System.out.println("the file does not exists");
			File parent = file.getParentFile();
			if (!parent.exists()){
				parent.mkdirs();
			}
			file.createNewFile();
			System.out.println("file was successfully created");
		}else{
			System.out.println("the file already exists");
		}
		return file;
	}

}
