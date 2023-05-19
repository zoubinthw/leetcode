package q1073;

import java.util.ArrayList;

public class Q1073 {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int i = arr1.length - 1, j = arr2.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = carry;
            if (i >= 0) {
                x += arr1[i];
            }

            if (j >= 0) {
                x += arr2[j];
            }

            if (x >= 2) {
                carry = -1;
                list.add(x - 2);
            } else if (x >= 0) {
                carry = 0;
                list.add(x);
            } else { // x = -1 的情况
                carry = 1;
                list.add(1);
            }

            --i;
            --j;
        }

        while (list.size() > 1 && list.get(list.size()-1) == 0) {
            list.remove(list.size()-1);
        }

        int[] ans = new int[list.size()];

        for (int m = 0, n = list.size()-1; n >= 0; m++, n-- ) {
            ans[m] = list.get(n);
        }

        return ans;
    }
}
