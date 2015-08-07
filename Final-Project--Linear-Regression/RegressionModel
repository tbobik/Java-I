import java.util.Arrays;
import java.text.DecimalFormat;
public class RegressionModel {
    
     /*** CONSTANTS ***/
    public static final double[] DEFAULT_X = new double[0];
    public static final double[] DEFAULT_Y = new double[0];
    
     /*** INSTANCE VARIABLES ***/
    private double [] xValues;
    private double [] yValues;
   
    /*** CONSTRUCTORS ***/
    //DESCRIPTION: initiates RegressionModel to its default values
    //PRECONDITIONS: all constant variables have values
    //POSTCONDITIONS: initiates Payment to default values
    public RegressionModel()
   {
       this(DEFAULT_X, DEFAULT_Y);
   }
    
    //DESCRIPTION: initiates RegressionModel to its parameter values
    //PRECONDITIONS: all constant variables have valid value
    //POSTCONDITIONS: initiates RegressionModel to parameter value
   public RegressionModel(double[] xValues, double[] yValues)
   {
       if(xValues == null || yValues == null)
       {
           System.out.println("Fatal Error creating regression model.");
           System.exit(0);
       }
       else if(xValues.length == 0 || yValues.length == 0)
       {
           System.out.println("Fatal Error one or more zero arrays have zero lengths.");
           System.exit(0);
       }
       else if(xValues.length != yValues.length)
       {
           System.out.println("Fatal Error array lengths are not equal.");
           System.exit(0);
       }       
       else
       {
           this.xValues = CopyArray.copyDoubleArray(xValues, xValues.length);
           this.yValues = CopyArray.copyDoubleArray(yValues, yValues.length);
       }
    }
   
    //DESCRIPTION: creates a copy that is an exact copy of its parameter
    //PRECONDITIONS: has one parameter of the same type as the class
    //POSTCONDTIONS: creates a completely independent copy of its parameter
   public RegressionModel(RegressionModel originalObject)
   {
       if(originalObject == null)
       {
           System.out.println("Fatal Error: aborting program.");
           System.exit(0);
       }
       else
       {
           xValues = originalObject.xValues;
           yValues = originalObject.yValues;
       }
   }
   
   /*** MUTATOR METHODS ***/
    
    //DESCRIPTION: sets the xValues
    //PRECONDITIONS: parameter variable must have a value that is valid
    //POSTCONDITIONS: sets instance value to parameter value
   public void setXvalues(double[] newXValues)
   {
       if (newXValues == null)
       {
           System.out.println("Fatal Error setting xValues.");
           System.exit(0);
       }
       else if(newXValues.length == 0)
       {
           System.out.println("Fatal Error: x values have zero length");
           System.exit(0);
       }
       else if (newXValues.length != yValues.length)
       {
           System.out.println("Fatal Error x value array length does not equal y value array length");
           System.exit(0);
       }
       else
       {
           xValues = newXValues; 
       }
   }
    
    //DESCRIPTION: sets the yValues
    //PRECONDITIONS: parameter variable must have a value that is valid
    //POSTCONDITIONS: sets instance value to parameter value
   public void setYvalues(double[] newYValues)
   {
        if (newYValues == null)
       {
           System.out.println("Fatal Error setting yValues.");
           System.exit(0);
       }
       else if(newYValues.length == 0)
       {
           System.out.println("Fatal Error: y values have zero length");
           System.exit(0);
       }
       else if (newYValues.length != xValues.length)
       {
           System.out.println("Fatal Error y value array length does not equal x value array length");
           System.exit(0);
       }
       else
       {
           yValues = newYValues;
       }
   }
   
   /*** ACCESSOR METHODS ***/
    
    //DESCRIPTION: returns the values of x
    //PRECONDITIONS: the instance variable has value
    //POSTCONDITIONS: returns the instance value
   public double[] getXValues()
   {
       return CopyArray.copyDoubleArray(xValues, xValues.length);
   }
    
    //DESCRIPTION: returns the values of y
    //PRECONDITIONS: the instance variable has value
    //POSTCONDITIONS: returns the instance value
   public double[] getYValues()
   {
       return CopyArray.copyDoubleArray(yValues, yValues.length);
   }
   
   /*** OTHER METHODS ***/
   
    //DESCRIPTION: calls Math1 and calculates beta0 with instance variables
    //PRECONDITIONS: all instance variables have value
    //POSTCONDITIONS: returns the calculated beta0
    public double computeB0()
    {
       return Math1.beta0(xValues,yValues);
    }
     
    //DESCRIPTION: calls Math1 and calculates beta1 with instance variables
    //PRECONDITIONS: all instance variables have value
    //POSTCONDITIONS: returns the calculated beta1
    public double computeB1()
    {
        return Math1.beta1(xValues,yValues);
    }
    
    //DESCRIPTION: calls Math1 and calculates sum of squares due to
    // regression with instance variable
    //PRECONDITIONS: the instance variable has value
    //POSTCONDITIONS: returns the calculated sum of squares due to regression
    public double computeSumOfSquaresDueToRegression()
    {
        return Math1.sumOfSquaresDueToRegression(yValues);
    }
    
    //DESCRIPTION: calls Math1 and calculates sum of squares due to
    // error with instance variables
    //PRECONDITIONS: all instance variables have value
    //POSTCONDITIONS: returns the calculated sum of squares due to error
    public double computeSumOfSquaresDueToError()
    {
        return Math1.sumOfSquaresDueToError(xValues, yValues);
    }
    
    //DESCRIPTION: calls Math1 and calculates sum of squares total
    // with the instance variable
    //PRECONDITIONS: the instance variable has value
    //POSTCONDITIONS: returns the calculated sum of squares total
    public double computeSumOfSquaresTotal()
    {
        return Math1.sumOfSquaresTotal(yValues);
    }
    
    //DESCRIPTION: calls Math1 and calculates degrees of freedom
    // with the instance variable
    //PRECONDITIONS: the instance variable has value
    //POSTCONDITIONS: returns the calculated degrees of freedom
    public double computeDegreesOfFreedom()
    {
        return Math1.degreesOfFreedom(xValues);
    }
    
    //DESCRIPTION: calls Math1 and calculates fit with instance variables
    //PRECONDITIONS: all instance variables have value
    //POSTCONDITIONS: returns the calculated fit
    public double computeFit()
    {
        return Math1.fit(xValues, yValues);
    }
    
    //DESCRIPTION: calls Math1 and calculates r2 with the instance variable
    //PRECONDITIONS: the instance variable has value
    //POSTCONDITIONS: returns the calculated r2
    public double computeR2()
    {
        return Math1.r2(yValues);
    }
   
    /*** COMPARISON METHODS ***/
    
    //DESCRIPTION: compares two objects of the class to see if they are
    // "equal"
    //PRECONDITIONS: all instance variables have valid values
    //POSTCONDITIONS: returns a true boolean if both of the calling 
    // objects all have the same value for their instance variables, false if 
    // not
    public boolean equals(Object otherObject)
    {
       if (otherObject == null)
       {
           return false;
       }
       else if (getClass() != otherObject.getClass())
       {
           return false;
       }
       else
       {
          RegressionModel otherRegressionModel = (RegressionModel)otherObject;
          return (xValues == (otherRegressionModel.xValues) && yValues == (otherRegressionModel.yValues));
       }
    }             
        

    /*** REQUIRED METHODS ***/
    
    //DESCRIPTION: returns a string that contains a string of the linear 
    // regression model
    //PRECONDITIONS: all instance variables have valid values
    //POSTCONDITIONS: returns a String value that represents the data
    // in the object
    public String toString()
    {
        DecimalFormat roundedTwoDec = new DecimalFormat("#.00");        
        return "The x values are: " + Arrays.toString(xValues) + "\nThe y values are: " + Arrays.toString(yValues) +
                "\nThe equation for the linear equation is: y = " + roundedTwoDec.format(computeB0()) + " + " + 
                roundedTwoDec.format(computeB1()) + "x \n" + "The sum of squares due to regresson (SSR) is: " +
                roundedTwoDec.format(computeSumOfSquaresDueToRegression()) + "\nThe sum of squares due to error (SSE) is: " + 
                roundedTwoDec.format(computeSumOfSquaresDueToError()) + "\nThe sum of squares total (SST) is: " + 
                roundedTwoDec.format(computeSumOfSquaresTotal()) + 
                "\nThe dregrees of freedom (DF) are:" + roundedTwoDec.format(computeDegreesOfFreedom()) +
                "\nThe fit is: " + roundedTwoDec.format(computeFit()) + "\nThe R2 is: " + 
                roundedTwoDec.format(computeR2()); 
    }
}
