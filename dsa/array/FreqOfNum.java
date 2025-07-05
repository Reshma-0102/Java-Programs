package com.reshma.dsa.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FreqOfNum {

	public static void main(String[] args) {
		int arr[]= {3,8,2,8,2,4,6,9,1,0,3,7,4,8,5};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm1=new HashMap<>();
		for(int i:arr) {
			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		System.out.println(hm);
		
		//print all unique values using entrySet
		Set<Map.Entry<Integer,Integer>> set=hm.entrySet();
		Iterator<Entry<Integer, Integer>> itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry=itr.next();
			if(entry.getValue()==1){
				System.out.println(entry.getKey());
			}
		}
		
	}

}


