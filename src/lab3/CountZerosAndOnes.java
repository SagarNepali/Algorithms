package lab3;

import java.util.Arrays;

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
