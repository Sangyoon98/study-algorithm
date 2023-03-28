package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1463 {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(Dp(N));
    }

    public static int Dp (int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) dp[N] = Math.min(Dp(N - 1), Math.min(Dp(N / 3), Dp(N / 2))) + 1;

            else if (N % 3 == 0) dp[N] = Math.min(Dp(N / 3), Dp(N - 1)) + 1;

            else if (N % 2 == 0) dp[N] = Math.min(Dp(N / 2), Dp(N - 1)) + 1;

            else dp[N] = Dp(N - 1) + 1;
        }
        return dp[N];
    }
}
