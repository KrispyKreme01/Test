import java.util.Random;
import java.util.Scanner;
public class QuizGame {
  
  public static String[] questions = {"What is the Capital of Nunavut?", "What is the capital of Ontario?", "What is the capital of the Yukon?", 
                                                "In what province is Polar Bear Provincial Park?", "Baffin Island is part of what Territory?", 
                                                "In what province is Banff?", "Moncton is a city in what Province?", "The capital of New Brunswick is what city?", 
                                                "The capital of Quebec is what city?", "Charlottetown is a city in what Province?", 
                                                "What is the nearest provincial capital to Toronto?", "The largest city on Vancouver Island is what?", 
                                                "Calgary and Edmonton are in what Province?", "The capital of Saskatchewan is what city?", 
                                                "Yellowknife is in what territory?", "The capital of Canada is in what Province?", "The capital of Canada is what city?", 
                                                "Washington State borders on what Canadian Province?", "The capital of Manitoba is what city?", 
                                                "Grand Rapids lies in what Province?", "Little Saskatchewan is in what Province?", "Moose Jaw is a city in what Province?",
                                                "St. John's is a city on what island?", "Greenland is closest to what Province/Territory?", 
                                                "The most westward prairie province is what?", "The most eastward prairie province is what?", "Which is the largest province?",
                                                "Which is the smallest territory?", "Which is the smallest province?","The Yukon Territory borders on what province?"};
  
 public static String[] answers = {"Iqaluit", "Toronto", "Whitehorse", "Ontario", "Nunavut", "Alberta", "New Brunswick", "Fredericton", "Quebec City", 
                                             "Prince Edward Island", "Quebec City", "Victoria", "Alberta", "Regina", "Northwest Territories", "Ontario", "Ottawa", 
                                             "British Columbia", "Winnipeg", "Manitoba", "Manitoba", "Saskatchewan", "Newfoundland", "Nunavut", "Alberta", "Manitoba",
                                             "Quebec", "Yukon", "Prince Edward Island", "British Columbia"};
 public static boolean[] checkQ = new boolean [30];
 public static int points = 0;
 public static Random rand = new Random();
 public static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  boolean playLoop = true;
  boolean checkIn = false;
  printRules();
  //loops the game
  while(playLoop) {
   play();
   //checks to see if user ants to play again
    while(!checkIn) {
     System.out.println("would you like to play again?");
     String playAgain = sc.nextLine();
     if (playAgain.charAt(0) == 'y') {
      playLoop = true;
      checkIn = true;
      System.out.println("you have selected yes, playing again");
     }
     else if (playAgain.charAt(0) == 'n') {
      playLoop = false;
      checkIn = true;
      System.out.println("you have selected no, exitting game");
      System.exit(1);
     }
     else {
      System.out.println("invalid input, try again");
      checkIn = false;
     }
       }
  }
 }
 public static void play () {
  boolean flag = false;
  int random;
  for (int i = 0; i < 11; i++) {
   int cell = 0;
   //loops until a cell that hasnt been chosen has been found
   System.out.println("q " + i);
   while(!flag) { 
     random = rand.nextInt(30);
  //checks to see if this cell has already been chosen
    if (!checkQ[random]) {
     flag = true;
     checkQ[random] = true; 
     cell = random;
    }
    else {
     flag = false;
    }
   }
   //ask for input
   System.out.println(questions[cell] + "\nPlease input your answer");
   String input = sc.nextLine();
   //checks for right answer
   if (input.contains(answers[cell])) {
    System.out.println("correct");
    points++;
   }
   else {
    System.out.println("incorrect");
   }
  }
 }
 public static void printRules () {
  //this is where i am going to put a print statement 
  //describing the rules of the game
 }

}
/*
import java.util.Random;
import java.util.Scanner;
public class QuizGame {
	public static String[] questions = new String[30];
	public static String[] answers = new String[30];
	public static boolean[] checkQ = new boolean [10];
	public static int points = 0;
	public static Random rand = new Random();
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean playLoop = true;
		boolean checkIn = false;
		printRules();
		//loops the game
		while(playLoop) {
			play();
			//checks to see if user ants to play again
				while(!checkIn) {
					System.out.println("would you like to play again?");
					String playAgain = sc.nextLine();
					if (playAgain.charAt(0) == 'y') {
						playLoop = true;
						checkIn = true;
						System.out.println("you have selected yes, playing again");
					}
					else if (playAgain.charAt(0) == 'n') {
						playLoop = false;
						checkIn = true;
						System.out.println("you have selected no, exitting game");
						System.exit(1);
					}
					else {
						System.out.println("invalid input, try again");
						checkIn = false;
					}
			    }
		}
	}
	public static void play () {
		boolean flag = false;
		for (int i = 0; i < 11; i++) {
			int cell = 0;
			//loops until a cell that hasnt been chosen has been found
			while(!flag) {	
				int random = rand.nextInt(30);
				if (!checkQ[random]) {
					flag = true;
					checkQ[random] = true; //checks to see if this cell has already been chosen
					cell = random;
				}
				else {
					flag = false;
				}
			}
			//ask for input
			System.out.println(questions[cell] + "\nPlease input your answer");
			String input = sc.nextLine();
			//checks for right answer
			if (input.contains(questions[cell])) {
				System.out.println("correct");
				points++;
			}
			else {
				System.out.println("incorrect");
			}
		}
	}
	public static void printRules () {
		//this is where i am going to put a print statement 
		//describing the rules of the game
	}

}
*/

