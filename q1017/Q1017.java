package q1017;

public class Q1017 {
    public String baseNeg2(int n) {
        if(n < 1) return "0";
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int mod = n % (-2);
            n /= -2;
            if (mod == -1) {
                mod = -mod;
                ++n;
            }
            sb.append(mod);
        }

        return sb.reverse().toString();
    }
}
