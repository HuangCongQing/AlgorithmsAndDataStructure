package ch02;

public class TestSort {
	public static void main(String[] args) {
		long[] arr = new long[5];
		arr[0] = 34;
		arr[1] = 23;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = -4;
		
		System.out.print("[");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.print("]");
		System.out.println();
		// 冒泡拍序，选择排序，插入排序
		BubbleSort.sort(arr);
//		InsertSort.sort(arr);
//		SelectionSort.sort(arr);

		System.out.print("排序后：\n");
		System.out.print("[");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.print("]");
		System.out.println();
		
	}
}
