public class Math1 {

    //DESCRIPTION: returns mean of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated mean
    public static double mean(double[] values)
    {
        double sum;
        sum = 0.0;
        
        for(int index = 0; index < values.length; index++)
        {
            sum += values[index];
        }
        
        return sum / values.length;
    }
    
    //DESCRIPTION: returns xxbar of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated xxBar
    public static double xxBar(double[] x)
    {
        
        double xxbar;
        xxbar = 0.0;
        
        for(int index = 0; index < x.length; index++)
        {
            xxbar += (x[index] - mean(x)) * (x[index] - mean(x));
        }
        return xxbar;
    }
    
    //DESCRIPTION: returns yybar of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated yyBar
    public static double yyBar(double[] y)
    {
        double yybar;
        yybar = 0.0;
        
        for(int index = 0; index < y.length; index++)
        {
            yybar += ((y[index] - mean(y)) * (y[index] = mean(y)));
        }
        return yybar;
    }
    
    //DESCRIPTION: returns xybar of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated xyBar
    public static double xyBar(double[] x, double[] y)
    {
        double xybar;
        xybar = 0.0;
        
        for(int index = 0; index < x.length; index++)
        {
            xybar += ((x[index] - mean(x)) * (y[index] - mean(y)));
        }
        return xybar;
    }

    //DESCRIPTION: returns beta1 of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated beta1
    public static double beta1(double[] x, double[] y)
    { 
        return xyBar(x,y)/xxBar(x);
    }
    
    //DESCRIPTION: returns beta0 of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated beta0
    public static double beta0(double[] x, double[] y)
    {
        return mean(y) - beta1(x,y) * mean(x);
    }
    
    //DESCRIPTION: returns sum of squares due to regression of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated sum of squares due to regression
   public static double sumOfSquaresDueToRegression(double[] y)
   {
       double meanY;
       meanY = mean(y);
       
       double sumOfSquaredDeviations = 0.0;
       for(int index = 0; index < y.length; index++)
       {
           sumOfSquaredDeviations += (Math.pow(y[index] - meanY, 2));
       }
       
       return sumOfSquaredDeviations;
       
   }
    
    //DESCRIPTION: returns sum of squares total of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated sum of squares total
   public static double sumOfSquaresTotal(double[] y)
   {
       double sumOfSquaresTotal;
       sumOfSquaresTotal = 0.0;
       for(int index = 0; index < y.length; index++)
       {
           sumOfSquaresTotal += (Math.pow(y[index] - mean(y), 2));
       }
       return sumOfSquaresTotal;
   }
     
    //DESCRIPTION: returns the degrees of freedom of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated degrees of freedom
   public static double degreesOfFreedom(double[] x)
   {
       return x.length - 2;
   }
    
    //DESCRIPTION: returns the fit of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated fit
   public static double fit(double[] x, double[] y)
   {
       double fit;
       fit = 0.0;
       for(int index = 0; index < x.length; index++)
       {
           fit =  beta1(x,y) * x[index] + beta0(x,y);
       }
       return fit;
   }
    
    //DESCRIPTION: returns the coefficient of determination
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated coefficient of determination
   public static double r2(double[] y)
   {
      return sumOfSquaresDueToRegression(y) / yyBar(y);
   }
   
    //DESCRIPTION: returns the sum of squares due to error of parameter variables
    //PRECONDITIONS: all parameter variables have value
    //POSTCONDITIONS: returns the calculated sum of squares due to error
   public static double sumOfSquaresDueToError(double[] x, double[] y)
   {
       double sumOfSquaresError;
       sumOfSquaresError = 0.0;
       for(int index = 0; index < y.length; index++)
       {
           sumOfSquaresError += (Math.pow(y[index] - beta1(x,y), 2));
       }
       return sumOfSquaresError;
   }  
}
