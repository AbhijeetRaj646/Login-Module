package DaoImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.dao.DaoInterface;

import conn.Bean.User;
import conn.ServiceObjectProvider.DatabaseConnectionProvider;

public class DaoImpl implements DaoInterface{
	Connection con=DatabaseConnectionProvider.getDBConnection();

	@Override
	public void insertData(User acc) {
		
		try {
			
			PreparedStatement pst=con.prepareStatement("Insert into login values(?,?,?,?)");
			pst.setString(1,acc.getUsername());
			pst.setString(2,acc.getPassword());
			pst.setString(3,acc.getQuestion());
			pst.setString(4,acc.getAnswer());
			System.out.println("Data Inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
