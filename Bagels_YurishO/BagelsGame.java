/*
 * @author Olivia Yurish 
 * @since 10/12/20
 * 
 * Bagels Game - user tries to guess randomly generated number based on hints of Bagel Pico and Fermi
 */

public class BagelsGame
{
  private int[] secretNumber;
  private int[] guess;
  
  public BagelsGame()
  {
    secretNumber = getSecretNumber();
    //System.out.println(secretNumber.length);
    //System.out.println("inside const");
    //for(int i = 0; i< secretNumber.length;i++)
      //System.out.println(secretNumber[i]);
    
  }
  private int[] getSecretNumber()
  {
    int[] secretNumber = new int[3];
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int len = nums.length;
    for (int i = 0; i !=3; i++)
    {
      int randInt = (int)(Math.random()*len);
      //move chosen value to end and len--
      secretNumber[i] = nums[randInt];
      int temp = nums[randInt];
      nums[randInt] = nums[len-1];
      nums[len-1] = temp;
      len--;
    }
    return secretNumber;

   }
  
   public int[] returnSecretNumber()
   {
     return secretNumber;
   }
   
   public String getGuess(int resp)
   {
     
     //System.out.println(resp);
     int[] guess = new int[3];
     String strguess = Integer.toString(resp);
     for (int i = 0; i<3; i++)
     {
       //then use index to put into array
        char c = strguess.charAt(i);
        guess[i] = Integer.parseInt(String.valueOf(c));
     }
     String response = processGuess(guess);
     return response;
   }
   
   public String processGuess(int[] guess)
   {
     String response = "";
       
       for (int a=0; a<3; a++)
       {
         int isin = 0;
         int pos = 0;
         
         int snum = guess[a];
         for (int b=0; b<3; b++)
         {
           if (snum - secretNumber[b] == 0)
           {
             isin =1;
             //System.out.println("isin=1");
           }
         }
         
         if (guess[a] - secretNumber[a] == 0)
           {
             pos=1;
             //System.out.println("pos=1");
           }
                 
         if (pos==1 && isin==1)
         {
           response += "Fermi ";
         } else if (isin==1 && pos==0) {
           response += "Pico ";
         } else {
           response += "Bagel ";
         }
       }
       return response;
   }
}