import java.util.ArrayList;

/* Part (a) */
/*  This version uses an array of Strings.  It follows Leah's idea of changing them to "null"
 *  once they have been used.  */

public class RandomStringChooser2
{
  private String[] words;

  public RandomStringChooser2(String[] wordArray)
  {
    words = wordArray;
  }

  public String getNext()
  {
    // count non-null words
    int wordCount = 0;
    for (int i = 0; i < words.length; i++)
      if (words[i] != null)
        wordCount++;
    
    // if no words remaining, return "NONE"
    if (wordCount == 0)
      return "NONE";
    
    // get a random word to return; set its former spot to null
    String ans;
    int n = (int)(Math.random() * words.length);
    while (words[n] == null)                         // find a non-null word at random
      n = (int)(Math.random() * words.length);
    ans = words[n];
    words[n] = null;
    return ans;
  }
}


