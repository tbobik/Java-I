public class HandGamePlayer 
{
	/**** CONSTANSTANTS ****/
	
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSOR = 3;
	public static final int LIZARD = 4;
	public static final int SPOCK = 5;
	public static final String DEFAULT_NAME = "CPU";
	public static final int DEFAULT_WINS = 0;
	
	/**** INSTANCE VARIABLES ****/
	
	private static int rounds;
	private String name;
	private int wins;
	
	/**** CONSTRUCTORS ****/
	
	// DESCRIPTION:    initiates HandGamePlayer to its default value
	// PRECONDITIONS:  all constant variables have value
	// POSTCONDITIONS: initiates HandGamePlayer to default value 
	public HandGamePlayer()
	{
		name = DEFAULT_NAME;
		wins = 0;
	}
	
	// DESCRIPTION:    initiates THandGamePlayer to its parameter value
	// PRECONDITIONS:  all instant variables have value
	// POSTCONDITIONS: initiates HandGamePlayer to its parameter value
	public HandGamePlayer(String name)
	{
		setName(name);
		wins = 0;
	}
	
	/**** ACCSESSORS ****/
	
	
	// DESCRIPTION: returns the name
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS: returns parameter value 
	public String getName()
	{
		return name;
	}
	
	// DESCRIPTION: returns the number of wins
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS: returns parameter value 	
	public int getWins()
	{
		return wins;
	}
	
	// DESCRIPTION: returns the W, L or T depending on if 
	// the statment is true 
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS: returns W, L or T 
	public static char getRoundStatus(int sign1, int sign2)
	{
		rounds++;
		
		if (sign1 > sign2)
		{
                    return 'L';           
		}
		else if (sign1 < sign2)
		{
                    return 'W';
		}
		else
		{
                    return 'T';
		}
	}
	
	// DESCRIPTION: returns the number of rounds in integer form 
	// and adds one integer to rounds
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS: returns rounds value and adds one integer to 
	// rounds
	public static int getRounds()
	{
		return rounds;
	}
	
	// DESCRIPTION: returns a random number from 1 to 5
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS: returns a random number from 1 to 5
	public static int getHandSign()
	{
		return (int) (Math.random() * 5) + 1;
	}
	
	/**** MUTATORS *****/
	
	// DESCRIPTION: sets the name 
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS: sets parameter value to instance variable
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**** COMPARISON METHODS ****/
	
	// DESCRIPTION: 		compares two objects of the class to see 
	// if they are "equal"
	// PRE-CONDITIONS:		all instance variables have values
	// POST-CONDITIONS:		returns a true boolean value if both of
	// the calling objects all have the same instance variables, false if not
	public boolean equals(HandGamePlayer otherPlayer)
	{
		return (this.name == otherPlayer.name) && (this.wins == otherPlayer.wins);
	}
	
	// DESCRIPTION: increments wins variable
	// PRE-CONDITIONS:	all instance variables have valid values
	// POST-CONDITIONS:	increments wins variable
	public void incrementWins()
	{
		wins++;
	}
	

	// DESCRIPTION: returns a String that contains the 
	// the name and wins
	// PRE-CONDITIONS:	all instance variables have valid values
	// POST-CONDITIONS:	returns a String value that represents 
	// the data in the object
	public String toString()
	{
		return "The " + name + " has " + wins + " wins";
	}
	
	// DESCRIPTION: prints what is contained in the case if it is called
	// PRE-CONDITIONS:	all instance variables have valid values
	// POST-CONDITIONS:	prints a image that represents 
	// the sign that is called
	public static void printHandSign(int sign)
	{
            switch(sign)
            {
                case 1:
		{
                System.out.print("Rock");
		System.out.println("(    _______)");
      		System.out.println("(---'  ____)");
                System.out.println("      (_____)");
                System.out.println("      (_____)");
                System.out.println("      (____)");
      		System.out.println("---.__(___)");
                break;
		}
                case 2:
		{
                System.out.print("Paper");
		System.out.println("    _______");
		System.out.println("---'   ____)____");
                System.out.println("          ______)");
                System.out.println("         _______)");
                System.out.println("        _______)");
      		System.out.println("---.__________)");
                break;
		}
                case 3:
		{
                System.out.print("Scissor");
		System.out.println("    _______");
		System.out.println("---'   ____)____");
		System.out.println("          ______)");
		System.out.println("      __________)");
		System.out.println("      (____)");
		System.out.println("---.__(___)");
                break;
		}
                case 4:
		{
                System.out.print("Lizard");
                System.out.println("               ____...---...___");
                System.out.println(" ___.....---        .       --..____");               
                System.out.println("              _.--._       /|");
                System.out.println("       .    .'()..()`.    / /");
                System.out.println("           ( `-.__.-' )  ( (");    
                System.out.println(".           \\        /    \\ \\");
                System.out.println(".            \\      /      ) )");        
                System.out.println("           .' -.__.- `.-.-'_.'");
                System.out.println(".        .'  /-____-\\  `.-'");       
                System.out.println("         \\  /-.____.-\\  /-.");
                System.out.println("          \\ \\`-.__.-'/ /\\|\\|");           
                System.out.println("         .'  `.    .'  `.");
                System.out.println("         |/\\/\\|    |/\\/\\|");
                break;
		}
                case 5:
		{
                System.out.print("Spock");
		System.out.println(" (>\\       _ ");
		System.out.println("(>\\ \\     /<)");
		System.out.println(" \\ \\ \\   / / ");
		System.out.println("  \\ \\ \\ / /<)");
		System.out.println("   \\_\\_V_/ /");
		System.out.println("  \\/ )    `-|");
		System.out.println("  | | `--   |"); 
		System.out.println("  |     ||  |");
		System.out.println("  \\     '   /"); 
		System.out.println("   |       |"); 
		System.out.println("   |       |");
                break;
		}
            }
        }
}