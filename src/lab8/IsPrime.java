package lab8;

public class IsPrime {

    static boolean checkPrime(int n){
        boolean flag = false;
        for(int i =2 ; i<= n/2; i++){
            if(n % i == 0){
                flag = true;
                break;
            }
        }
        return !flag;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(4));
        System.out.println(checkPrime(14));
    }
}
