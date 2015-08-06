/********************************************
* AUTHOR:        Tyler Bobik
* COURSE:        CS 111 Intro to CS I
* SECTION:       Mondays and Wendnesdays 11:10 AM- 1:10 PM
* HOMEWORK #:    Homework #8, Project 2
* LAST MODIFIED: 03/31/2015
********************************************/
/*************************************************************
* TITLE
* Tester
/**************************************************************
* PROGRAM DESCRIPTION:
* A program that tests different temperatures for class Temperature
***************************************************************
* ALGORITHM:
* ASSIGN ROUNDS = 0
* INSTANTIATE keyboard = new Scanner(System.in)
* INSTANTIATE cpu = new HandGamePlayer()
* INSTANTIATE human = new HandGamePlayer()
* OUTPUT header	
* CALL human.setName("User")
* 
* FOR (int roundNumber = 0; roundNumber < ROUNDS; roundNumber++)
*   CALCULATE round++
*   OUTPUT "-------------------------------------------------------------"
*   OUTPUT "Round: " + HandGamePlayer.getRounds()
*   OUTPUT "-------------------------------------------------------------"
*   OUTPUT Choices: Rock (1), Paper (2), Scissors(3), Lizzard (4) or Spock (5)
*   READ userThrow = Cs111.readInt("Enter integer:", keyboard, 1 ,5)
*   CALL cpuThrow =  HandGamePlayer.getHandSign()
*   OUTPUT "The user chose:"
*       CALL HandGamePlayer.printHandSign(userThrow)
*   OUTPUT HandGamePlayer.printHandSign(cpuThrow)
*   IF HandGamePlayer.getRoundStatus(cpuThrow,userThrow) == 'W' THEN
*       OUTPUT "CPU WON!"
*       CALL cpu.incrementWins()
*   ELSE IF HandGamePlayer.getRoundStatus(cpuThrow,userThrow) == 'L' THEN
*       OUTPUT "USER WON!"
*       CALL human.incrementWins()
*   ELSE 
*	OUTPUT "TIE"
* 
* WHILE round < 3
* OUTPUT "-------------------------------------------------------------"
* OUTPUT "Overall Stats:"
* OUTPUT cpu
* OUTPUT human
* IF cpu.getWins() > human.getWins() THEN
* 	OUTPUT "CPU WINS!"
* ELSE IF cpu.getWins() < human.getWins() THEN
*	OUTPUT human.getName() + " Wins!"
* ELSE
* 	OUTPUT "CPU and" + human.getName() + " tie!"
* END IF
*************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner = To read in user input from keyboard
*************************************************************/
import java.util.Scanner;
public class Tester {
        
        //public static final int ROUNDS = 3;
	public static void main(String args[]){
		
		/**** DECLERATION SECTION ****/
		Scanner keyboard;
		HandGamePlayer cpu;
		HandGamePlayer human;
		int userThrow, cpuThrow;
		
		/**** INITIALIZATION SECTION ****/
		keyboard = new Scanner(System.in);	
		cpu = new HandGamePlayer();
		human = new HandGamePlayer();

		/**** INPUT SECTION ****/
		Cs111.printHeader(9,"4/4/2015");
		human.setName("User");
		 
		/**** PROCCESSING ****/
		for (int roundNumber = 0; roundNumber < 3; roundNumber++)
                {
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Round: " + HandGamePlayer.getRounds());
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Choices: Rock (1), Paper (2), Scissors(3), Lizzard (4) or Spock (5)");
                    userThrow = Cs111.readInt("Enter integer:", keyboard, 1 ,5);
                    cpuThrow =  HandGamePlayer.getHandSign();
			
                    System.out.println("The user chose:");
                    HandGamePlayer.printHandSign(userThrow);
                    System.out.println("The computer chose:");
                    HandGamePlayer.printHandSign(cpuThrow);
			
                    if(HandGamePlayer.getRoundStatus(cpuThrow,userThrow) == 'W')
                    {
			System.out.println("CPU WON!");
			cpu.incrementWins();
                    }
                    else if(HandGamePlayer.getRoundStatus(cpuThrow,userThrow) == 'L')
                    {
			System.out.println("USER WON!");
			human.incrementWins();
                    }
                    else
                    { 
			System.out.println("TIE");
                    }	
		} 
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Overall Stats:");
		System.out.println(cpu);
		System.out.println(human);
		
		if(cpu.getWins() > human.getWins())
			{
				System.out.println("CPU WINS!");
			}
		else if(cpu.getWins() < human.getWins())
			{
				System.out.println(human.getName() + " Wins!");
			}
		else
			{
				System.out.println("CPU and" + human.getName() + " tie!");
			}	
	}
}
