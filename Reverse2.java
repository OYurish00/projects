/*
 * @author Olivia Yurish 
 * @since 10/16/20
 * 
 * inputs integer and reverses it
 */
import java.util.Scanner;

public class Reverse2
{
  private int number;
  private int reversed;
  
  public Reverse2(int number, int reversed)
  {
    this.number = number;
    this.reversed = reversed;
  }
  
  public static void main(String[] args)
  {
    int number = 0;
    int reversed = 0;
    System.out.println("Type in a number to be reversed");
    Scanner in = new Scanner(System.in);
    number = in.nextInt();
    int len = String.valueOf(number).length();
    
    if (len > 1)
    {
    reversed = reverse(number, reversed);
    } else {
      reversed = number;
    }
    
    System.out.println("Your number reversed is: " + reversed);
    System.out.println(testReverse());
  }
  
  public static int reverse(int number, int reversed)
  {
    if (number < 10){
      return number;
    }
      int remain = number%10;
      reversed = (reversed*10) + remain;
      number = number/10;
      if (number > 10)
      {
        reversed = reverse(number, reversed);
      } else {
        reversed = (reversed*10) + number;
      }
      return reversed;
  }
  
  public static boolean testReverse()
  {
    int[] nums = new int[]{1234, 1};    
    int[] reversenums = new int[]{4321, 1};
    for (int i=0; i<nums.length; i++)
    {
     if (reverse(nums[i], 0) != reversenums[i])
     {
       return false;
     }
    }
    return true;
  }
}
