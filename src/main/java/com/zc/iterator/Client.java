package com.zc.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		
		ProductList productList = new ProductList(list);
		AbstractIterator iterator = productList.Iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
//		System.out.println(iterator.next());
//		Iterator iterator2 = list.iterator();
//		while(iterator2.hasNext()){
//			System.out.println(iterator2.next());
//		}
//		System.out.println(iterator2.next());
	}
}
