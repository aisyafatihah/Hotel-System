//Nur Aisya Fatihah
package Hotel;


public class Booking {

	private static String roomType;
	private static String ArrivalDate;
	private static String night;
	private static String paymentOpt;
	private static String roomsQuantity;
	private static Double subtotal;
	private static Double total;
	private static int bookingNumber;
	private static String username;
	
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public String getNight() {
		return night;
	}
	public void setNight(String night) {
		this.night = night;
	}
	public String getPaymentOpt() {
		return paymentOpt;
	}
	public void setPaymentOpt(String paymentOpt) {
		this.paymentOpt = paymentOpt;
	}
	/**
	 * @return the roomsQuantity
	 */
	public String getRoomsQuantity() {
		return roomsQuantity;
	}
	/**
	 * @param roomsQuantity the roomsQuantity to set
	 */
	public void setRoomsQuantity(String roomsQuantity) {
		this.roomsQuantity = roomsQuantity;
	}
	/**
	 * @return the subtotal
	 */
	public Double getSubtotal() {
		return subtotal;
	}
	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	/**
	 * @return the bookingNumber
	 */
	public int getBookingNumber() {
		return bookingNumber;
	}
	/**
	 * @param bookingNumber the bookingNumber to set
	 */
	public void setBookingNumber(int bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


}
