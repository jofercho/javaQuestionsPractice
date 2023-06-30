package string;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strings) {
    String prefix = "";
    int iterator = 0;
    while (true) {
      if (areCharactersEqual(iterator, strings)) {
        prefix += strings[0].charAt(iterator);
        iterator++;
      } else {
        return prefix;
      }
    }
  }

  private boolean areCharactersEqual(int index, String[] strings) {
    Character c = null;
    for (int i = 0; i < strings.length; i++) {
      if (c == null) {
        c = strings[i].charAt(index);
        continue;
      }
      if (!c.equals(strings[i].charAt(index))) return false;
    }
    return true;
  }
}
