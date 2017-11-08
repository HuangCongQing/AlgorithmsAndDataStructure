package ch08;
/*
 * 希尔排序
 */
public class ShellSort {
	/**
	 * 排序方法
	 */
	public static void sort(long[] arr) {
		//初始化一个间隔
		int h = 1;
		//计算最大间隔
		while(h < arr.length / 3) {
			h = h * 3 + 1;
		}
		
		while(h > 0) {
			//进行插入排序
			long tmp = 0;
			for(int i = h; i < arr.length; i++) {
				tmp = arr[i];
				int j = i;
				while(j > h - 1 && arr[j - h] >= tmp) {
					arr[j] = arr[j - h];
					j -= h;
				}
				arr[j] = tmp;
			}
			//减小间隔
			h = (h - 1) / 3;
		}
	}
}
