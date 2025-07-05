package com.reshma.dsa.array;

import java.util.Scanner;

public class findIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();		}
		System.out.println("enter specific element");
		int specific_element=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(specific_element==arr[i]){
				System.out.println(i);
			}
		}
	}
 
}
