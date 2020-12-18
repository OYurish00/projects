/*
@author: Olivia Yurish
@since: 9/3/20

Perfect Number Project
*/

  
 public class PerfectNum
 {
   public static boolean isPerfect(int num)
   {
     int sum = 1;
     int sq = (int)(Math.sqrt(num));
       for (int i = 2; i <= sq; i++)
       {
         if (num % i == 0)
         {
          sum+=i;
          sum+= num/i;
         }
       }
        return sum==num;
   }
   public static void main(String[] args)
   {
     System.out.print("Your perfect numbers are: \n");
     int perf = 0;
     int num = 2;
     
     while (perf<4)
     {
       if (isPerfect(num))
       {
        perf += 1; 
        System.out.println(num);
       }
       num++;
     }
   }
 }