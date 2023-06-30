package strings;

import org.junit.Assert;
import org.junit.Test;
import string.LongestCommonPrefix;

public class LongestCommonPrefixTest {

  @Test
  public void longestCommonPrefixTest() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[] test1 = new String[] {"flower", "flow", "flight"};
    String[] test2 = new String[] {"dog", "racecar", "car"};
    String result1 = longestCommonPrefix.longestCommonPrefix(test1);
    String result2 = longestCommonPrefix.longestCommonPrefix(test2);
    Assert.assertEquals(result1, "fl");
    Assert.assertEquals(result2, "");
  }
}
