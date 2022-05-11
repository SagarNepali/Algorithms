package lab10;

/**
 * (Interview Question) Devise a dynamic programming solution for the following problem:
 * Given two strings, find the length of longest subsequence that they share in common.
 * Different between substring and subsequence:
 * Substring: the characters in a substring of S must occur contiguously in S.
 * Subsequence: the characters can be interspersed with gaps.
 * For example: Given two Strings - “regular” and “ruler”, your algorithm should output 4.
 *
 */
public class LongestSubSequence {

    static int iterativeLCS(String s1, String s2){

        int n = s1.length()+1 ;
        int m = s2.length()+1;

        int D[][] = new int[n][m]; //+1 for "" empty string; s1= row; s2=column


        for(int i=0; i < n; i++) D[i][0] = i; //initializing first row as the length of substring S1
        for(int j=0; j< m; j++) D[0][j] = j; //initializing first column as the length of substring S2

        for(int i=0; i< n; i++){
            for(int j=0; j< m; j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    D[i][j] = D[i-1][j-1] + 1;
                }else{
                    D[i][j] = Math.max(D[i-1][j]
                            ,D[i-1][j-1]);
                }
            }
        }
        return D[n][m];
    }

    public static void main(String[] args) {
        System.out.println(iterativeLCS("abc","ac"));
    }
}
