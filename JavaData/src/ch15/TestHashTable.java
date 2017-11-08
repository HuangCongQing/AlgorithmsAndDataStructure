package ch15;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.insert(new Info("a","张三"));
		ht.insert(new Info("ct","李四"));
		ht.insert(new Info("wangwu","王五"));
		
		System.out.println(ht.find("a").getName());
		System.out.println(ht.find("ct").getName());
	}
}
