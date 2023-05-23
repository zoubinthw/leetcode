package q1090;

import java.util.HashMap;
import java.util.Map;

public class Q1090 {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        sort(values, labels);
        int result = 0, n = values.length;
        Map<Integer, Integer> lableMap = new HashMap<>();
        int cnt = 0;
        for (int i = n-1; i >= 0; --i) {
            int label = labels[i];
            Integer numOfLabel = lableMap.getOrDefault(label, 0);
            if (numOfLabel < useLimit) {
                result += values[i];
                lableMap.put(label, numOfLabel+1);
                ++cnt;
                if (cnt >= numWanted) break;
            }
        }

        return result;
    }

    private void sort(int[] values, int[] labels) {
        qsort(values, 0, values.length-1, labels);
    }

    private void qsort(int[] values, int start, int end, int[] labels) {
        if (start >= end) return;
        int tmp = values[start];
        int initStart = start;
        int initEnd = end;
        ++start;
        while (start <= end) {
            while (end >= start && values[end] >= tmp) --end;
            while (end >= start && values[start] <= tmp) ++start;
            if(end > start) {
                swap(values, start, end);
                swap(labels, start, end);
                ++start;
                --end;
            }
        }
        swap(values, initStart, end);
        swap(labels, initStart, end);
        qsort(values, initStart, end-1, labels);
        qsort(values, end+1, initEnd, labels);
    }

    private void swap(int[] nums, int start, int end) {
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;
    }
}
