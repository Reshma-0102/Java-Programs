package com.reshma.dsa.array;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=size-1;i>=0;--i) {
			System.out.println(arr[i]);
		}

	}

}
