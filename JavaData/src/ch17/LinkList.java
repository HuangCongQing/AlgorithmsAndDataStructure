package ch17;
/*
 * 链表，相当于火车
 */
public class LinkList {
	//头结点
	private Node first;
	
	public LinkList() {
		first = null;
	}
	
	/**
	 * 插入一个结点，在头结点后进行插入
	 */
	public void insertFirst(Info info) {
		Node node = new Node(info);
		node.next = first;
		first = node;
	}
	
	/**
	 * 删除一个结点，在头结点后进行删除
	 */
	public Node deleteFirst() {
		Node tmp = first;
		first = tmp.next;
		return tmp;
	}
	
	
	/**
	 * 查找方法
	 */
	public Node find(String key) {
		Node current = first;
		while(!key.equals(current.info.getKey())) {
			if(current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	/**
	 * 删除方法，根据数据域来进行删除
	 */
	public Node delete(String key) {
		Node current = first;
		Node previous = first;
		while(!key.equals(current.info.getKey())) {
			if(current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
		}
		
		if(current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;
		
	}
}
