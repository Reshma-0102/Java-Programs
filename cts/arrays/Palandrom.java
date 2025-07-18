package com.reshma.cts.arrays;

import java.util.Scanner;

public class Palandrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter elements");
		int[]arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		boolean isPalandrom=true;
		for(int i=0;i<size/2;i++) {
			if(arr[i]!=arr[size-1-i]) {
				isPalandrom=false;
				break;
			}	
		}
		if(isPalandrom) {
			System.out.println("Its palandrom");
		}
		else {
			System.out.println("Not a palandrom");
		}
	}

}
