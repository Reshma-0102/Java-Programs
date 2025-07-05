package com.reshma.dsa.array;

import java.util.Scanner;

public class SumFirstHalf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size =sc.nextInt();
		int sum=0;
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size/2;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
