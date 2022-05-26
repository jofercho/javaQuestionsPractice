package binary;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int solution = 0;
        while (n != 0){
            solution = solution + (n&1);
            n = n >>> 1;
        }
        return solution;
    }
}
