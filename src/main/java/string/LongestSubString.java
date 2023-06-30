package string;

public class LongestSubString {

//  public int longestUniqueSubstring(String str) {
//    int n = str.length();
//    int result = 0;
//    boolean[] charAppear = new boolean[26];
//    for (int i = 0; i < n; i++) {
//      for (int j = i; j < n; j++) {
//        int charPosition = str.charAt(j) - 'A';
//        if (charAppear[charPosition]) {
//          result = Math.max(result, j - i);
//          break;
//        }
//        charAppear[charPosition] = true;
//      }
//      charAppear[str.charAt(i)-'A'] = false;
//    }
//    return result;
//  }

  public int longestUniqueSubstring(String str) {
    int n = str.length();
    int maxLength = 0;
    boolean[] charAppear = new boolean[26];
    for(int i = 0; i < n; i++){
      for (int j = i; j < n; j ++){
        if(charAppear[str.charAt(j)-'A']){
          maxLength = Math.max(maxLength, j-i);
          break;
        }
        charAppear[str.charAt(j)-'A']=true;
      }
      charAppear[i] = false;
    }
    return maxLength;
  }
}
