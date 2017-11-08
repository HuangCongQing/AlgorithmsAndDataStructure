package ch08;

import ch02.InsertSort;

public class TestShellSort {
	public static void main(String[] args) {
		long[] arr = new long[10];
		arr[0] = 90;
		arr[1] = 12;
		arr[2] = 23;
		arr[3] = 15;
		arr[4] = -4;
		arr[5] = 1;
		arr[6] = 97;
		arr[7] = 4;
		arr[8] = 3;
		arr[9] = 8;
		
		System.out.print("[");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.print("]");
		System.out.println();
		
		ShellSort.sort(arr);
		
		System.out.print("[");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.print("]");
		System.out.println();
		
	}
}
