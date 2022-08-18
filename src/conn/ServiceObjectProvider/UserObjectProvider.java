package conn.ServiceObjectProvider;


import java.io.FileInputStream;
import java.util.Properties;

import conn.servicelayer.UserServ;

public class UserObjectProvider 
{
	public static UserServ provideobject()
	{
		UserServ obj=null;
		FileInputStream fis=null;
		try 
		{
			fis=new FileInputStream(".//Resouces//info.properties"
					+ "");
			Properties p=new Properties();
			p.load(fis);
			String className=p.getProperty("businessClass");
			obj=(UserServ)Class.forName(className).newInstance();
			
			
			
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return obj;
				
	}

}
