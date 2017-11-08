package ch17;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.insert(new Info("a","张三"));
		ht.insert(new Info("ct","李四"));
		ht.insert(new Info("b","王五"));
		ht.insert(new Info("dt","赵柳"));
		
		System.out.println(ht.find("a").getName());
		System.out.println(ht.find("ct").getName());
		System.out.println(ht.find("b").getName());
		System.out.println(ht.find("dt").getName());
		
//		System.out.println(ht.hashCode("a"));
//		System.out.println(ht.hashCode("ct"));
		
		System.out.println(ht.delete("a").getName());
		System.out.println(ht.find("a").getName());

	}
}
