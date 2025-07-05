package com.reshma.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class RgtShift2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();		}
		int last1=arr[size-1];
		int last2=arr[size-2];
		for(int i=size-1;i>=2;i--) {
			arr[i]=arr[i-2];
		}
		arr[0]=last1;
		arr[1]=last2;
		System.out.println(Arrays.toString(arr));
	}

	
}
