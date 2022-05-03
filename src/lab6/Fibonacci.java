package lab6;

/**
 * The Fibonacci numbers are defined in the following way:
 * F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)
 *
 */
public class Fibonacci {

    static int fibonacci(int n){
        int a =0, b=1, c;
        if(n==0) return a;

        for(int i=2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static int recursiveFibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    public static void main(String[] args) {

        System.out.println("Fib of 9th term: "+fibonacci(9));
        System.out.println("Fib of 9th term (Recursion): "+recursiveFibonacci(9));
    }
}
