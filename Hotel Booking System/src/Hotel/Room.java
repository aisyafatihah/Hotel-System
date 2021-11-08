package Hotel;

	public class Room {
		private String roomNum;
		private String type;
		private double price;
		private String status;
		
		public Room() {}
		
		public void chooseRoom (String type) {}
		
		public void roomStatus (String status) {}
		
		public void displayAllRoomAvailable () {}
		
		public void setRoomNum (String roomNum) {
			this.roomNum = roomNum;
		}
		
		public String getRoomNum () {
			return roomNum;
		}
		
		public void setType (String type) {
			this.type = type;
		}
		
		public String getType () {
			return type;
		}
		
		public void setPrice (double price) {
			this.price = price;
		}
		
		public double getPrice () {
			return price;
		}
		
		public void setStatus (String status) {
			this.status = status;
		}
		
		public String getStatus () {
			return status;
		}
		
		public void displayRoomDetails () {}
		
	}


