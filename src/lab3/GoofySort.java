package lab3;

import java.util.*;

public class GoofySort {

    static int[] sort(int []arr){
        if(isSorted(arr)) return arr;
        int []newArr = Arrays.copyOf(arr,arr.length);
        Set indexes = new HashSet();
        Random rand = new Random();

        while(indexes.size()!=newArr.length){

            int random = rand.nextInt(newArr.length);
            int index = 0;

            if(!indexes.contains(random)) {
                int temp = newArr[index];
                int randomData = arr[random];
                newArr[index] = randomData;
                newArr[random] = temp;
                indexes.add(random);
                index++;
            }
            if(index==indexes.size()) break;
        }

        return sort(newArr);
    }

    static boolean isSorted(int []arr){
        for(int i =0; i< arr.length-1; i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Array: "+Arrays.toString((new int[]{2,1}))+" GOOFY SORT: "+Arrays.toString(GoofySort.sort(new int[]{2,1})));
        System.out.println("Array: "+Arrays.toString((new int[]{11,2,13,9,10,8}))+" GOOFY SORT: "+Arrays.toString(GoofySort.sort(new int[]{11,2,13,9,10,8})));
        System.out.println("Array: "+Arrays.toString((new int[]{11,10,9,8,7,6}))+" GOOFY SORT: "+Arrays.toString(GoofySort.sort(new int[]{11,10,9,8,7,6})));
        //        System.out.println("Array: "+Arrays.toString((new int[]{11,10,9,8,7,6,5,4,3,2,1}))+" GOOFY SORT: "+Arrays.toString(GoofySort.sort(new int[]{11,10,9,8,7,6,5,4,3,2,1})));

    }
}
