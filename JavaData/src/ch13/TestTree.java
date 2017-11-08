package ch13;

public class TestTree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10,"James");
		tree.insert(20,"YAO");
		tree.insert(15,"Kobi");
		tree.insert(3,"Mac");
		tree.insert(4, "Zhangsan");
		tree.insert(90, "Lisi");
		
//		System.out.println(tree.root.data);
//		System.out.println(tree.root.rightChild.data);
//		System.out.println(tree.root.rightChild.leftChild.data);
//		System.out.println(tree.root.leftChild.data);
//		
//		Node node = tree.find(3);
//		System.out.println(node.data + ", " + node.sData);
		
//		tree.frontOrder(tree.root);
		
//		tree.inOrder(tree.root);
//		tree.afterOrder(tree.root);
		tree.delete(90);
		tree.inOrder(tree.root);
	}
}
