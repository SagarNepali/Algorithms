package lab10;

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
