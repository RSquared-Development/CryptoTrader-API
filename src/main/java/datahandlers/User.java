package datahandlers;

/**
 * This method stores basic user information to make logging in
 * a lot easier and by keeping it in the same package. This should
 * be used as a generic to make spinning up new exchanges easier
 *
 * @author rubenr
 */
public abstract class User {

  private String publicKey, privateKey, nickName;
  private int userID;

  /**
   * The default constructor fills the values with blanks and allows
   * into place later
   *
   */
  public User() {

    publicKey  = "";
    privateKey = "";
    nickName   = "";
    userID     = (int)Math.random()*10000;

  }

  /**
   * This constuctor fills the values with whatever the user/program
   * specifies
   *
   * @param pub public API key
   * @param priv private API key
   * @param name a nickname for this user
   */
  public User(String pub, String priv, String name) {

    publicKey  = pub;
    privateKey = priv;
    nickName   = name;
    userID     = (int)Math.random()*10000;

  }

  /**
   *
   * @param privateKey this is the key that you want to change your private API key to
   */
  public void setPrivateKey(String privateKey) {

    this.privateKey = privateKey;

  }

  public void setPublicKey(String publicKey) {

    this.publicKey = publicKey;

  }

  public void setKeys(String privateKey, String publicKey) {

    this.privateKey = privateKey;
    this.publicKey  = publicKey;

  }

}
