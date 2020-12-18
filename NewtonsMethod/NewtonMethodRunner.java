/**
 * @author: Olivia Yurish
 * @since: 9/3/20
 * 
 * Newton's Method Project Runner
 * 
 * Determines square root of given number using Newton's method
**/

import java.util.Scanner;

public class NewtonMethodRunner
{
  public static void main(String[] args)
  {    
    Scanner kb = new Scanner(System.in);
    System.out.print("What number would you like to find the square root of? And what is your first guess?");
    double sqrtnum = kb.nextDouble();
    double lastguess = kb.nextDouble();
    
    double nextguess = 1;
    double count = 1;
    
    NewtonMethod method = new NewtonMethod();
    System.out.print("Your trial values are: ");
    System.out.print("The square root of " + sqrtnum + " is " + (method.squareroot(sqrtnum, lastguess, nextguess)));     
  }
}
