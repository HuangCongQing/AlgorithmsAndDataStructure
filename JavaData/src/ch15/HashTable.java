package ch15;

import java.math.BigInteger;

public class HashTable {
	private Info[] arr;
	
	/**
	 * 默认的构造方法
	 */
	public HashTable() {
		arr = new Info[100];
	}
	
	/**
	 * 指定数组初始化大小
	 */
	public HashTable(int maxSize) {
		arr = new Info[maxSize];
	}
	
	/**
	 * 插入数据
	 */
	public void insert(Info info) {
		arr[hashCode(info.getKey())] = info;
	}
	
	/**
	 * 查找数据
	 */
	public Info find(String key) {
		return arr[hashCode(key)];
	}
	
	public int hashCode(String key) {
//		int hashVal = 0;
//		for(int i = key.length() - 1; i >= 0; i--) {
//			int letter = key.charAt(i) - 96;
//			hashVal += letter;
//		}
//		return hashVal;
		
		BigInteger hashVal = new BigInteger("0");
		BigInteger pow27 = new BigInteger("1");
		for(int i = key.length() - 1; i >= 0; i--) {
			int letter = key.charAt(i) - 96;
			BigInteger letterB = new BigInteger(String.valueOf(letter));
			hashVal = hashVal.add(letterB.multiply(pow27));
			pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
		}
		return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();
	}
}
