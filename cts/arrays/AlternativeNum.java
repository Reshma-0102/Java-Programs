package com.reshma.cts.arrays;

import java.util.Scanner;

public class AlternativeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter elements");
		int []arr =new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i+=2) {
			System.out.println(arr[i]);
		}
	}

}
