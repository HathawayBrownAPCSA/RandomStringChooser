import java.util.ArrayList;

/* Part (a) */
/*  This version uses an array of Strings and an array of booleans telling whether 
 *  each word has been used already.  */

public class RandomStringChooser4
{
  private String[] words;
  private boolean[] used;

  public RandomStringChooser4(String[] wordArray)
  {
    words = wordArray;
    used = new boolean[words.length];
    for (int i = 0; i < used.length; i++)
      used[i] = false;
  }

  public String getNext()
  {
    // count unused words
    int wordCount = 0;
    for (int i = 0; i < words.length; i++)
      if (used[i] == false)
        wordCount++;
    
    // if no words remaining, return "NONE"
    if (wordCount == 0)
      return "NONE";
    
    // get a random word to return; mark it as used
    String ans;
    int n = (int)(Math.random() * words.length);
    while (used[n] == true)                         // find a non-used word at random
      n = (int)(Math.random() * words.length);
    ans = words[n];
    used[n] = true;
    return ans;
  }
}


