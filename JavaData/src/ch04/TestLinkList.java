package ch04;

public class TestLinkList {
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insertFirst(34);
		linkList.insertFirst(23);
		linkList.insertFirst(12);
		linkList.insertFirst(0);
		linkList.insertFirst(-1);
		
//		linkList.display();
//		
//		linkList.deleteFirst();
//		linkList.display();
//		
//		Node node = linkList.find(23);
//		node.display();
		
		Node node1 = linkList.delete(0);
		node1.display();
		System.out.println();
		linkList.display();
	}
}
