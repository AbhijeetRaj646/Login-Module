
package conn.serviceprovider;

import DaoImplementation.DaoImpl;
import conn.Bean.User;

import conn.servicelayer.UserServ;

public class UserServices implements UserServ {
	private	User acc;
	DaoImpl dao=new DaoImpl();

	@Override
	public void signUp(String username, String password, String question, String answer) {
		acc=new User(username,password,question,answer);
		System.out.println("Account created");
		dao.insertData(acc);
		
	}

	@Override
	public boolean signIn(String username, String password)
	{
		if(acc.getUsername().equals(username) && acc.getPassword().equals(password))
		return true;
		else 
		return false;
		
		
	}

	@Override
	public String forgetPass(String username, String question, String answer)
	{
		if(acc.getUsername().equals(username)&&acc.getQuestion().equals(question)&&acc.getAnswer().equals(answer))
		return acc.getPassword();
		else
		return"Incorrect creditals";
	}

	@Override
	public String updatePass(String username, String password, String newPass) {
		if(acc.getUsername().equals(username)&&acc.getPassword().equals(password))
          {
			acc.setPassword(newPass);
			return "Password updated";
          }
		else 
		return "Invalid creditals";
	}

}
