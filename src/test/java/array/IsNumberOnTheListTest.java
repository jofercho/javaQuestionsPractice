package array;

import array.IsNumberOnTheList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IsNumberOnTheListTest {

  @Test
  public void isNumberOnTheListTest() {
    List<Integer> a = Arrays.asList(1, 5, 10, 20, 40, 80);
    List<Integer> b = Arrays.asList(6, 7, 20, 80, 100);
    List<Integer> c = Arrays.asList(3, 4, 15, 20, 30, 70, 80, 100, 120);

    int[] output = new int[] { 80, 20 };
    IsNumberOnTheList isNumberOnTheList = new IsNumberOnTheList();
    Assert.assertArrayEquals(isNumberOnTheList
            .isNumberOnTheLists(a, b, c)
            .stream()
            .mapToInt(Integer::intValue)
            .toArray(), output);
  }
}
