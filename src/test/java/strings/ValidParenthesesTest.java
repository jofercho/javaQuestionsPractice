package strings;

import org.junit.Assert;
import org.junit.Test;
import string.ValidParentheses;

public class ValidParenthesesTest {

  @Test
  public void validParenthesesTest() {
    ValidParentheses validParentheses = new ValidParentheses();
      boolean test1 = validParentheses.validParentheses("[()]");
      boolean test2 = validParentheses.validParentheses("[]()");
      boolean test3 = validParentheses.validParentheses("[)]");
      Assert.assertTrue(test1);
      Assert.assertTrue(test2);
      Assert.assertFalse(test3);
  }
}
