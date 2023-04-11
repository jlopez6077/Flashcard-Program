package main;

import logic.Control;

public class Main {

	//Static fields
	public static String file = "C:\\Users\\oneju\\eclipse-workspace\\FlashCard Project\\src\\Testing.txt";
	//Static fields end
	
	public static void main(String[] args)  {
		Control ctrl = new Control(file);
		settings();
		ctrl.loop();
	}
	public static void settings() {
		Control.setCardsFlipped(true);
		Control.setRandom(true);
	}
}
