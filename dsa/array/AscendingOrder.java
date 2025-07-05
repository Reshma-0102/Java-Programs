package com.reshma.dsa.array;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		boolean isSorted=true;
		for(int i=0;i<size-1;i++) {
		if(arr[i]>arr[i+1]) {
			isSorted=false;
			break;
			
		}
		}
		if(isSorted) {
			System.out.println("array sorted");
		}
		else {
			System.out.println("array not sorted");
			for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				}
			}
			for(int i=0;i<size;i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
