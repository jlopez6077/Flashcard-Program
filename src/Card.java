package data;

public class Card {
		//class constants
		
		//class variables
		private static boolean flip = false;
		//instance variables
		private String front;
		private String back;
		
		//constructors
		public Card(String front, String back) {
			this.front = front;
			this.back = back;
		}
		
		//setter methods
		public void setFront(String newFront) {
			this.front = newFront;
		}
		public void setBack(String newBack) {
			this.back = newBack;
		}
		public static void setFlip(boolean b) {
			flip = b;
		}
		//getter method
		public String getFront() {
			if(flip)
				return back;
			else
				return front;
		}
		public String getBack() {
			if(flip)
				return front;
			else
				return back;
		}
		//behavior methods
		
		//toString
		public String toString() {
			String s = front+" "+back;
		      int length = s.length();
		      s = s + "\n";
		      for(int i = 0; i < length+3;i++)
		      {
		         s = s + "-";
		      }
		      s = s + "\n";
		      return s;
		}

}
