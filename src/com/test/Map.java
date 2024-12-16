package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
import java.util.Set1;
import java.util.**;

public class Map {
public static void main(String[] args) {
	HashMap<Integer, String>m1=new HashMap<Integer, String>();
	m1.put(100, "dsmnc");
	m1.put(102, "scnsn");
	m1.put(105, "cdkc");
	m1.put(105, "fedf");
	System.out.println(m1);
	System.out.println(m1.get(102));
	Set<Entry<Integer, String>> m2 = m1.entrySet();
	System.out.println(m2);
	Iterator<Entry<Integer, String>> it= m2.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
