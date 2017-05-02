public class RandomChooserTest
{
  public static void main(String[] args)
  {
    String[] wordArray = {"wheels", "on", "the", "bus"};
    RandomStringChooser3 sChooser = new RandomStringChooser3(wordArray);

    for (int k = 0; k < 6; k++)
    {
      System.out.print(sChooser.getNext() + " ");
    }
    System.out.println();

    RandomLetterChooser letterChooser = new RandomLetterChooser("cat");

    for (int k = 0; k < 4; k++)
    {
      System.out.print(letterChooser.getNext());
    }
    System.out.println();
  }
}
