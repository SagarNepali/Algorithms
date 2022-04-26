package lab1;

/**
 * Given two positive integers m, n, is there a positive integer d that is a
 * factor of both m and n and that is bigger than or equal to every integer d’ that is also a factor of
 * m and n?
 * Write a Java method int gcd(int m, int n) which accepts positive integer inputs m; n and outputs
 * the greatest common divisor of m and n.
 * Examples
 * • If m = 12 and n = 42, return 6
 * • If m = 7 and n = 9, return 1
 *
 */

public class GCD {

    int gcd(int m, int n){
        int gcd = 0;
        int factor = 0;
        for(int i =1; i < ( m > n ? m : n); i++){
            if(m % i ==0 && n % i ==0){
                factor = i;
            }
            gcd = factor;
        }

        return gcd;
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println("GCD 7,9 is : "+gcd.gcd(7,9));
        System.out.println("GCD 12,42 is : "+gcd.gcd(12,42));

    }
}
