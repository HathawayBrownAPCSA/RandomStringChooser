import java.util.ArrayList;

/* Part (a) */
/*  This version uses an array of Strings.  
 *  It updates the array by removing a word once it has been used.  */

public class RandomStringChooser3
{
  private String[] words;

  public RandomStringChooser3(String[] wordArray)
  {
    words = wordArray;
  }

  public String getNext()
  {
    // check for empty array
    if (words.length == 0)
      return "NONE";
    
    // get a random word
    int rand = (int)(Math.random() * words.length);
    String ans = words[rand];
    
    // create a new array with that word removed
    String[] temp = new String[words.length - 1];
    int tempIndex = 0;
    for (int i = 0; i < words.length; i++)
    {
      if (i != rand)
      {
        temp[tempIndex] = words[i];
        tempIndex++;
      }
    }
    words = temp;   
     
    // all done!
    return ans;    
  }
}


