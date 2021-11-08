package Hotel;

import java.sql.*;

public class StaffManager{
		private DatabaseConnection db;
	public StaffManager(){ 
		
		 db = new DatabaseConnection();
	}
	
	//this method updates a room status by room number 
	public int changeRoomStatus(int inputRoomNum,String setStatus) throws SQLException {
		
		String sql = "UPDATE room set " + "roomStatus = ? "+" WHERE roomNumber = ?";

		int row = 0;
		try {
			Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
						
            ps.setString(1, setStatus);   
            ps.setInt(2, inputRoomNum);   

			row = ps.executeUpdate();
			ps.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return row;
	}
	
	//this method is for staff login
	public boolean validateStaffLogin(String inputUsername,String inputPasswd) {
		
		boolean loginStatus = false;
		String sql = "SELECT Password from staff where "+"Username = ?";
		String correctPassword = "";


		try {
			Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, inputUsername);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next())
		      {
				 correctPassword = rs.getString(1);
				System.out.println(correctPassword+","+inputPasswd);

				if(correctPassword.equals(inputPasswd)) {
					loginStatus = true;	
					}
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
		System.out.println(correctPassword+","+inputPasswd);
		}
		return loginStatus;
	}
	
	//this method is to add a new user 
	public int addUser(Staff staff) {
		String sql = "Insert into staff(Name,Password)values(?,?)";
		String sql2 = "update staff set username = concat_ws(\"\",\"fdstaff\",`num`)\r\n"
				+ "";
		String sql3 = "Select Username from staff where Password = ?";
		
		int row=0;

		try {
			Connection conn = db.getConnection();
			
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, staff.getName());   
	            ps.setString(2, staff.getPassword());
	            row = ps.executeUpdate();
	            
	            PreparedStatement ps2 = conn.prepareStatement(sql2);
	            ps2.executeUpdate();
	            
	            PreparedStatement ps3 = conn.prepareStatement(sql3);
	            ps3.setString(1, staff.getPassword());
	            ResultSet rs = ps3.executeQuery();
	    		while (rs.next())
			      {
	            staff.setUsername(rs.getString(1));
	            System.out.print(staff.getUsername()+","+rs.getString(1));
			      }
	            rs.close();
	            ps3.close();
	            ps2.close();
	            ps.close();
	            conn.close();
	    
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return row;
	}


	



























}
