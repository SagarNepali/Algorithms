package lab1;

/**
 *
 * This method returns the second smallest element of the input array.
 * Examples
 * • If input is [1, 4, 2, 3], return 2.
 * • If input is [3, 3, 4, 7], return 3. (Smallest is 3, and second smallest is 3.)
 * • If input is [9], your program will throw an exception
 *
 */
public class SecondSmallest {

    public static int secondSmallest(int [] arr){
        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("Input array too small");
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i= 0; i<arr.length;i++){
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];

            }else if( arr[i] < secondMin ){
                secondMin = arr[i];
            }
        }

        return secondMin;
    }

    public static void main(String[] args) {
        System.out.println(SecondSmallest.secondSmallest(new int[]{1,4,2,3})); //2
        System.out.println(SecondSmallest.secondSmallest(new int[]{3,3,4,7})); //3
        System.out.println(SecondSmallest.secondSmallest(new int[]{9})); //exception
    }
}
