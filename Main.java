import q970.Q970;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Q970 q970 = new Q970();
        int x = 3, y = 5, bound = 15;
        List<Integer> result = q970.powerfulIntegers(x, y, bound);
        for (Integer item : result) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
