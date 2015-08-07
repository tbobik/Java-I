import org.math.plot.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.io.IOException;
import java.util.Scanner;
public class Test {
    public static void main(String args[])
    {
        /*** DECLERATION SECTION ***/
        Scanner keyboard;
        String inputLine1;
        String inputLine2;
        RegressionModelWithLabels.RegressionType type;
        String[] xValues;
        String[] yValues;
        double[] x;
        double[] y;
        String xAxisLabel;
        String yAxisLabel;
        RegressionModelWithLabels regression1;
        
        /*** INITIALIZATION SECTION ***/
        keyboard = new Scanner(System.in);
        type = RegressionModelWithLabels.RegressionType.LINEAR;
        
        /*** INPUT SECTION ***/
        // takes input for x 
        System.out.println("Please enter x values that are numeric and seperated by commas:");
        inputLine1 = keyboard.nextLine();
        xValues = inputLine1.split(",\\s+");
        x = new double[xValues.length];
        // parses the string value given by user and puts it into the double array
        for(int index = 0; index < xValues.length; index++)
        {
            x[index] = Double.parseDouble(xValues[index]);
        }
        System.out.println("Enter x axis label:");
        xAxisLabel = keyboard.nextLine();
        
        // takes input for y
        System.out.println("Please enter y values that are numeric and seperated by commas:");
        inputLine2 = keyboard.nextLine();
        yValues = inputLine2.split(",\\s+");
        y = new double[yValues.length];
        // parses the string value given by user and puts it into the double array
        for(int index = 0; index < yValues.length; index++)
        {
            y[index] = Double.parseDouble(yValues[index]);
        }
        System.out.println("Enter y axis label:");
        yAxisLabel = keyboard.nextLine();
        
        regression1 = new RegressionModelWithLabels(x,y,type,xAxisLabel,yAxisLabel);
        System.out.println(regression1);
        
        // create your PlotPanel (you can use it as a JPanel)
        Plot2DPanel plot = new Plot2DPanel();

        // add plot points to the PlotPanel
        plot.addScatterPlot("Scatter Plot", x, y);
        
        // change name of axes
        plot.setAxisLabels(xAxisLabel,yAxisLabel);

        // alinging labels
        plot.getAxis(0).setLabelPosition(0.5,-0.10);
        plot.getAxis(1).setLabelPosition(-0.14,0.5);

        // put the PlotPanel in a JFrame, as a JPanel
        JFrame frame = new JFrame("Scatter Plot of X and Y arrays");
        frame.setSize(950, 600);
        frame.setContentPane(plot);
        frame.setVisible(true);
        
        // saves graph as jpeg to desktop
        try
        {
            BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = image.createGraphics();
            frame.paint(graphics2D);
            ImageIO.write(image,"jpeg", new File("/Users/tyler/Desktop/LinearRegression.jpeg"));
        }
        catch(IOException e)
        {
            System.out.println("Error saving image");
            System.exit(0);
            
        }
       //to exit program
       System.out.println("Press X to exit");
       String answer = keyboard.nextLine();
       if(answer.equalsIgnoreCase("x"))
       {
           System.exit(0);
       }
       
    }       
}
