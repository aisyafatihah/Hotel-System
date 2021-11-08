package Hotel;

import java.sql.*;



public class GuestManager{

	DatabaseConnection db = new DatabaseConnection();
	
public int insertGuest(Guest guest){
	
			String query = "INSERT INTO guest (Name, IC, telephoneNumber, Address, email,guestID)\n"
							+ "VALUES (?,?,?,?,?,?);";	
			
			int row=0;
			
			try {
				Connection conn = db.getConnection();
	            
	            PreparedStatement ps = conn.prepareStatement(query);
	            
	            ps.setString(6, guest.getUsername());   
	            ps.setString(1, guest.getName());   
	            ps.setString(2, guest.getIC());
	            ps.setString(3, guest.getTelephoneNumber());
	            ps.setString(4, guest.getAddress());
	            ps.setString(5, guest.getEmail()); 
	            
	            row = ps.executeUpdate();
	            ps.close();
	            conn.close();
			}catch (Exception ex){
	            ex.printStackTrace();
	        }
	    
	        return row;
		
}
}












