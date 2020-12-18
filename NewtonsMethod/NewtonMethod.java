/**
 * @author: Olivia Yurish
 * @since: 9/3/20
 * 
 * Newton's Method Project
 * 
 * while loop in method
**/

public class NewtonMethod
{
    public static double squareroot(double sqrtnum, double lastguess, double nextguess)
  {
    //System.out.print("Your trial guesses are: ");
    while (Math.abs(lastguess - nextguess) > .0000000000000001)
    {
      /**
       * following if statement makes sure that lastguess and nextguess 
       * don't have the same values when newtons method is run
      **/
      if (nextguess != 1)
      {
        lastguess = nextguess;
      }
      nextguess = .5*((sqrtnum/lastguess)+lastguess);
      System.out.print(nextguess + ", ");
    }
    System.out.print("\n");
    return nextguess;
  }
}