package lab6;

/**
 * The Fibonacci numbers are defined in the following way:
 * F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)
 *
 */
public class Fibonacci {

    static int table[] = null;

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

    /** Theta(n) is O(n) but O(n) mmay not be Theta(n) **/
    /* Theta(n) */
    static int fib(int n){
        int [] store = new int[n+1];
        store[0] = 0;
        store[1] =1;
        for(int i=2;i<=n;i++){
            store[i] = store[i-1] + store[i-2];
        }
        return store[n];
    }

    /** though its recursive, we are making too many redundant calls **/
    static int recursiveFibonacci(int n){
        System.out.println("N:"+n); //redundant calls to same number
        if(n==1 || n==0){
            return n;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    static int dpFib(int n){
        if(n<0) return -1;
        table = new int[n+1];
        for(int i=0; i < table.length; i++){
            table[i] = -1;
        }
        return recursiveDpFib(n);
    }

    /* O(n+1) or O(n) because there are n self calls,
    * each self-call tries to compute F_1 for some i < n   */
    private static int recursiveDpFib(int n) {
        if(table[n]==-1){
            System.out.println("DP N: "+n);
            if(n==0 || n== 1) {
                table[n] = n;
                return table[n];
            }
            table[n] = recursiveDpFib(n-1) + recursiveDpFib(n-2);
        }
        return table[n];
    }

    public static void main(String[] args) {

//        System.out.println("Fib of 9th term: "+fibonacci(9));
        System.out.println("Fib of 9th term (Recursion): "+recursiveFibonacci(9));
        System.out.println("Fib of 9th term (Teachers): "+fib(9));
        System.out.println("Fib of 9th term (Dynamic Programming: "+dpFib(9));
    }
}
