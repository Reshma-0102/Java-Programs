package com.reshma.dsa.array;

import java.util.Scanner;

public class Min2OfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int arr[]=new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			}
		int min=arr[0];
		int min2= min;
		for(int i=0;i<size;i++) {
			if(min>arr[i]) {
				min2=min;
				min=arr[i];
			}
			else if(min<arr[i]&& min2>arr[i]) {
				min2=arr[i];
			}
		}
		
		System.out.println(min2);
		
		

	}

}
