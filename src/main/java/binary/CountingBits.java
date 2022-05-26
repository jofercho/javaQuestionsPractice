package binary;

public class CountingBits {

  public int[] countBits(int n) {
    int[] bits = new int[n+1];
    for (int i = 0; i < bits.length; i++) {
      bits[i] = bits[i>>1] + (i&1);
    }
    return bits;
  }
}
