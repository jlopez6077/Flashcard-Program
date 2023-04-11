# FlashCardProgram
 A Java Project that reads from a txt file to create flashcards

# how it works
*create a txt file 
 First line is the front of the card
 Second line is the back
 Follow that up with an enter and start your second flashcard
 
*Change the file location in the Main.java 
 Flashcard-Program/src/main/Main.java
 ```c
 //Static fields
	public static String file = "Testing.txt"; 	// add the location of your txt file
	//Static fields end
 ```
*Lastly, compile and run the code
 
 
 Additionally you can change the class Control.java located here: Flashcard-Program/src/logic/Control.java 
 Here you can change the boolean values of cardsFlipped and random. if set to true, the cards will show its
 back side first and they'll be shown in a random order.
 ```java
 //class variables
	private static boolean cardsFlipped = false;
	private static boolean random = false;
 ```
