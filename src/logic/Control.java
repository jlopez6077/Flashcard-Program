package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

import data.Card;

public class Control {
	//class constants
	
	//class variables
	private static boolean cardsFlipped = false;
	private static boolean random = false;
	private static Scanner kb = new Scanner(System.in);
	private static Random rand = new Random();
	
	//instance variables
	private String file ="Testing.txt";
	private ArrayList<Card> list = new ArrayList<Card>();
	private Queue<Card> set = new LinkedList<>();
	
	//constructors
	public Control(String file) {
		this.file = file;
		createList();
		
	}
	//setter methods
	public static void setCardsFlipped(boolean b) {
		cardsFlipped = b;
	}
	public static void setRandom(boolean b) {
		random = b;
	}
	//getter methods
	
	//behavior methods
	public void loop()  {
		createSet();
		System.out.println(toString()+"\nPress enter if you are ready");
		String response = kb.nextLine();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		while(!set.isEmpty()) {
			Card temp = set.remove();
			System.out.print("\n"+temp.getFront());
			response = kb.nextLine();
			System.out.print(temp.getBack()+"\nEnter c if correct: ");
			response = kb.nextLine();
			if(response.compareToIgnoreCase("c") != 0)
				set.add(temp);
		}
		System.out.println("\n\nGood Luck");
	}
	private void createList()  {
		
		File f = new File(file);
		Scanner input;
		try {
			input = new Scanner(f);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				while(line.equals(""))
					line = input.nextLine();
				list.add(new Card(line, input.nextLine()));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void createSet() {
		Card.setFlip(cardsFlipped);
		int[] a = makeOrder();
		for(int i = 0; i < list.size(); i++) {
			set.add(list.get(a[i]));
		}
	}
	private int[] makeOrder() {
		int n = list.size();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = i;
		}
		if(random) {
			for(int j = 0; j < n; j++) {
				int element = rand.nextInt(n);
				int temp = a[j];
				a[j] = a[element];
				a[element] = temp;
			}
		}
		return a;
	}
	//toString
	public String toString() {
		String s = file+"\n";
		for(int i = 0; i < list.size(); i++) {
			s += "\n"+list.get(i).getFront();
			s += "\n"+list.get(i).getBack()+"\n";
		}
		return s+"------------------------";
	}
}
