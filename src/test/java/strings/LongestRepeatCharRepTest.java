package strings;

import org.junit.Test;
import string.LongestRepeatingCharReplacement;

public class LongestRepeatCharRepTest {

  @Test
  public void longestRepeatCharRepTest() {
    LongestRepeatingCharReplacement charReplacement = new LongestRepeatingCharReplacement();
    int longestRepCharRep = charReplacement.longestRepCharRep("ABABAA", 2);
    System.out.println("longestRepCharRep: " + longestRepCharRep);
  }
}
