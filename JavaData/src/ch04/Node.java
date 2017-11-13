package ch04;
/*
 * 链结点，相当于是车厢
 */
public class Node {
	//数据域
	public long data;
	//指针域
	public Node next;
	
	public Node(long value) {
		this.data = value;
	}
	
	/**
	 * 显示方法
	 */
	public void display() {
		System.out.print(data + " ");
	}
}
