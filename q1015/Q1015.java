package q1015;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q1015 {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0) return -1;
        Set<Integer> set = new HashSet<>();
        int sid = 1 % k;
        while (sid > 0 && set.add(sid)) {
            sid = (sid * 10 + 1 ) % k;
        }

        return sid > 0 ? -1 : set.size() + 1;
    }
}
