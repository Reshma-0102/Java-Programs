package com.reshma.cts.arrays;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int []arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
