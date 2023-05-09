package q1010;

public class Q1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        int[] cnt = new int[60];

        for (int t : time) {
            int k = t % 60;
            res += cnt[(60 - k) % 60];
            cnt[k]++;
        }

        return res;
    }
}
