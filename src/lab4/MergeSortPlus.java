package lab4;

import SortingEnv.runtime.Sorter;

public class MergeSortPlus extends Sorter {
    final int ARRAY_SIZE = 33;
    final int MAX_VAL = 1000;
    int[] theArray;


    //public sorter
    public int[] sort(int[] input){
        int n = input.length;
        int[] tempStorage = new int[n];
        theArray = input;
        mergeSortPlus(tempStorage,0,n-1,20);
        return theArray;
    }

    void mergeSortPlus(int[] tempStorage, int lower, int upper,int insertionSortLimit) {
        if(lower==upper){
            return;
        }else if((upper-lower)<=insertionSortLimit){
            insertionSort(tempStorage,lower,upper);
            return;
        }else {
            int mid = (lower+upper)/2;
            mergeSortPlus(tempStorage,lower,mid,insertionSortLimit);  //sort left half
            mergeSortPlus(tempStorage,mid+1, upper,insertionSortLimit); //sort right half
            merge(tempStorage,lower,mid+1,upper); //merge them
        }
    }

    private void insertionSort(int []anArray,int lower,int upper){
        int temp = 0;
        int j = 0;
        for(int i = lower+1; i <=upper; ++i) {
            temp = anArray[i];
            j=i;
            while(j>0 && temp < anArray[j-1]){
                anArray[j] = anArray[j-1];
                j--;
            }
            anArray[j]=temp;
        }
    }

    /** Merges the ranges [lower, mid] and [midPlusOne,upper] in place */
    private void merge(int[] tempStorage, int lower, int midPlusOne, int upper) {
        int pos = 0; //tempStorage index
        int i = lower;
        int j = midPlusOne;
        int n = upper - lower + 1; //total number of elements to rearrange

        //view the range [lower,upper] as two arrays
        //[lower, mid], [midPlusOne,upper] to be merged

        while(i < midPlusOne && j <= upper){
            if(theArray[i] <= theArray[j])
                tempStorage[pos++] = theArray[i++];
            else
                tempStorage[pos++] = theArray[j++];

        }
        while(i < midPlusOne) {
            tempStorage[pos++] = theArray[i++];
        }
        while(j <= upper){
            tempStorage[pos++] = theArray[j++];
        }
        //replace the range [lower,upper] in theArray with
        //the range [0,n-1] just created in tempStorage
        for(j=0; j<n; ++j) {
            theArray[lower+j] = tempStorage[j];
        }

    }

    //set up routines
    public static void main(String[] args){
        MergeSortPlus ms = new MergeSortPlus();
        //ms.testMerge();
        int[] arr = {1,4,2,5,6,1,7,9,0};
        int[] returnArr = ms.sort(arr);
        for (int i : returnArr) {
            System.out.print(i + " ");
        }
    }


}

