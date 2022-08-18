package conn.servicelayer;


public interface UserServ {
	public void signUp(String username,String password,String question,String answer );
	public boolean signIn(String username,String password );
public String forgetPass(String username,String question,String answer );
public String updatePass(String username,String password,String newPass );

}
