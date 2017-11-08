package ch01;

public class TestMyArray {
	public static void main(String[] args) {
//		MyArray arr = new MyArray();
//		arr.insert(13);
//		arr.insert(34);
//		arr.insert(90);
//		
//		arr.display();
//		System.out.println(arr.search(190));
//		
//		System.out.println(arr.get(1));
//		
//		arr.change(0, 12);
//		arr.display();
		MyOrderArray arr = new MyOrderArray();
		arr.insert(90);
		arr.insert(30);
		arr.insert(80);
		arr.insert(10);
		arr.display();
		
		System.out.println(arr.binarySearch(10));
	}
}
