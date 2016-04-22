import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordPuzzleTest {

  @Test
  public void wordPuzzlerizer_acceptingInput_String() {
    WordPuzzle wrdPzl = new WordPuzzle();
    String expected = "word";
    System.out.println("Accept input: " + expected);
    assertEquals(expected, wrdPzl.wordPuzzlerizer("word"));
  }
}
