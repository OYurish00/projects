/*
 * @author Olivia Yurish
 * @since 10/22/20
 * 
 * determines if a given array of numbers is a perfect square by checking equality of row sums, collumn sums, and diagonals
 */

public class MagicSquare
{
  public static int[] rowSum(int[][] nums)
  {
    int[] rsum = new int[nums.length];
    for (int j=0; j<nums.length; j++)
    {
      for (int i=0; i<nums[0].length; i++)
      {
        rsum[j] += nums[j][i];
      }
    }
    return rsum;
  }
  
  public static int[] colSum(int[][] nums)
  {
    int[] csum = new int[nums[0].length];
    for (int j=0; j<nums[0].length; j++)
    {
      for (int i=0; i<nums.length; i++)
      {
        csum[j] += nums[i][j];
      }
    }
    return csum;
  }
  
  public static int getSum1(int[][] nums)
  {
    int sum = 0;
    for (int j=0; j<nums.length; j++)
    {
        sum += nums[j][j];
    }
    return sum;
  }
  
  public static int getSum2(int[][] nums)
  {
    int sum = 0;
    int j = 0;
    int i = nums.length-1;
    while (i>=0)
    {
        sum += nums[j][i];
        j++;
        i--;
    }
    return sum;
  }
  
  public static boolean isMagic(boolean coltf, boolean rowtf, int col, int row, int d1sum, int d2sum)
  {
    boolean result = false;
    if (coltf && rowtf)
    {
      if ((col==row) && (col==d1sum) && (col==d2sum))
      {
        result = true;
      }
    } else {
     result = false; 
    }
    return result;
  }
  
  public static void main(String[] args)
  {
    int r = 4;
    //int r = 3;
    int[][] array = new int[r][r];
      
    int[] magic = new int[]{1, 15, 14, 4, 12, 6, 7, 9, 8, 10, 11, 5, 13, 3, 2, 16};
    //int[] magic = new int[]{2, 7, 6, 9, 5, 1, 4, 3, 8};
    int z = 0;
      for (int i=0; i<array.length; i++)
      {
        for (int j=0; j<array[0].length; j++)
        {
          array[i][j] = magic[z];
          z++;
        }
      }
  
    for (int i=0; i<array.length; i++)
    {
      for (int j=0; j<array[0].length; j++)
      {
        System.out.print(array[i][j] + " ");
      }
      System.out.println(" ");
    }
    
    int row = 0;
    int check = 0;
    boolean rowtf = false;
    System.out.println();
    System.out.println("row total: ");
    int[] rsum = rowSum(array);
    for (int a=0; a<array.length; a++)
    {
      System.out.println(rsum[a]);
      if (rsum[0] != rsum[a])
      {
        check++;
      }
    }
    if (check == 0)
    {
      rowtf = true;
      row = rsum[0];
    } 
    
    int col = 0;
    check = 0;
    boolean coltf = false;
    System.out.println();
    System.out.println("collumn total: ");
    int[] csum = colSum(array);
    for (int b=0; b<array[0].length; b++)
    {
      System.out.println(csum[b]);
      if (csum[0] != csum[b])
      {
        check++;
      }
    }
    
    if (check == 0)
    {
      coltf = true;
      col = csum[0];
    } 
    
    System.out.println();
    System.out.println("diagonal 1 total: ");
    int d1sum = getSum1(array);
    System.out.println(d1sum);
    
    System.out.println();
    System.out.println("diagonal 2 total: ");
    int d2sum = getSum2(array);
    System.out.println(d2sum);
    System.out.println();
    
    if (isMagic(coltf, rowtf, col, row, d1sum, d2sum))
    {
      System.out.println("It's magic!!");
    } else {
      System.out.println("It's not magic"); 
    }
    
  }
}