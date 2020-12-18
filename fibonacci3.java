/*
 * @author Olivia Yurish
 * 
 * prints out the fibonacci sequence up to a given point
 * 
*/
import java.util.Scanner;
import java.util.HashMap;

public class fibonacci3
{
  public static int[] nums = new int[30];
  
  public static void main(String[] args)
  {
    //creates new hasmap and intitializes the first two digits of the sequence
    HashMap<String, Integer> fibonacci = new HashMap<String, Integer>();
    fibonacci.put("0", 0);
    fibonacci.put("1", 1);
    
    int goal =1;
    //exit strategy: type -1 to stop program
    while (goal != -1)
    {
      //asks user for end digits which is set to goal variable
      System.out.println("Type in a number of the fibonacci sequence: ");
      Scanner in = new Scanner(System.in);
      goal = in.nextInt();
      
      System.out.print(fibonacci.get(Integer.toString(0)) + " ");
      //loops through and prints every digit in the sequence until it reaches the goal digit
      for (int i=1; fibonacci.get(Integer.toString(i-1))<=goal; i++)
      {
        //input the next digit of the sequence if it doesn't exist
        if (fibonacci.size()<=i)
        {
          fibonacci.put(Integer.toString(i), fibonacci.get(Integer.toString(i-2)) + fibonacci.get(Integer.toString(i-1)));
        }
        int thisnum = fibonacci.get(Integer.toString(i));
        //tests if current number of the sequence is with in the intented range
        if (thisnum>goal)
        {
          break;
        }
        //prints next digit of sequence out
        System.out.print(thisnum + " ");
      }
      System.out.println();
    }
  }
}
