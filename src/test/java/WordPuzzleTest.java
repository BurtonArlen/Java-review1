import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordPuzzleTest {

  @Test
  public void wordPuzzlerizer_acceptingInput_String() {
    WordPuzzle wrdPzl = new WordPuzzle();
    String expected = "why";
    System.out.println("StringIn: " + expected);
    assertEquals(expected, wrdPzl.wordPuzzlerizer("why"));
  }

  // @Test
  // public void wordPuzzlerizer_inputStringToArray_Arraylist() {
  //   WordPuzzle wrdPzl = new WordPuzzle();
  //   ArrayList<String> expected = new ArrayList<String>();
  //   expected.add("word");
  //   System.out.println("ArrayString: " + expected);
  //   assertEquals(expected, wrdPzl.wordPuzzlerizer("word"));
  // }

  // @Test
  // public void wordPuzzlerizer_StringToSplit_Array() {
  //   WordPuzzle wrdPzl = new WordPuzzle();
  //   String[] expected = {"w","o","r","d"};
  //   System.out.println("ArrayStringSplit: " + expected);
  //   assertEquals(expected, wrdPzl.wordPuzzlerizer("word"));
  // }

  @Test
  public void wordPuzzlerizer_RemoveVowel_String() {
    WordPuzzle wrdPzl = new WordPuzzle();
    String expected = "Th-s, -s - t-st t- s-- w-rds. W-rds w-th--t v-w-ls.";
    System.out.println("StringIn: This, is a test to see words. Words without vowels.");
    assertEquals(expected, wrdPzl.wordPuzzlerizer("This, is a test to see words. Words without vowels."));
  }
}
