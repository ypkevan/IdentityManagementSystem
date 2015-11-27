/**
 * 
 */
package fr.ypk_mfa.IdentityManagement.Launchers;

/**
 * @author keva
 *
 */
public class Authentication {
	private String userID;
	private String Password;
	
	public Authentication(String userID, String password) {
		this.userID = userID;
		Password = password;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	
}
