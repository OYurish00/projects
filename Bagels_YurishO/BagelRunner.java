/*
 * @author Olivia Yurish 
 * @since 10/12/20
 * 
 * Runner for Bagels Game - user tries to guess randomly generated number based on hints of Bagel Pico and Fermi
 */
import java.util.Scanner;

public class BagelRunner
{
  public static void main(String[] args)
  {
    BagelsGame b1 = new BagelsGame();
    int[] sn = b1.returnSecretNumber();
    /*
    for (int j = 0; j<3; j++)
    {
      System.out.println(sn[j]);
    }
    */
    
    int tries = 0;
    //Description of game
    System.out.println("The goal of the game is to guess the correct number that the computer randomly generates(no repeating digits nor zeros). You will be given a hint after each guess based on the following rules. \n Rules for hints: \n Bagel - guess number is neither in the secret number nor the correct position \n Pico - guess number is in the secret number but in wrong place \n Fermi - guess number is in the secret number and in the correct place \n Guess the number in 5 guesses to win!");
    
    //Propmts first guess
    System.out.println("Enter a 3 digit number(no repeating digits nor zeros): ");
    Scanner in = new Scanner(System.in);
    int resp = in.nextInt();
    String response = b1.getGuess(resp);
    System.out.println(response);
    tries++;
    
    //Prompts user to guess another 3-digit number if it isn't all correct 
    while (response.indexOf("Fermi Fermi Fermi") == -1)
    {
      System.out.println("Enter a 3 digit number(no repeating digits nor zeros): ");
      resp = in.nextInt();
      response = b1.getGuess(resp);
      System.out.println(response);
      tries++;
    }
    
    if (tries>5)
    {
      System.out.println("You lost!");
    } else {
      System.out.println("You won!");
    }
    System.out.println("You took " + tries + " tries to guess the right number!");
  }
  

}
