package com.reshma.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class RgtShift1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int last=arr[size-1];
		for(int i=size-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		System.out.println(Arrays.toString(arr));
	}
}
