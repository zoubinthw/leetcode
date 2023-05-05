package q2432;

public class Q2432 {
    public int hardestWorker(int n, int[][] logs) {
        int maxTime = logs[0][1];
        int res = logs[0][0];
        for(int i = 1; i < logs.length; ++i) {
            int realTime = logs[i][1] - logs[i-1][1];
            if(realTime > maxTime) {
                maxTime = realTime;
                res = logs[i][0];
            } else if(realTime == maxTime) {
                res = logs[i][0] < res ? logs[i][0] : res;
            }
        }

        return res;
    }
}
