package q2178;

import java.util.ArrayList;
import java.util.List;

public class Q2178 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 != 0) return res;
        for (long i = 2; i <= finalSum; i += 2) {
            res.add(i);
            finalSum -= i;
        }
        if (finalSum > 0) res.add(res.remove(res.size()-1) + finalSum);

        return res;
    }
}
