import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsNumberOnTheList {
//test
  public List<Integer> isNumberOnTheLists(List<Integer> a, List<Integer> b, List<Integer> c) {
    List<Integer> solution = new ArrayList<>();
    Map<Integer, Integer> numbers = new HashMap<>();
    a.forEach(number -> numbers.put(number, 1));
    b.forEach(number -> {
      if (numbers.containsKey(number)) {
        numbers.put(number, 2);
      }
    });
    c.forEach(number -> {
      if (numbers.containsKey(number)) {
        numbers.put(number, 3);
      }
    });
    numbers.forEach((number, repetition) -> {
      if (repetition == 3) {
        solution.add(number);
      }
    });
    return solution;
  }
}
