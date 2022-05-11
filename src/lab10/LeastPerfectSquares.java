package lab10;

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

    int[] findPerfectSquares(int n){
        int [] squares = new int [n/2];

        double sq = 0;

        for(int i=1; i<squares.length ; i++){
            sq =(int) Math.sqrt(i);

            if(sq - Math.floor(sq)==0) squares[i] = (int) sq;
        }

        return squares;
    }

    int least(int n){
        int sum = 0;

        for(int i: findPerfectSquares(n)){



        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
