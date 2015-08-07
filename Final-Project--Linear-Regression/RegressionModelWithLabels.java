public class RegressionModelWithLabels extends RegressionModel {
        
       public enum RegressionType {NONE, LINEAR, NONLINEAR}
    
    /*** CONSTANTS ***/
    public static final String DEFAULT_XAXIS = "X axis";
    public static final String DEFAULT_YAXIS = "Y axis";
    public static final RegressionType DEFAULT_TYPE = RegressionType.NONE;
    
    /*** INSTANCE VARIABLES ***/
    private String xAxisLabel;
    private String yAxisLabel;
    private RegressionType type;
    
    /*** CONSTRUCTORS ***/
    
    //DESCRIPTION: initiates RegressionModelWithLabels to its default values and uses super
    // constructor to call the constructor for the RegressionModel base class
    //PRECONDITIONS: all constant variables have values
    //POSTCONDITIONS: initiates the superclass RegressionModel and 
    // RegressionModelWithLabels to default values
    public RegressionModelWithLabels()
    {
        super();
        type = DEFAULT_TYPE;
        xAxisLabel = DEFAULT_XAXIS;
        yAxisLabel = DEFAULT_YAXIS;
    }
    
    //DESCRIPTION: calls the super constructor for x for the RegressionModel 
    //base class  and initiates RegressionModelWithLabels to its parameter values
    //PRECONDITIONS: all parameter variables have a valid values
    //neither theXaxisLabel and theYaxisLabelare null
    //POSTCONDITIONS: initiates x, y, type, theXaxisLabel,
    // and theYaxisLabel to their parameter values
    public RegressionModelWithLabels(double[] x, double[] y, RegressionType type,
            String theXaxisLabel, String theYaxisLabel)
    {
        super(x,y);
        if((theXaxisLabel == null) || (theYaxisLabel == null))
        {
            System.out.println("Fatal Error creating axis labels");
            System.exit(0);
        }
        else
        {
            this.type = type;
            xAxisLabel = theXaxisLabel;
            yAxisLabel = theYaxisLabel;  
        }
    }
    
    //DESCRIPTION: creates a copy that is an exact copy of its parameter
    //PRECONDITIONS: has one parameter of the same type as the class
    //POSTCONDTIONS: creates a completely independent copy of its parameter
    public RegressionModelWithLabels(RegressionModelWithLabels originalObject)
    {
        super(originalObject);
        type = originalObject.type;
        xAxisLabel = originalObject.xAxisLabel;
        yAxisLabel = originalObject.yAxisLabel;
        
        
    }
    
    /*** MUTATOR METHODS ***/
    
    //DESCRIPTION: sets the name for the x axis
    //PRECONDITIONS: parameter variable must have a value that is not null
    //POSTCONDITIONS: sets instance value to parameter values
    public void setXaxisLabel(String newXaxisLabel)
    {
        if(newXaxisLabel == null)
        {
            System.out.println("Fatal Error creating X axis Label.");
            System.exit(0);
        }
        else
        {
            xAxisLabel = newXaxisLabel;
        }
    }
    
    //DESCRIPTION: sets the name for the y axis
    //PRECONDITIONS: parameter variable must have a value that is not null
    //POSTCONDITIONS: sets instance value to parameter value
    public void setYaxisLabel(String newYaxisLabel)
    {
        if(newYaxisLabel == null)
        {
            System.out.println("Fatal Error creating Y axis Label.");
            System.exit(0);
        }
        else
        {
            yAxisLabel = newYaxisLabel;
        }
    }
    
    //DESCRIPTION: sets the enum type
    //PRECONDITIONS: parameter variable must have a value 
    //POSTCONDITIONS: sets enum value to parameter value
    public void setRegressionType(RegressionType input)
    {
        type = input;
    }
    

    /*** ACCESSOR METHODS ***/
    
    //DESCRIPTION: returns the name of the x axis
    //PRECONDITIONS: all instance variables have value
    //POSTCONDITIONS: returns the instance value
    public String getXaxisLabel()
    {
        return this.xAxisLabel;
    }
    
    //DESCRIPTION: returns name of the y axis
    //PRECONDITIONS: all instance variables have value
    //POSTCONDITIONS: returns the instance value
    public String getYaxisLabel()
    {
        return this.yAxisLabel;
    }
    
    //DESCRIPTION: returns enum value of type
    //PRECONDITIONS: instance variable has value
    //POSTCONDITIONS: returns the instance value
    public RegressionType getRegressionType()
    {
        return type;
    }
    
    /*** COMPARISON METHODS ***/
    
    //DESCRIPTION: compares two objects of the class to see if they are
    // "equal"
    //PRECONDITIONS: all instance variables have valid values
    //POSTCONDITIONS: returns a true boolean if both of the calling 
    // objects all have the same value for their instance variables, false if 
    // not
    public boolean equals(RegressionModelWithLabels otherObject)
    {
        if(otherObject == null)
        {
            return false;
        }
        else if(getClass() != otherObject.getClass())
        {
            return false;
        }
        else
        {
            RegressionModelWithLabels otherRegressionModelWithLabels = (RegressionModelWithLabels)otherObject;
            return super.equals(otherObject) && xAxisLabel.equals(otherRegressionModelWithLabels.xAxisLabel) && yAxisLabel.equals(otherRegressionModelWithLabels.yAxisLabel);
        }
    }

    /*** OTHER REQUIRED METHODS ***/
    
    //DESCRIPTION: returns a string that contains the super.toString value,
    // the xAxisLabel and the yAxisLabel
    //PRECONDITIONS: all instance variables have valid values
    //POSTCONDITIONS: returns a String value that represents the data
    // in the object
    public String toString()
    {
        return (super.toString() + "\nThe type of regression is: " + type +
                "\nThe x axis label is: " + this.xAxisLabel + 
                "\nThe y axis label is: " + this.yAxisLabel);
    }
    
}
