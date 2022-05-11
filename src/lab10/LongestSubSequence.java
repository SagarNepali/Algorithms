package lab10;

/**
 * (Interview Question) Devise a dynamic programming solution for the following problem:
 * Given two strings, find the length of longest subsequence that they share in common.
 * Different between substring and subsequence:
 * Substring: the characters in a substring of S must occur contiguously in S.
 * Subsequence: the characters can be interspersed with gaps.
 * For example: Given two Strings - “regular” and “ruler”, your algorithm should output 4.
 * https://leetcode.com/problems/longest-common-subsequence/discuss/351689/JavaPython-3-Two-DP-codes-of-O(mn)-and-O(min(m-n))-spaces-w-picture-and-analysis
 */
public class LongestSubSequence {

    static int D[][] = null;

    static int iterativeLCS(String s1, String s2){

        int n = s1.length() ;
        int m = s2.length();


        int D[][] = new int[n+1][m+1]; //+1 for "" empty string; s1= row; s2=column

        for(int i=1; i<= n; i++){
            for(int j=1; j<=m; j++){
                 if(s1.charAt(n-i) == s2.charAt(m-j)){ //checking character from last
                    D[i][j]= D[i-1][j-1] + 1;
                }else{
                    D[i][j] = Math.max(D[i][j-1]
                            ,D[i-1][j]);
                }
            }
        }
        return D[n][m];
    }

    static int lcs(String s1, String s2){

        if(s1.length()==0 || s2.length()==0) return 0;

        D = new int[s1.length()+1][s2.length()+1];
        return recursiveLCS(s1,s2);
    }

    static int recursiveLCS(String s1, String s2){

        int n = s1.length();
        int m = s2.length();

        if(n==0 || m==0) return 0;

        else if(s1.charAt(n-1) == s2.charAt(m-1)) {
            D[n][m] = recursiveLCS(s1.substring(0,n-1), s2.substring(0,m-1)) +1;
        }else{
            D[n][m] = Math.max(
                    recursiveLCS(s1.substring(0,n-1),s2),
                    recursiveLCS(s1, s2.substring(0,m-1))
            );
        }
        return D[n][m];
    }


    public static void main(String[] args) {
        System.out.println("LCS of abc and ac is : "+iterativeLCS("abc","ac"));
        System.out.println("LCS of abc and ac is : "+iterativeLCS("regular","ruler"));

        System.out.println("Recursive LCS of abc and ac is : "+lcs("abc","ac"));
        System.out.println("Recursive LCS of regular and ac ruler : "+lcs("regular","ruler"));
    }
}
