package com.reshma.dsa.array;

import java.util.Scanner;

public class MinEvenIndexed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}int min=arr[0];
		for(int i=0;i<size;i++) {
			if(i%2==0&&min>arr[i]) {
				min=arr[i];
				
			}
		}
		System.out.println(min);
		

	}

}
