package string;

public class LongestRepeatingCharReplacement {
  public int longestRepCharRep(String str, int k) {
    int strLength = str.length();
    int maxLenght = 0;
    int start = 0;
    int maxCount = 0;
    int[] chars = new int[26];

    for (int end = 0; end < strLength; end++) {
      int charVisited = str.charAt(end) - 'A';
      maxCount = Math.max(maxCount, ++chars[charVisited]);

      while (end - start + 1 - maxCount > k) {
        chars[str.charAt(start) - 'A']--;
        start++;
      }
      maxLenght = Math.max(maxLenght, end - start + 1);
    }
    System.out.println("maxCount: " + maxCount);
    return maxLenght;
  }
}
