package ch09;

public class TestQuickSort {
	public static void main(String[] args) {
		long[] arr  = new long[10];
		for(int i = 0; i < 10;i++) {
			arr[i] = (long) (Math.random() * 99);
		}
		
		QuickSort.displayArr(arr);
		
		QuickSort.sort(arr, 0, arr.length - 1);
		
		QuickSort.displayArr(arr);
	}
}
