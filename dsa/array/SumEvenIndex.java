package com.reshma.dsa.array;

import java.util.Scanner;

public class SumEvenIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int sum=0;
		int count=0;
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(i%2==0) {
				sum+=arr[i];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/count);
		
	

	}

}
