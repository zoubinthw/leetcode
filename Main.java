import q0874.Q0874;

public class Main {
    public static void main(String[] args) {
        Q0874 q0874 = new Q0874();
        int[] commands = {4,-1,4,-2,4};
        int[][] obstacles = {{2, 4}};
        int res = q0874.robotSim(commands, obstacles);
        System.out.println(res);
    }
}
