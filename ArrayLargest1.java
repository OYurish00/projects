/*
 * @author Olivia Yurish
 * @since 10/27/20
 * 
 * 1d array of n ints and 2d array of n ints
 * fill w random 0-100
 * static method that will find the largest num in array
 */ 
public class ArrayLargest1
{
  public static int getLargestOne(int[] nums)
  {
    int largest = nums[0];
    int index = 0;
    for (int j=0; j<nums.length; j++)
    {
      if (nums[j]>largest)
      {
        largest = nums[j];
        index = j;
      }
    }
    return index;
  }
  
  public static int[] getLargestTwo (int[][] numbers)
  {
    int[] largest = new int[]{0, 0};
    for (int i=0; i<numbers.length; i++)
    {
      for (int j=0; j<numbers[0].length; j++)
      {
        if (numbers[i][j]>(numbers[largest[0]][largest[1]]))
        {
          largest[0] = i;
          largest[1] = j;
        }
      }
    }
    return largest;
  }
  
  public static void main(String[] args)
  {
    int[] nums = new int[5];
    
    for (int i=0; i<nums.length; i++)
    {
      nums[i] = (int)(Math.random()*101);
      System.out.print(nums[i] + " ");
    }
    
    System.out.println("\n");
    int[][] numbers = new int[4][4];
    
    for (int a=0; a<numbers.length; a++)
    {
      for (int b=0; b<numbers[0].length; b++)
      {
        numbers[a][b] = (int)(Math.random()*101);
        System.out.print(numbers[a][b] + " ");
      }
    System.out.println();
    }
    
    System.out.println();
    int index1 = getLargestOne(nums);
    System.out.println("Your largest number is at index " + index1);
    System.out.println("and its value is " + nums[index1]);
    
    System.out.println();
    int[] index2 = getLargestTwo(numbers);
    System.out.println("Your largest number is at index " + "(" + index2[0] + "," + index2[1] + ") where the index of the row is " + index2[0] + " and the index of the collumn is " + index2[1]);
    System.out.println("and its value is " + numbers[index2[0]][index2[1]]);
  }
}