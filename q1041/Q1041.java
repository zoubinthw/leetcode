package q1041;

public class Q1041 {
//    private final static Integer MAX = 202;
//    private final static int[][] map = new int[MAX][MAX];
//    //(x, y) 上,     右,     下 ,    左
//    private final static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//    //       北: 00, 东: 01, 南: 10, 西: 11
//    private int curDirection = 0;
//    public boolean isRobotBounded(String instructions) {
//        map[101][101] = 1;
//        int curX = 101;
//        int curY = 101;
//        for (int i = 0; i < instructions.length(); ++i) {
//            char instruction = instructions.charAt(i);
//            if (isMove(instruction)) {
//                int nextX = curX + direction[curDirection][0];
//                int nextY = curY + direction[curDirection][1];
//                if (map[nextX][nextY] == 1) {
//                    return false;
//                }
//                map[nextX][nextY] = 1;
//                curX = nextX;
//                curY = nextY;
//            } else {
//                curDirection = getDirection(curDirection, instruction);
//            }
//        }
//
//        return true;
//    }
//
//    private boolean isMove(char instruction) {
//        return instruction == 'G';
//    }
//
//    private int getDirection(int curDirection, char direction) {
////        if (curDirection == 0) {
////            return direction == 'L' ? 3 : 1;
////        }
////        if (curDirection == 1) {
////            return direction == 'L' ? 0 : 2;
////        }
////        if (curDirection == 2) {
////            return direction == 'L' ? 1 : 3;
////        }
////        if (curDirection == 3) {
////            return direction == 'L' ? 2 : 0;
////        }
//        switch (curDirection) {
//            case 0:
//                return direction == 'L' ? 3 : 1;
//            case 1:
//                return direction == 'L' ? 0 : 2;
//            case 2:
//                return direction == 'L' ? 1 : 3;
//            case 3:
//                return direction == 'L' ? 2 : 0;
//            default:
//                return -1;
//        }
//    }

    public boolean isRobotBounded(String instructions) {
        int[] dist = {0, 0, 0, 0}; //在指令序列下，机器人在每个方向上的位移
        int k = 0; //方向
        for (int i = 0; i < instructions.length(); ++i) {
            char instruction = instructions.charAt(i);
            if (instruction == 'G') {
                dist[k]++;
            } else {
                k = instruction == 'R' ? (k + 1) % 4 : (k + 3) % 4;
            }
        }

        return (dist[0] == dist[2] && dist[1] == dist[3]) || k != 0;
    }
}
