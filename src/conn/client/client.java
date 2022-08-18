package conn.client;

import java.util.Scanner;

import conn.ServiceObjectProvider.UserObjectProvider;
import conn.servicelayer.UserServ;


public class client {

	public static void main(String[] args) {
		UserServ u=UserObjectProvider .provideobject();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		System.out.println("Enter question");
		String question=sc.next();
		System.out.println("Enter answer");
		String answer=sc.next();
		u.signUp(username, password, question, answer);
		System.out.println("Plz enter following details for login");
		System.out.println("Enter username");
		String username1=sc.next();
		System.out.println("Enter password");
		String password1=sc.next();
		if(u.signIn(username1, password1))
			System.out.println("Sign in succesful");
		else
			System.out.println("Creditials not found");

		
		
		
		
	}

}
