//Nur Aisya Fatihah
package Hotel;

import Hotel.Guest;
import Hotel.GuestManager;

import java.sql.*;
public class BookingManager{

	DatabaseConnection db = new DatabaseConnection();
	
	Guest guest = new Guest();
	GuestManager mgr = new GuestManager();
	
public int insertBooking(Booking booking){
	
			
			
			String query = "INSERT INTO booking (roomType, ArrivalDate, night, paymentOpt,TotalPrice,roomQty,GuestID)\n"
							+ "VALUES (?,?,?,?,?,?,?);";	
			String query2 = "UPDATE booking set TotalAfterServiceCharge = (TotalPrice*0.05) + `TotalPrice`"; 
			double price=0;
			int row=0;
			
			booking.setUsername(guest.getUsername());
			System.out.print(guest.getUsername());
			try {
				
				//System.out.println(booking.getGuestID());
				//booking.setGuestID(getUsername());

				Connection conn = db.getConnection();
	            
	            PreparedStatement ps = conn.prepareStatement(query);
	            ps.setString(1, booking.getRoomType());   
	            ps.setString(2, booking.getArrivalDate());
	            ps.setString(3, booking.getNight());
	            ps.setString(4, booking.getPaymentOpt());
	            ps.setString(6, booking.getRoomsQuantity());
	            ps.setString(7, booking.getUsername());
	            
	           // System.out.print(booking.getGuestID());
	            
	            if(booking.getRoomType()=="Single")
					price=150;
	            else if(booking.getRoomType()=="Queen")
					price=245;
	            else if(booking.getRoomType()=="Suite")
					price=400;
				booking.setSubtotal(price*(Integer.parseInt(booking.getNight())*(Integer.parseInt(booking.getRoomsQuantity()))));
				ps.setDouble(5, booking.getSubtotal());
	            
	            row = ps.executeUpdate();
	            
	            PreparedStatement ps2 = conn.prepareStatement(query2);
	            ps2.executeUpdate();
	            
		            ps2.close();
	            ps.close();
	            conn.close();
			}catch (Exception ex){
	            ex.printStackTrace();
	        }
	    
	        return row;
		
}


public 	String showBooking(String id) 
{
	String sql = "SELECT `bookingNum`,`roomType`,`ArrivalDate`,`roomQty`,`night`,`TotalPrice`,`TotalAfterServiceCharge` FROM `booking` where `GuestID`=?";
	
	//create object
			Booking book = new Booking();
			String s = "  Booking #\t  Arrival date\t     Nights\t Room Quantity\t Room type\t   Subtotal\t  Total Payment ";
            String ss = s + "\n";
     //     Booking #	  Arrival date	   Nights  Room Quantity   Room type   Subtotal  Total After Service Charge 

     //     56	        20201222	         2            	1	    Suite   	 RM 800.0	 RM 840.0
	        try {
	            // Establish connection
	            Connection conn = db.getConnection();
	            // Wrap SQL in object
	            PreparedStatement ps = conn.prepareStatement(sql);	
	            ps.setString(1,id);
	            
	           System.out.print(guest.getUsername());
	            
	            ResultSet rs = ps.executeQuery();	            
                
	            while (rs.next()) {
	                // Wrap a record into an object
	                book.setBookingNumber(rs.getInt(1));
	                book.setRoomType(rs.getString(2));
	                book.setArrivalDate(rs.getString(3));
	                book.setRoomsQuantity(rs.getString(4));
	                book.setNight(rs.getString(5));
	                //book.setPaymentOpt(rs.getString(4));
	                
	                book.setSubtotal(rs.getDouble(6));
	                book.setTotal(rs.getDouble(7));
	                
	                
	               
	                if(book.getUsername() != null) 
	                {
	                	
	                    s = "\n  " +book.getBookingNumber() +"\t  " + book.getArrivalDate()+"\t         "+book.getNight() +"            "+"\t" + book.getRoomsQuantity()+"\t    "+book.getRoomType() +"   "+"\t RM "+book.getSubtotal() +"\t RM "+book.getTotal();
	                    ss = ss+ s + "\n";
	                }
	               
	            }
	            // Close all database related object
	            rs.close();
	            ps.close();
	            conn.close();
	        } catch (Exception ex) {
	            // TODO Auto-generated catch block
	            ex.printStackTrace();
	        }
			
	        return ss;

	
	

}
}
















