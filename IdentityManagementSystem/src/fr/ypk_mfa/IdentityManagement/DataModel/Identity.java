/**
 * 
 */
package fr.ypk_mfa.IdentityManagement.DataModel;

/**
 * @author keva
 *
 */
public class Identity {
private String name;
private String emailAddress;
private String uid;
/**
 * @param name The name of the identity
 * @param emailAddress  The email address of the identity
 * @param uid
 */
public Identity(String name, String emailAddress, String uid) {
	
	this.name = name;
	this.emailAddress = emailAddress;
	this.uid = uid;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Identity [name=" + name + ", emailAddress=" + emailAddress + ", uid=" + uid + "]";
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the emailAddress
 */
public String getEmailAddress() {
	return emailAddress;
}
/**
 * @param emailAddress the emailAddress to set
 */
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
/**
 * @return the uid
 */
public String getUid() {
	return uid;
}
/**
 * @param uid the uid to set
 */
public void setUid(String uid) {
	this.uid = uid;
}


}
