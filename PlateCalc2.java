/*
 * @author Olivia Yurish
 * 
 * given input of final weight, program will output the plates to be added to each side using the least possible number of plates
 * 
 * first, remove weight of bar from final weight
 * start at largest plate and take off that weight for every pair that is with in the weight limit
 * then move down plate size, recording which plates used along the way, until final weight is reached
*/
import java.util.Scanner;

public class PlateCalc2
{
  //creates array of possible weights to be added to bar 
  //with a second value for each to later be used as marker of how many to add
  public static double[][] plates = new double[][]{{100, 0}, {55,0}, {45,0}, {35,0}, {25,0}, {10,0}, {5,0}, {2.5,0}, {1.25,0}};
  
  public static double[][] calcPlate(double weight)
  {
    int count = 0;
    
    //removes weight of bar from goal weight
    double remaining = (weight-45)/2;
    
    //for loop that tests each plate, starting at the heaviest, to see if it can be added
    //loops through each plate
    for (int i=0; i<(plates.length); i++)
    {
      //resets marker to 0
      plates[i][1] = 0;
      //initial amount variable out side of while loop to reduce number of operators
      double amount = plates[i][0];
      //loops while current plate is still a viable option to be added
      while(remaining >= amount)
      {
        //reclaculates remaining weight
        remaining = (remaining-amount);
        //adds one to marker
        plates[i][1]++;
        //count used to count how many times function is looped
        count++;
      }
    }
    System.out.println("count: " + count);

    return plates;
  }
  
  //unit testing
  //result values of test values in weight array are compared to what the result should be
  public static boolean test()
  {
    double[] weight = new double[]{0, .1, 100, 145, 500};
    //loops through every test weight
    for (int i=0; i<weight.length; i++)
    {
      //creates new double array and calls calcPlate function to fill
      double[][] test = calcPlate(weight[i]);
      double result = 0;
      double goal = 0;
      
      //adds up product of number of plates and weight of that plate
      for (int j=0; j<plates.length; j++)
      {
        result+= test[j][0]*test[j][1];
      }
      //sets goal weight value
      if (weight[i]>45)
      {
        goal = (weight[i] -45)/2;
      } 
      //System.out.println("goal: " + goal);
      //System.out.println("result: " + result);
      //if the goal weight total doesn't match the reported result weight total, return false
      if (goal != result)
      {
       return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args)
  {
    double weight = 0;
    
    //asks user for input of goal weight and set to weight variable
    System.out.println("Type in an amount of weight in pounds: ");
    Scanner in = new Scanner(System.in);
    weight = in.nextDouble();
    
    //creates double array with correct marker weight values by calling calcPlate function
    double[][] add = calcPlate(weight);
    
    System.out.println("In addition to the 45lb bar, add the following plate(s) to each side: ");
    //prints out the weights that need to be added based on the number of the marker
    for (int i=0; i<add.length; i++)
    {
      if (add[i][1]>0)
      {
        System.out.println(add[i][0]);
        add[i][1]--;
      }
    }
    
    /*
    if (remaining<1.25 && remaining!=0.0)
      {
        System.out.println("You have a remainder of " + remaining + "lbs");
      }
      */
    
    //calls and prints unit test
    System.out.println(test());
  }
}