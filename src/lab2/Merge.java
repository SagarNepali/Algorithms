package lab2;

import java.util.Arrays;

/**
 * Consider the following problem: As input you are given two sorted arrays of integers.
 * Your objective is to design an algorithm that would merge the two arrays together to
 * form a new sorted array that contains all the integers contained in the two arrays. For
 * example, on input
 * [1, 4, 5, 8, 17], [2, 4, 8, 11, 13, 21, 23, 25]
 * the algorithm would output the following array:
 * [1,2,4,4,5,8,8, 11, 13, 17, 21, 23, 25]
 *
 */
public class Merge {

    static int [] merge(int [] arr1, int [] arr2){
        int size = arr1.length + arr2.length;

        int [] newArr = new int[size];
        int arr1Counter = 0, arr2Counter=0, i=0;

        while(arr1Counter < arr1.length && arr2Counter < arr2.length){
            if(arr1[arr1Counter] < arr2[arr2Counter]){
                newArr[i++] = arr1[arr1Counter];
                arr1Counter++;
            }else{
                    newArr[i++] = arr2[arr2Counter];
                    arr2Counter++;
            }
        }

        while(arr1Counter < arr1.length){
            newArr[i++] = arr1[arr1Counter++];
        }

        while(arr2Counter < arr2.length){
            newArr[i++] = arr2[arr2Counter++];
        }

        return newArr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Merge.merge(new int []{1,5,6,9}, new int [] {2,4,7,10})));

        System.out.println(Arrays.toString(Merge.merge(new int []{1,4,6,9,12}, new int [] {1,4,6,9,10})));
        System.out.println(Arrays.toString(Merge.merge(new int []{1,1,3,3,5,5,6,6,8,8}, new int [] {1,2,3,4,7,9,9,10})));
    }
}

