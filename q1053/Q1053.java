package q1053;

public class Q1053 {
    public int[] prevPermOpt1(int[] arr) {
        int leftUp = getLeftUpFirst(arr);
        if (leftUp < 0) return arr;
        int rightMaxLt = getRightMaxLt(arr, leftUp);
        if (rightMaxLt == arr.length) return arr;
        swap(arr, leftUp, rightMaxLt);
        return arr;
    }

    private void swap(int[] arr, int leftUp, int rightMaxLt) {
        int tmp = arr[leftUp];
        arr[leftUp] = arr[rightMaxLt];
        arr[rightMaxLt] = tmp;
    }

    private int getRightMaxLt(int[] arr, int leftUp) {
        int j = arr.length - 1;
        while (j > leftUp) {
            if (arr[j] < arr[leftUp]) {
                break;
            }
            --j;
        }
        return j;
    }

    private int getLeftUpFirst(int[] arr) {
        int i = arr.length-1;
        while (i > 0) {
            if (arr[i] < arr[i-1]) {
                break;
            }
            --i;
        }
        return i - 1;
    }
}
