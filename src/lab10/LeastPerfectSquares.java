package lab10;

import java.util.*;

/**
 * (Interview Question) Devise a dynamic programming solution for the following problem:
 * Given a positive integer n, find the least number of perfect square numbers which sum to n.
 * (Perfect square numbers are 1, 4, 9, 16, 25, 36, 49, …)
 * For example, given n = 12, return 3; (12 = 4 + 4 + 4)
 * Given n = 13, return 2; (13 = 4 + 9)
 * Given n = 67 return 3; (67 = 49 + 9 + 9)
 *
 */
public class LeastPerfectSquares {

    static Map findPerfectSquares(int n){
        Map<Integer,Integer> squares = new HashMap();

        int sq = 0;

        for(int i=1;  i * i <= n ; i++){
            sq = i * i;
            if(sq <= n) squares.put(i,sq) ;
        }

        return squares;
    }

    static int least(int n){

        if(n<4) return findPerfectSquares(n).values().contains(n) ? n : 0;

        int dp[] = new int[n+1];

        for(int i = 1 ; i<=n; i++){
            dp[i] = i;
            for(int j =1; j *j <=n; j++){
                int sq = j * j;

                if(sq <= i) {
                    dp[i] = Math.min( dp[i], (dp[i-sq]+1) );
                }

            }
        }


        return dp[n];
    }

    public static void main(String[] args) {

        System.out.println(least(3));
        System.out.println(least(4));
        System.out.println(least(10));
        System.out.println(least(9));
        System.out.println(least(21));
    }
}
