package q1093;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1093 {
    public double[] sampleStats(int[] count) {
        double[] res = new double[5];
        int minimum = 256, maximum = -1, mode = 0;
        double mean = 0, median = 0;
        List<int[]> sample = new ArrayList<>();
        int maxModeCnt = 0, sampleNum = 0;
        long sampleSum = 0;

        for (int i = 0; i < 256; ++i) {
            if (count[i] > 0) {
                sample.add(new int[]{i, count[i]});
                if (minimum > i) {
                    minimum = i;
                }

                if (maximum < i) {
                    maximum = i;
                }

                if (count[i] > maxModeCnt) {
                    maxModeCnt = count[i];
                    mode = i;
                }

                sampleSum += (long) i * count[i];
                sampleNum += count[i];
            }
        }

        mean = sampleSum * 1.0 / sampleNum;
        int curNum = 0;
        if (sampleNum % 2 == 0) {
            for (int i = 0; i < sample.size(); i++) {
                int[] sp = sample.get(i);
                if (curNum + sp[1] < sampleNum / 2) {
                    curNum += sp[1];
                } else if (curNum + sp[1] == sampleNum / 2) {
                    int a = sp[0];
                    int b = sample.get(i+1)[0];
                    median = (a + b) * 1.0 / 2;
                    break;
                } else {
                    median = sample.get(i)[0];
                    break;
                }
            }
        } else {
            for (int[] sp : sample) {
                if (curNum + sp[1] < sampleNum / 2 + 1) {
                    curNum += sp[1];
                } else {
                    median = sp[0];
                    break;
                }
            }
        }
        res[0] = minimum;
        res[1] = maximum;
        res[2] = mean;
        res[3] = median;
        res[4] = mode;
        // [0.0,      255.0,        128.64187,   131.0,       175.0]
        // [0.00000,  255.00000,    0.95256,     131.00000,   175.00000]

        // [32.00000, 251.00000,  -202.51838,  243.00000,  243.00000]
        // [32.0,     251.0,       242.40435,  243.0,      243.0]
        return res;
    }
}
