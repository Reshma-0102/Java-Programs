package com.reshma.cts.arrays;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter element");
		int[]arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int Secmax=max;
		for(int i=0;i<size;i++) {
			if(max<arr[i]) {
				Secmax=max;
				max=arr[i];
			}
			else if(max > arr[i] && Secmax<arr[i]);{
				Secmax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(Secmax);

	}

}
