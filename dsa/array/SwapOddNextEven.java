package com.reshma.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapOddNextEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}int temp;
		for(int i=0;i<size;i+=2) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
