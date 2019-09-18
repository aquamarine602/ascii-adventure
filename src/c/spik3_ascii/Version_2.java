package c.spik3_ascii;

//VERSION 2: trying to fix the issues

import java.util.Scanner;
import static java.lang.System.out;

public class Version_2 {
	
	// main menu
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String menu_choice = "";
		
		while (true) {
			out.println("Escape by Chloe Spilker\n"
					+ "-----------------------\n"
					+ "Enter 'P' to play the game.\n"
					+ "Enter 'X' to exit the game.\n\n");
			
			out.print(">");
			menu_choice = input.nextLine();
			out.println("\n\n");
			menu_choice = menu_choice.toLowerCase();
			
			while(true) {
				if (menu_choice.equals("p")) {
					game(input);
				} else if (menu_choice.equals("x")) {
					System.exit(0);
				}
			}
		}
	}
	
	// the game
	public static void game(Scanner input) {
		
		// player's initial inventory
		boolean box = false;
		boolean lamp = false;
		boolean bulb = false;
		boolean hammer = false;
		boolean stool = false;
		boolean paper = false;
		
		// if item is present to player
		boolean bulb_broken = false;
		boolean hammer_present = false;
		boolean stool_present = false;
		boolean paper_present = false;
		boolean paper_read = false;
		boolean up = false;
		boolean safe_open = false;
		
		// user's starting description
		out.println("\n\nYou wake up in a dark room.\n"
			+ "Your memory is foggy, but you know\n"
			+ "one thing: you need to escape.");
		
		// user's location -- starting location
		String location = room_center(lamp, box, bulb);
		
		// while game continues -- until system exit
		while (true) {
			
			// player's input and checking for noun validity
			boolean valid_noun = false;
			String verb = "";
			String noun = "";
			while (valid_noun == false) {
				// user's input
				out.print("\n\n>");		// input indicator
				String inpt = input.nextLine();
				inpt = inpt + " " + " ";	// for ease of splicing
					// extra space for possible missing noun
			
				// indexing spaces
				int space = inpt.indexOf(" ");
				int last_space = inpt.lastIndexOf(" ");
			
				// picks out user's verb and noun
				verb = inpt.substring(0, space);
				noun = inpt.substring(space + 1, last_space);
				verb.toLowerCase();		// sets words to lowercase
				noun.toLowerCase();
			
				if (noun.equals("")) {
					valid_noun = true;
				} else {
					valid_noun = noun_check(noun);
				}
			
			}
			
			// verbs -- player's action
			if (verb.equals("look")) {		// views location
				
			} else if (verb.equals("take")) {		// takes noun
				
			} else if (verb.equals("open")) {		// opens noun
				
			} else if (verb.equals("go")) {		// goes to location
				
			} else if (verb.equals("attack")) {		// attacks noun
				
			} else if (verb.equals("read")) {		// reads noun
				
			} else {		// if verb doesn't exist
				out.println("I don't know '" + verb + "'.");
			}
			
			
		}
		
	}
	
	// checks nouns
	public static boolean noun_check(String noun) {
		boolean valid = false;		// noun's validity
		
		// if given noun is part of accepted nouns
		if (noun.equals("box ") || noun.equals("lamp ") || noun.equals("bulb ") || noun.equals("stool ") || noun.equals("paper ") || noun.equals("hammer ")) {
			valid = true;
		} else {
			out.println("\nI don't know the noun '" + noun + "'.");
		}
		
		return valid;
	}
	
	// room center description
	public static String room_center(boolean lamp, boolean box, boolean bulb) {
		String words = "ROOM CENTER";		// room title
		
		// room description
		words = words + "\n\nYou are in the center of a cold\n"
				+ "and damp room. The shape of the room\n"
				+ "seems to be a perfect square,\n"
				+ "though the room itself isn't very\n"
				+ "large. There are no doors, there are\n"
				+ "no windows.\n\n";
		
		// lamp and bulb descriptions
		if (lamp == false) {		// if lamp isn't in player's inventory
			words = words +
				"There is a lamp dangling from the ceiling.\n"
				+ "The ceiling is crumbling around the hinges\n"
				+ "of the lamp.\n\n";
			
			if (bulb == false) {	// if bulb isn't in player's inventory
				words = words +
					"Inside the lamp, there is a bulb\n"
					+ "that is screwed in loosely.\n\n";
			} else if (bulb == true) {	// else if it is
				words = words +
					"There is an empty socket where\n"
					+ "the bulb once sat.\n\n";
			}
		}
		
		// box description
		if (box == false) {		// if box isn't in player's inventory
			words = words +
				"There is a small box sitting in the\n"
				+ "center of the room.\n\n";
		}
		
		// notes the only other place of interest
		words = words +
			"To the south is one wall of the room.\n"
			+ "There is a safe connected to that wall.";
		
		return words;
	}
	
	// south wall description
	public static String south_wall(boolean safe_open) {
		String words = "SOUTH WALL";
		
		if (safe_open == false) {
			words = words + "\n\nA safe is nestled into the\n" +
				"colorless, tiled wall.\n\n"
				+ "It is sealed shut.";
		} else {
			words = words + "\n\nAn open safe is nestled into the\n" +
					"colorless, tiled wall.";
		}
		
		return words;
	}
	
	
	
}









