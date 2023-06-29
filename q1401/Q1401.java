package q1401;

public class Q1401 {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int minX = minValue(xCenter, x1, x2);
        int minY = minValue(yCenter, y1, y2);
        return Math.pow(minX, 2.0) + Math.pow(minY, 2.0) <= Math.pow(radius, 2.0);
    }

    private int minValue(int r, int n1, int n2) {
        if (r < n1) return n1 - r;
        if (r <= n2) return 0;
        return r - n2;
    }
}
