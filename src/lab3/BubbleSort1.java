package lab3;

import SortingEnv.runtime.Sorter;

import java.util.Arrays;

/**
 * This is the slowest version of BubbleSort
 * No optimization for already sorted arrays.
 * Doesn't take into account the fact that
 * largest elements are pushed to the right.
 *
 */
public class BubbleSort1 extends Sorter {
	
	int[] arr;
	public int[] sort(int[] array){
		this.arr = array;
		bubbleSort();
		return arr;
		
	}
	private void bubbleSort(){
		
		int len = arr.length;
		boolean flag=true;

		// idea is to return the array if there is no swap.. no swap means the data is in order
		while(flag){
			flag=false;

			for(int j = 0; j < len-1; ++j) {
				if(arr[j]> arr[j+1]){
					swap(j,j+1);
					flag=true;
				}
			}
		}
	}
	
	int[] swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
		
	}
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		BubbleSort1 bs = new BubbleSort1();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		System.out.println(Arrays.toString(bs.sort(new int[]{55,44,33,22,11,10,-1})));
		System.out.println(Arrays.toString(bs.sort(new int[]{-1,10,20,30,40,50,60,444})));
		
	}

}
