import java.util.ArrayList;

/* Part (a) */
/*  This version works with an ArrayList.  That makes randomizing and removing words much easier  */

public class RandomStringChooser1
{
  private ArrayList<String> words;

  public RandomStringChooser1(String[] wordArray)
  {
    words = new ArrayList<String>();
    for (int i = 0; i < wordArray.length; i++)
      words.add(wordArray[i]);
  }

  public String getNext()
  {
    if (words.size() == 0)
      return "NONE";
    int i = (int)(Math.random() * words.size());
    return words.remove(i);
  }
}


