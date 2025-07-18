package com.reshma.cts.arrays;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter array element");
		int[]arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<size;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
