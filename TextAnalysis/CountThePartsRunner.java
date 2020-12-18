/**
 * @author Olivia Yurish
 * @since 10/1/20
 * 
 * analyzing text based on 7 factors: vowels, consonants, spaces, punctuation, letters, words, and avg length of word
 **/

public class CountThePartsRunner
{
  public static void main(String[] args)
  {
    String str2 = "THE consulting-rooms of Dr Orion Hood, the eminent criminologist and specialist in certain moral disorders, lay along the sea-front at Scarborough, in a series of very large and well-lighted french windows, which showed the North Sea like one endless outer wall of blue-green marble. In such a place the sea had something of the monotony of a blue-green dado: for the chambers themselves were ruled throughout by a terrible tidiness not unlike the terrible tidiness of the sea.  It must not be supposed that Dr Hood's apartments excluded luxury, or even poetry. These things were there, in their place; but one felt that they were never allowed out of their place. ";
    String str = str2.toLowerCase();

    CountTheParts t1 = new CountTheParts(str);
    System.out.println("Number of vowels in the string: " + t1.getVowels());
    int cons = t1.getLetters() - t1.getVowels();
    System.out.println("Number of consonants in the string: " + cons);
    System.out.println("Number of spaces in the string: " + t1.getSpaces());
    System.out.println("Number of punctuation in the string: " + t1.getPunc());
    System.out.println("Number of letters in the string: " + t1.getLetters());
    System.out.println("Number of words in the string: " + t1.getWords());
    double avg = (double)(t1.getLetters()) / t1.getWords();
    System.out.println("Average length of words in the string: " + avg); 
    //OR
    System.out.println("Average length of words in the string: " + t1.getAvgLen());
    
  }
}