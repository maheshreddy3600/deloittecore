package utils;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
	
		TreeSet<String> items = new TreeSet<>();
		items.add("xyz");
		items.add("abc");
		items.add("abc");
		items.add("deloitte");
		items.add("hello");
		items.add("oracle");
		items.add("helio");
		System.out.println(items);
	}

}
