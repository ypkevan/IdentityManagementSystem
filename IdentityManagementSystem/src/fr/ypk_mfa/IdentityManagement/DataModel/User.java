/**
 * 
 */
package fr.ypk_mfa.IdentityManagement.DataModel;

/**
 * @author keva
 *
 */
public class User extends Identity {
	private String password;

	public User(String name, String emailAddress, String uid) {
		super(name, emailAddress, uid);
		// TODO Auto-generated constructor stub
	}
	
	public boolean login(String uid , String Passwd){
		String UIDAmdin = "1";
		String passwodAdmin="alpha";
		if(){ // this method has not yet been defined
			return true;
		} else {
			System.out.println("invalid user ID or Password");
			return false;
		}
	}

}
