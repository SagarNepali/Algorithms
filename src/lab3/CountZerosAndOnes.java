package lab3;

import java.util.Arrays;

/**
 * You are given a length-n array A consisting of 0s and 1s,
 * arranged in sorted order. Give an Little-o(n) algorithm that counts the total number of
 * 0s and 1s in the array. Your algorithm may not make use of auxiliary storage such as
 * arrays or hashtables (more precisely, the only additional space used, beyond the given
 * array, is O(1)). Explain why your algorithm runs in Little-o(n) time.
 */

/**
 *
 * Theta(n) is not little-oh(n)
 * log(n) is little-oh(n)
 *
 */
public class CountZerosAndOnes {

    /* Return count of zero and one in a array */
    static int[] countZerosAndOnes(int [] arr){

        if(arr[arr.length-1]==0) return new int[]{arr.length,0};
        if(arr[0]==1) return new int[]{0,arr.length};

        int lower =0;
        int higher = arr.length-1;
        int countZero =0;

        while(lower < higher) {

            int mid = (lower+higher)/2;

            //if element is zero
            if(arr[mid] ==0){
                countZero += (mid-lower) +1;
                if(arr[mid+1]==1) break;
                lower = mid +1 ;
            }else{
                //if element is one
                if(arr[mid-1]==0){
                    countZero = mid;
                    break;
                }
                higher = mid-1;

            }
        }
        return new int[] {countZero, arr.length-countZero};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(CountZerosAndOnes.countZerosAndOnes(new int[]{0,0,0,0,1,1,1,1})));
        System.out.println(Arrays.toString(CountZerosAndOnes.countZerosAndOnes(new int[]{0,0,0,0,1,1,1})));
        System.out.println(Arrays.toString(CountZerosAndOnes.countZerosAndOnes(new int[]{0,1,1})));
        System.out.println(Arrays.toString(CountZerosAndOnes.countZerosAndOnes(new int[]{0,0,0,0,1})));
        System.out.println(Arrays.toString(CountZerosAndOnes.countZerosAndOnes(new int[]{0,0,0,0})));
        System.out.println(Arrays.toString(CountZerosAndOnes.countZerosAndOnes(new int[]{1,1,1,1})));
    }
}
