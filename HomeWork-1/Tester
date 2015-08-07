/********************************************
* AUTHOR:        Tyler Bobik
* COURSE:        CS 111 Intro to CS I
* SECTION:       Mondays and Wendnesdays 11:10 AM- 1:10 PM
* HOMEWORK #:    Homework #8, Project 1
* LAST MODIFIED: 03/31/2015
********************************************/
/*************************************************************
* TITLE
* Tester
/**************************************************************
* PROGRAM DESCRIPTION:
* A program that tests different scores for class StudentRecord
***************************************************************
* ALGORITHM:
* INSTANTIATE record1 = new StudentRecord(8,6,7,80,90);
* INSTANTIATE record2 = new StudentRecord(10,10,10,80,90);
* INSTANTIATE record3 = new StudentRecord();
* INSTANTIATE record4 = new StudentRecord(10,10,10,100,100);
* OUTPUT header	
* OUTPUT record1
* OUTPUT record2
* OUTPUT record2.getOverallScore()
* OUTPUT ()
* OUTPUT record2.getLetterGrade()
* IF record1.equals(record2) THEN
*	OUTPUT "record1 equals record2"
* ELSE
*	OUTPUT "record1 does not equal record2"
* OUTPUT record3
* CALL record3.setQuiz1(8)
* CALL record3.setQuiz2(6)
* CALL record3.setQuiz3(7)
* CALL record3.setMidtermExam(80)
* CALL record3.setFinalExam(90)
* OUTPUT record3
* OUTPUT record3.getOverallScore()
* OUTPUT ()
* OUTPUT record3.getLetterGrade()
* IF record3.equals(record1) THEN
*	OUTPUT "record3 equals record1"
* ELSE
*	OUTPUT "record3 does not equal record1"
*************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
*************************************************************/
public class Tester {
	
	public static void main(String args[])
	{
		/**** DECLERATION SECTION ****/
		
		StudentRecord record1, record2, record3, record4;
		
		/**** INITIALIZATION SECTION ****/
		
		record1 = new StudentRecord(8,6,7,80,90);
		record2 = new StudentRecord(10,10,10,30,90);
		record3 = new StudentRecord();
		record4 = new StudentRecord(10,10,10,100,100);
		
		/**** INPUT SECTION ****/
		
		StudentRecord.printHeader(8, "3/31/2105");
		
		System.out.println(record1);
		System.out.println(record2);
		System.out.printf("%3.2f",record2.getOverallScore());
		System.out.println();
		System.out.println(record2.getLetterGrade());
		
		if (record1.equals(record2))
		{	
			System.out.println("record1 equals record2");
		}
		else
		{
			System.out.println("record1 does not equal record2");
		}	
		
		System.out.println(record3);
		
		record3.setQuiz1(8);
		record3.setQuiz2(6);
		record3.setQuiz3(7);
		record3.setMidtermExam(80);
		record3.setFinalExam(90);
		System.out.println(record3);
		System.out.printf("%3.2f",record3.getOverallScore());
		System.out.println();
		System.out.println(record3.getLetterGrade());
		
		if (record3.equals(record1))
		{	
			System.out.println("record3 equals record1");
		}
		else
		{
			System.out.println("record3 does not equal record1");
		}	
		
		
	}
}
