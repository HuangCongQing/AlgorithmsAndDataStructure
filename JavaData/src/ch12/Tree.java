package ch12;
/*
 * 二叉树类
 */
public class Tree {
	//根节点
	public Node root;
	
	/**
	 * 插入节点
	 * @param value
	 */
	public void insert(long value,String sValue) {
		//封装节点
		Node newNode = new Node(value,sValue);
		//引用当前节点
		Node current = root;
		//引用父节点
		Node parent;
		//如果root为null，也就是第一插入的时候
		if(root == null) {
			root = newNode;
			return;
		} else {
			while(true) {
				//父节点指向当前节点
				parent = current;
				//如果当前指向的节点数据比插入的要大,则向左走
				if(current.data > value) {
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	/**
	 * 查找节点
	 * @param value
	 */
	public Node find(long value) {
		//引用当前节点，从根节点开始
		Node current = root;
		//循环，只要查找值不等于当前节点的数据项
		while(current.data != value) {
			//进行比较，比较查找值和当前节点的大小
			if(current.data > value) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			//如果查找不到
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	
	/**
	 * 删除节点
	 * @param value
	 */
	public void delte(long value) {
		
	}
	
	/**
	 * 前序遍历
	 */
	public void frontOrder(Node localNode) {
		if(localNode != null) {
			//访问根节点
			System.out.println(localNode.data + ", " + localNode.sData);
			//前序遍历左子树
			frontOrder(localNode.leftChild);
			//前序遍历右子树
			frontOrder(localNode.rightChild);
		}
	}
	
	/**
	 * 中序遍历
	 */
	public void inOrder(Node localNode) {
		if(localNode != null) {
			//中序遍历左子树
			inOrder(localNode.leftChild);
			//访问根节点
			System.out.println(localNode.data + ", " + localNode.sData);
			//中旬遍历右子树
			inOrder(localNode.rightChild);
		}
	}
	
	/**
	 * 后序遍历
	 */
	public void afterOrder(Node localNode) {
		if(localNode != null) {
			//后序遍历左子树
			afterOrder(localNode.leftChild);
			//后序遍历右子树
			afterOrder(localNode.rightChild);
			//访问根节点
			System.out.println(localNode.data + ", " + localNode.sData);
		}
	}
}
