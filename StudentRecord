public class StudentRecord {
	
	/**** CONSTANSTANTS ****/
	public static final int FINAL_MAX = 100;
	public static final int MIDTERM_MAX = 100;
	public static final int QUIZ_MAX = 10;
	public static final double FINAL_WEIGHT = .40;
	public static final double MIDTERM_WEIGHT = .35;
	public static final double QUIZ_WEIGHT = .25;
	public static final int DEFAULT_QUIZ1 = 0;
	public static final int DEFAULT_QUIZ2 = 0;
	public static final int DEFAULT_QUIZ3 = 0;
	public static final int DEFAULT_MIDTERM = 0;
	public static final int DEFAULT_FINAL = 0;
	public static final String NAME = "Tyler Bobik";
	public static final String COURSE = "CS 111 Intro to CS I";
	public static final String SECTION = "MW 11:10am-1:10pm";
	
	/**** INITIALIZATION SECTION ****/
	char finalGrade;
	
	/**** INSTANCE VARIABLES ****/
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double midtermExam;
	private double finalExam;
	
	/**** METHODS ****/
	
	// DESCRIPTION:    prints header which includes name, course, 
	// section, homework and lastModified
	// PRECONDITIONS:  all instance variables have value
	// POSTCONDITIONS: header outputs to the console
	public static void printHeader(int homework, String lastModified) 
	{
		System.out.println("/********************************************");
		System.out.println("* AUTHOR:        " + NAME);
		System.out.println("* COURSE:        " + COURSE);
		System.out.println("* SECTION:       " + SECTION);
		System.out.println("* HOMEWORK #:    " + homework);
		System.out.println("* LAST MODIFIED: " + lastModified);
		System.out.println("********************************************/");
	}
	
	/**** CONSTRUCTORS ****/
	
	// DESCRIPTION:    initiates StudentRecord to its default values
	// PRECONDITIONS:  all constant variables have value
	// POSTCONDITIONS: initiates StudentRecord to default or outputs error messege and exits
	public StudentRecord()
	{
		boolean isValid;
		isValid =  setStudentRecord(DEFAULT_QUIZ1, DEFAULT_QUIZ2, DEFAULT_QUIZ3, DEFAULT_MIDTERM, DEFAULT_FINAL);
		
		if(!isValid)
		{
			System.out.println("ERROR: bad grade in default StudentRecord()");
			System.exit(0);
		}
	}
	
	// DESCRIPTION:    initiates StudentRecord to its parameter values
	// PRECONDITIONS:  all instant variables have value
	// POSTCONDITIONS: initiates StudentRecord to its parameter values or outputs error messege and exits
	public StudentRecord(double quiz1,double quiz2, double quiz3, double midtermExam, double finalExam)
	{
		boolean isValid;
		isValid = setStudentRecord(quiz1, quiz2, quiz3, midtermExam, finalExam);
		
		if(!isValid)
		{
			System.out.println("ERROR: bad grade in full StudentRecord()");
			System.exit(0);
		}
	}



	/**** SETTERS/ MUTATORS ****/
	
	// DESCRIPTION: 		sets all the StudentRecord scores
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		sets parameter value to instance variable
	public boolean setStudentRecord(double quiz1, double quiz2, double quiz3, double midtermExam, double finalExam)
	{
		boolean isValid;
		
		isValid = isValidQuiz1(quiz1) && isValidQuiz2(quiz2) && isValidQuiz3(quiz3) && isValidMidtermExam(midtermExam) && isValidFinalExam(finalExam);
		
		if(isValid)
		{
			setQuiz1(quiz1);
			setQuiz2(quiz2);
			setQuiz3(quiz3);
			setMidtermExam(midtermExam);
			setFinalExam(finalExam);
		}
		
			return isValid;
	}

	// DESCRIPTION: 		sets quiz1 scores
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		sets parameter value to instance variable
	public boolean setQuiz1(double quiz1)
	{
		boolean isValid;
		
		isValid = isValidQuiz1(quiz1);
		
		if(isValid)
		{
			this.quiz1 =  quiz1;
		}
		
		return isValid;
	}
	
	// DESCRIPTION: 		sets quiz2 scores
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		sets parameter value to instance variable
	public boolean setQuiz2(double quiz2)
	{
		boolean isValid;
		
		isValid = isValidQuiz2(quiz2);
		
		if(isValid)
		{
			this.quiz2 = quiz2;
		}
		
		return isValid;
	}
	
	// DESCRIPTION: 		sets quiz3 scores
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		sets parameter value to instance variable
	public boolean setQuiz3(double quiz3)
	{
		boolean isValid;
		
		isValid = isValidQuiz3(quiz3);
		
		if(isValid)
		{
			this.quiz3 = quiz3;
		}
		
		return isValid;
	}

	// DESCRIPTION: 		sets midtermExam scores
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		sets parameter value to instance variable
	public boolean setMidtermExam(double midtermExam)
	{
		boolean isValid;
		
		isValid = isValidMidtermExam(midtermExam);
		
		if(isValid)
		{
			this.midtermExam = midtermExam;
		}
		
			return isValid;
	}
	
	// DESCRIPTION: 		sets finalExam scores
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		sets parameter value to instance variable
	public boolean setFinalExam(double finalExam)
	{
		boolean isValid;
		
		isValid = isValidFinalExam(finalExam);
		
		if(isValid)
		{
			this.finalExam = finalExam;
		}
			
			return isValid;
	}
	
	
	/**** GETTERS/ACCESSORS ****/

	// DESCRIPTION: 		returns the score for quiz1
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		returns parameter value to instance variable
	public double getQuiz1()
	{
		return this.quiz1;
	}
	
	// DESCRIPTION: 		returns the score for quiz2
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		returns parameter value to instance variable
	public double getQuiz2()
	{
		return this.quiz2;
	}
	
	// DESCRIPTION: 		returns the score for quiz3
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		returns parameter value to instance variable
	public double getQuiz3()
	{
		return this.quiz3;
	}
	
	// DESCRIPTION: 		returns the score for midtermExam
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		returns parameter value to instance variable
	public double getMidtermExam()
	{
		return this.midtermExam;
	}
	
	// DESCRIPTION: 		returns the score for finalExam
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		returns parameter value to instance variable
	public double getFinalExam()
	{
		return this.finalExam;
	}
	
	// DESCRIPTION: 		returns the overall score for a students record
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		returns a double that represents the overall score 
	public double getOverallScore()
	{
		 return ((((((this.quiz1/QUIZ_MAX) + (this.quiz2/QUIZ_MAX) + (this.quiz3/QUIZ_MAX)) / 3) * QUIZ_WEIGHT)  + ((this.midtermExam / MIDTERM_MAX) * MIDTERM_WEIGHT) + ((this.finalExam / FINAL_MAX) * FINAL_WEIGHT)) * 100);
	} 
	
	// DESCRIPTION: 		returns the overall score for a students record
	// PRE-CONDITIONS:		all instance variables have value
	// POST-CONDITIONS:		returns a double that represents the overall score 
	public char getLetterGrade()
	{
		double grade;
		
		grade = ((((((this.quiz1/QUIZ_MAX) + (this.quiz2/QUIZ_MAX) + (this.quiz3/QUIZ_MAX)) / 3) * QUIZ_WEIGHT)  + ((this.midtermExam / MIDTERM_MAX) * MIDTERM_WEIGHT) + ((this.finalExam / FINAL_MAX) * FINAL_WEIGHT)) * 100);
		
		if (grade > 100 || grade < 0)
		{
			System.out.println("Not a valid grade");
		}
		else if (grade >= 90)
		{
			finalGrade = 'A';
		}
		else if (grade >= 80)
		{
			finalGrade = 'B';
		}
		else if (grade >= 70)
		{
			finalGrade = 'C';
		}
		else if (grade >= 60)
		{
			finalGrade = 'D';
		}
		else
		{
			finalGrade = 'F';
		}
		
		return finalGrade;
			
		}
	
	
	/**** OTHER REQUIRED METHODS ****/
	
	// DESCRIPTION: returns a String that contains the 
	// all the scores
	// PRE-CONDITIONS:	all instance variables have valid values
	// POST-CONDITIONS:	returns a String value that represents 
	// the data in the object
	public String toString()
	{
		
		return ("The grade for quiz 1 is: " + this.quiz1 + " the grade for quiz 2 is: "+ this.quiz2 + " the grade for quiz 3 is: " + this.quiz3 + " the grade for the midterm is: " + this.midtermExam + " the grade for the final is: " + this.finalExam);
	}
	
	// DESCRIPTION: 		compares two objects of the class to see 
	// if they are "equal"
	// PRE-CONDITIONS:		all instance variables have values
	// POST-CONDITIONS:		returns a true boolean value if both of
	// the calling objects all have the same instance variables, false if not
	public boolean equals(StudentRecord otherRecord)
	{
		return this.quiz1 == otherRecord.quiz1 && this.quiz2 == otherRecord.quiz2 && this.quiz3 == otherRecord.quiz3 && this.midtermExam == otherRecord.midtermExam && this.finalExam == otherRecord.finalExam;
	}
	
	
	
	/**** HELPER METHODS ****/
	
	// DESCRIPTION: outputs what is contained in the toString method
	// PRE-CONDITIONS:	all instance variables have valid values
	// POST-CONDITIONS:	outputs a String value that represents 
	// the data in the object
	public void writeOutput()
	{
		System.out.println(this.toString());
	}
	
	// DESCRIPTION: returns a boolean value after checking if
	// quiz1 instance variable is valid
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS:	returns a true boolean if instance variable
	// is valid
	private boolean isValidQuiz1(double quiz1)
	{
		return quiz1 >= 0 && quiz1 <= 10;
	}
	
	// DESCRIPTION: returns a boolean value after checking if
	// quiz2 instance variable is valid
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS:	returns a true boolean if instance variable
	// is valid
	private boolean isValidQuiz2(double quiz2)
	{
		return quiz2 >= 0 && quiz2 <= 10;
	}
	
	// DESCRIPTION: returns a boolean value after checking if
	// quiz3 instance variable is valid
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS:	returns a true boolean if instance variable
	// is valid
	private boolean isValidQuiz3(double quiz3)
	{
		return quiz3 >= 0 && quiz3 <= 10;
	}
	
	// DESCRIPTION: returns a boolean value after checking if
	// midtermExam instance variable is valid
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS:	returns a true boolean if instance variable
	// is valid
	private boolean isValidMidtermExam(double midtermExam)
	{
		return midtermExam >= 0 && midtermExam <= 100;
	}
	
	// DESCRIPTION: returns a boolean value after checking if
	// finalExam instance variable is valid
	// PRE-CONDITIONS: all instance variables have value
	// POST-CONDITIONS:	returns a true boolean if instance variable
	// is valid
	private boolean isValidFinalExam(double finalExam)
	{
		return finalExam >= 0 && finalExam <= 100;
	}
}
