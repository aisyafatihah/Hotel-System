package Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RoomManager {
	private DatabaseConnection dbConn;
	
	public RoomManager() {
		dbConn = new DatabaseConnection();
	}
	
	public int addRoom(Room room) {
		String sql = "INSERT into room ( roomType, roomPrice, roomStatus)\n"
				+ "values ( ?, ?, ?)";
		
		int row = 0;
		
		try {
			
			Connection conn = dbConn.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,  room.getType());
			ps.setDouble(2,  room.getPrice());
			ps.setString(3,  "Available");
			
			row = ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return row;
	}
	
	public List<Room> selectRoom() {
		
		String sql = "SELECT p.roomNumber, p.roomType, p.roomPrice, p.roomStatus FROM Room p";
		
		List<Room> rooms = new ArrayList<Room>();
		
		try {
			
			Connection conn = dbConn.getConnection();
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery(sql);
			
			while (rs.next()) {
				
				Room room = new Room();
				room.setRoomNum(rs.getString(1));
				room.setType(rs.getString(2));
				room.setPrice(rs.getDouble(3));
				room.setStatus(rs.getString(4));
				
				rooms.add(room);
			}
			
			rs.close();
			stmnt.close();
			conn.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		return rooms;
	}
	
	public int UpdateRoomDetails (Room room) {
		
		String sql = "UPDATE Room set \n" +
				"roomPrice =? \n" +
				"WHERE roomNumber = ?";
		
		int row = 0;
		
		try {
			
			Connection conn = dbConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, room.getPrice());
			ps.setString(2,  room.getRoomNum());
			
			row = ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		return row;
	}
	
	public int deleteRoom (Room room) {
		
		String sql = "DELETE from Room \n" +
				"WHERE roomNumber = ?";
		
		int row = 0;
		
		try {
			
			Connection conn = dbConn.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,  room.getRoomNum());
			
			row = ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		return row;
	}
	
	//public void chooseRoomType{
		
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

