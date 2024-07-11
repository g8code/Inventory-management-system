import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class InsertIntoDatabase {
    public static boolean validateUser(String username, String password) {
        try {
            DAO db = new DAO();
            Connection conn = db.getConnection();

            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

         
            if (resultSet.next()) {
                conn.close();
                return true;
            }

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

	public static void compdata(String comp, String model, String ram,
			String pro, String cust, String mobno, String email, String issue,
			String charges) {
		{	   	
			 try
			  {
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
			    String insertQuery = "insert into computer values(Default,?,?,?,?,?,?,?,?,?)";
			    PreparedStatement preparedStatement;
				
			    preparedStatement = conn.prepareStatement(insertQuery);
			  
			    preparedStatement.setString(1,comp);
			    preparedStatement.setString(2,model);
			    preparedStatement.setString(3,ram);
			    preparedStatement.setString(4,pro);
			    preparedStatement.setString(5,cust);
			    preparedStatement.setString(6,mobno);
			    preparedStatement.setString(7,email);
			    preparedStatement.setString(8,issue);
			    preparedStatement.setString(9,charges);
					
			    preparedStatement.executeUpdate();
			    System.out.println("Data  Successfully Inserted !!!");
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		  }
		
	}

	public static void laptopdata(String comp, String model, String ram,
			String pro, String cust, String mobno, String email, String issue,
			String charges) {
		{	   	
			 try
			  {
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
			    String insertQuery = "insert into laptop values(Default,?,?,?,?,?,?,?,?,?)";
			    PreparedStatement preparedStatement;
				
			    preparedStatement = conn.prepareStatement(insertQuery);
			  
			    preparedStatement.setString(1,comp);
			    preparedStatement.setString(2,model);
			    preparedStatement.setString(3,ram);
			    preparedStatement.setString(4,pro);
			    preparedStatement.setString(5,cust);
			    preparedStatement.setString(6,mobno);
			    preparedStatement.setString(7,email);
			    preparedStatement.setString(8,issue);
			    preparedStatement.setString(9,charges);
					
			    preparedStatement.executeUpdate();
			    System.out.println("Data  Successfully Inserted !!!");
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		
		
	}
 }
	
	public static void scannerdata(String comp, String model, String resolution,
			String type, String cust, String mobno, String email, String issue,
			String charges) {
		{	   	
			 try
			  {
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
			    String insertQuery = "insert into scanner values(Default,?,?,?,?,?,?,?,?,?)";
			    PreparedStatement preparedStatement;
				
			    preparedStatement = conn.prepareStatement(insertQuery);
			  
			    preparedStatement.setString(1,comp);
			    preparedStatement.setString(2,model);
			    preparedStatement.setString(3,resolution);
			    preparedStatement.setString(4,type);
			    preparedStatement.setString(5,cust);
			    preparedStatement.setString(6,mobno);
			    preparedStatement.setString(7,email);
			    preparedStatement.setString(8,issue);
			    preparedStatement.setString(9,charges);
					
			    preparedStatement.executeUpdate();
			    System.out.println("Data  Successfully Inserted !!!");
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		
		
	}
 }

	public static void printerdata(String comp, String model, String dpi,
			String colorop, String cust, String mobno, String email,
			String issue, String charges) {
		{	   	
			 try
			  {
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
			    String insertQuery = "insert into printer values(Default,?,?,?,?,?,?,?,?,?)";
			    PreparedStatement preparedStatement;
				
			    preparedStatement = conn.prepareStatement(insertQuery);
			  
			    preparedStatement.setString(1,comp);
			    preparedStatement.setString(2,model);
			    preparedStatement.setString(3,dpi);
			    preparedStatement.setString(4,colorop);
			    preparedStatement.setString(5,cust);
			    preparedStatement.setString(6,mobno);
			    preparedStatement.setString(7,email);
			    preparedStatement.setString(8,issue);
			    preparedStatement.setString(9,charges);
					
			    preparedStatement.executeUpdate();
			    System.out.println("Data  Successfully Inserted !!!");
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		
	}
	}
}
