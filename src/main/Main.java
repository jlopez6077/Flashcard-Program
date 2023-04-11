package main;

import logic.Control;

public class Main {

	//Static fields
	public static String file = "Testing.txt"; 	// add the location of your txt file
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
