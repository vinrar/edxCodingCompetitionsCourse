import mooc.EdxIO;

public class ThreeBonacci {
    public static void main(String[] args) {
        try(EdxIO in = EdxIO.create()) {
            int a0 = in.nextInt();
            int a1 = in.nextInt();
            int a2 = in.nextInt();

            int n = in.nextInt();

            int[] dp = null;

            if(n < 3){
                dp = new int[3];
            } else{
                dp = new int[n + 1];
            }

            for(int i = 0; i < n + 1; i ++){
                dp[i] = -1024;
            }

            dp[0] = a0;
            dp[1] = a1;
            dp[2] = a2;

            in.println(findFib(n, a0, a1, a2, dp));
        }
    }

    public static int findFib(int n, int a0, int a1, int a2, int[] dp) {
        if(dp[n] != -1024)
            return dp[n];

        dp[n] = findFib(n-1, a0, a1, a2, dp) + findFib(n-2, a0, a1, a2, dp) - findFib(n-3, a0, a1, a2, dp);
        return dp[n];
    }
}