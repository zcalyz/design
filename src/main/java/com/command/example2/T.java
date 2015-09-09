package com.command.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class T {
	public static void main(String[] args) {
		InsertCommand c1 = new InsertCommand();
		InsertCommand c2 = new InsertCommand();
		ArrayList<Command> list = new ArrayList<Command>();	
		
		list.add(c1);
		list.add(c2);
		list.add(c1);
		System.out.println(list.size());
		for(Command c : list)
			System.out.println(c);
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "1");
		hashMap.put(2, "2");
		hashMap.put(3, "3");
		hashMap.put(4, "4");
		System.out.println(hashMap);
		hashMap.get(1);
		
		HashSet hashSet = new HashSet();
		hashSet.add(c1);
		hashSet.add(c2);
		hashSet.add(c1);
		
		Iterator hi = hashSet.iterator();
		while(hi.hasNext()){
			System.out.println(hi.next());
		}
		System.out.println(hashSet.size());
		
	}
}
