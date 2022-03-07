package org.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleProgram {
public static void main(String[] args) {
	Map<Integer,String>a = new LinkedHashMap<Integer, String>();
	a.put(10, "java");
	a.put(20, "sql");
	a.put(30, "phython");
	a.put(40, "java");
	a.put(20, "selenium");
	System.out.println(a);
	int size = a.size();
	System.out.println("karun");
	System.out.println(size);
	String string = a.get(30);
	System.out.println(string);
	 a.remove(20);
	System.out.println(a);
	boolean containsKey = a.containsKey(20);
	System.out.println(containsKey);
	boolean b = a.containsValue("java");
	System.out.println(b);
	Collection<String> values = a.values();
	System.out.println(values);
	Set<Integer> keySet = a.keySet();
	System.out.println(keySet);
	Set<Entry<Integer,String>> entrySet = a.entrySet();
	System.out.println(entrySet);
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
	}
	for (Entry<Integer, String> x : entrySet) {
		System.out.println(x.getKey());
	System.out.println(x.getValue());}
	
	
	
	
	
}
}
