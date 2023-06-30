package strings;

import org.junit.Test;
import string.LongestSubString;

public class LongestSubStringTest {
  @Test
  public void longestSubStringTest() {
    String test = "ABDEFGABEF";
    String test2 = "GEEKSFORGEEKS";
    System.out.println(test.charAt(2)-'A');
    LongestSubString longestSubString = new LongestSubString();
    int longestUniqueSubstring = longestSubString.longestUniqueSubstring(test);
    int longestUniqueSubstring2 = longestSubString.longestUniqueSubstring(test2);
    System.out.println("the longest substring is: " + longestUniqueSubstring);
    System.out.println("the longest substring is: " + longestUniqueSubstring2);
  }
}
