/**
 * @author Olivia Yurish
 * @since 10/1/20
 * 
 * analyzing text based on 7 factors: vowels, consonants, spaces, punctuation, letters, words, and avg length of word
 **/
public class CountTheParts 
{
  public String str;
  
  public CountTheParts(String str)
    {
        this.str = str;
    }
  
  //method counts vowels
  public int getVowels()
  {
    int vowels = 0;
    char[] letters = {'a', 'e', 'i', 'o', 'u'};
    int ind = 0;
    for (char i : letters)
    {
      ind = 0;
      //System.out.println(i);
      while (ind != -1)
      {
        ind = str.indexOf(i, ind);
        if (ind != -1)
        {
          vowels++;
          ind++;
        }
        else
        {
          ind = -1;
        }
      }
      //System.out.println("Number of vowels after " + i + ": " + vowels);
    }
    return vowels;
  } 

  //method counts letter
  public int getLetters()
  {
    int ind = 0;
    int letters = 0;
    boolean letter = true;
    char c = 'b';
    int len = str.length();
    //System.out.println(str.length());
    while (ind != len)
    {
      c = str.charAt(ind);
      letter = Character.isLetter(c);
      if (letter==true)
      {
        letters++;
        if (ind != len)
        {
          ind++;
        }
      }
      else
      {
        if (ind != len)
        {
          ind++;
        } else 
          break;
      }
      //System.out.println(ind);
    }
    //System.out.println("Number of vowels after " + i + ": " + vowels);
    return letters;
  }
  
  //method counts spaces
  public int getSpaces()
  {
    int count = 0;
    int ind = 0;
    while(ind != -1)
    {
      ind = str.indexOf(" ",ind);
      if(ind != -1)
      {
        count++;
        ind++;
      }
      else
        break;
    }
    return count;
  }
  
  //method counts punctuation
  public int getPunc()
  {
    int punc = 0;
    char[] puncs = {',', '.', '?', '!', ':', ';', '\'', '-'};
    int ind = 0;
    for (char i : puncs)
    {
      ind = 0;
      //System.out.println(i);
      while (ind != -1)
      {
        ind = str.indexOf(i, ind);
        if (ind != -1)
        {
          punc++;
          ind++;
        }
        else
        {
          ind = -1;
        }
      }
      //System.out.println("Number of vowels after " + i + ": " + vowels);
    }
    return punc;
  } 
  
  //method counts words
  public int getWords()
  {
    int count=0;
    int ind = 0;
    
    while (ind != -1)
    {
      ind = str.indexOf(" ",ind);
      if(ind != -1)
      {
        count++;
        ind++;
      }
      else
        break;
    }
    return count;
  }
  
  //method returns average length of words
  public double getAvgLen()
  {
    double avg = 0;
    
    int ind = 0;
    int letters = 0;
    boolean letter = true;
    char c = 'b';
    int len = str.length();
    while (ind != len)
    {
      c = str.charAt(ind);
      letter = Character.isLetter(c);
      if (letter==true)
      {
        letters++;
        if (ind != len)
        {
          ind++;
        }
      }
      else
      {
        if (ind != len)
        {
          ind++;
        } else 
          break;
      }
    }
    
    int count = 0;
    ind = 0;
    
    while (ind != -1)
    {
      ind = str.indexOf(" ",ind);
      if(ind != -1)
      {
        count++;
        ind++;
      }
      else
        break;
    }
    
    avg = (double)(letters)/count;
    return avg;
  }
}
