package ch01;

public class MyArray {
	private long[] arr; //未初始化时为null
	//表示有效数据的长度
	private int elements;//未初始化为0，索引值
	
	public MyArray() {
		arr = new long[50];
	}
	
	public MyArray(int maxsize) {
		arr = new long[maxsize];
	}
//	添加类方法来实现数据操作
	/**
	 * 添加数据
	 */
	public void insert(long value) {
		arr[elements] = value;
		elements++;
	}
	
	/**
	 * 显示数据
	 */
	public void display() {
		System.out.print("[");
		for(int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	/**
	 * 查找数据（根据值来查找索引）
	 */
	public int search(long value) {
		int i;
		for(i = 0; i < elements; i++) {
			if(value == arr[i]) {
				break; //找到索引，退出
			}
		}
		
		if(i == elements) {
			return -1;
		} else {
			return i;
		}
		
	}
	
	/**
	 * 查找数据，根据索引来查
	 */
//	public long get(int index) {
//		if(index >= elements || index < 0) {
//			throw new ArrayIndexOutOfBoundsException();
//		} else {
//			return arr[index];
//		}
//	}
	public long get(int index){
		if(index >=elements || index <0){
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}
	
	/**
	 * 删除数据
	 */
	public void delete(int index) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for(int i = index; i < elements; i++) {
				arr[index] = arr[index + 1];
			}
			elements--;
		}
	}
	
	/**
	 * 更新数据
	 */
	public void change(int index, int newvalue) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index] = newvalue;
		}
	}
}
