package c.spik3_ascii;

import java.util.Scanner;
import static java.lang.System.out;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		template(input);
	}
	
	public static void template(Scanner input) {
		out.println(" .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \r\n" + 
				"| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\r\n" + 
				"| |  _________   | || |    _______   | || |     ______   | || |      __      | || |   ______     | || |  _________   | || |              | |\r\n" + 
				"| | |_   ___  |  | || |   /  ___  |  | || |   .' ___  |  | || |     /  \\     | || |  |_   __ \\   | || | |_   ___  |  | || |      _       | |\r\n" + 
				"| |   | |_  \\_|  | || |  |  (__ \\_|  | || |  / .'   \\_|  | || |    / /\\ \\    | || |    | |__) |  | || |   | |_  \\_|  | || |     | |      | |\r\n" + 
				"| |   |  _|  _   | || |   '.___`-.   | || |  | |         | || |   / ____ \\   | || |    |  ___/   | || |   |  _|  _   | || |     | |      | |\r\n" + 
				"| |  _| |___/ |  | || |  |`\\____) |  | || |  \\ `.___.'\\  | || | _/ /    \\ \\_ | || |   _| |_      | || |  _| |___/ |  | || |     | |      | |\r\n" + 
				"| | |_________|  | || |  |_______.'  | || |   `._____.'  | || ||____|  |____|| || |  |_____|     | || | |_________|  | || |     |_|      | |\r\n" + 
				"| |              | || |              | || |              | || |              | || |              | || |              | || |     (_)      | |\r\n" + 
				"| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\r\n" + 
				" '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");
		out.println("\nYou wake up in a cold, damp room, your last memory was of going to sleep last night.");
		
		
		String take = get_input(">", "take", "pick up", "grab", "remove");
		
		
		
	}
	
	public static String get_input(String question, String a, String b, String c, String d) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		
		while (answer.equals("")) {
			out.println(question);
			answer = input.nextLine();
			if (answer.equals(a) || answer.equals(b) || answer.equals(c) || answer.equals(d)) {
				break;
			} else {
				out.println("I do not recognize '" + answer + "'.");
				answer = "";
			}
		}
		
		return answer;
	}
	
	public static void center(boolean lamp_broken) {
		out.println("ROOM CENTER");
		if (lamp_broken == false) {
			
		}
	}

}
