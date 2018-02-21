package binance;

import datahandlers.User;

/**
 * This method stores basic user information to make logging in to
 * binance a lot easier and by keeping it in the same package, it
 * should be more secure if i use package-private methods to log in
 *
 * @author rubenr
 */
public class BinanceUser extends User{

  /**
   * The default constructor fills the values with blanks and allows
   * into place later
   *
   */
  public BinanceUser() {

    super();

  }

  /**
   * This constuctor fills the values with whatever the user/program
   * specifies
   *
   * @param pub public API key for binance
   * @param priv private API key for binance
   * @param name nickname to make finding this user easier
   */
  public BinanceUser(String pub, String priv, String name) {

    super(pub,priv,name);

  }


}
