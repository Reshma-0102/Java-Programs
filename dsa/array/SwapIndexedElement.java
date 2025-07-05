package com.reshma.dsa.array;

import java.util.Scanner;

public class SwapIndexedElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int temp;
		System.out.println("enter element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the 1st Index");
		int Index1=sc.nextInt();
		System.out.println("enter the 2nd Index");
		int Index2=sc.nextInt();
		int num1=0,num2=0;
		for(int i=0;i<size;i++) {
			if(Index1<0||Index1>=size) {
				System.out.println(i);
			}
			else if(Index2<0||Index2>=size) {
				System.out.println(i);
			}
		}
		temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;

		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
