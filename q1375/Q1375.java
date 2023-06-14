package q1375;

public class Q1375 {
    public int numTimesAllBlue(int[] flips) {
        int n = flips.length, res = 0;
        int preStepSum = 0, preBitSum = 0;
        for (int i = 0; i < n; ++i) {
            preStepSum += i+1;
            preBitSum += flips[i];
            if (preBitSum == preStepSum) {
                ++res;
            }
        }
        return res;
    }
}
