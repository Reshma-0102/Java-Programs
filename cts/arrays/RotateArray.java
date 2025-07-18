package com.reshma.cts.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	System.out.println("enter the elements in array");
	int[]arr=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the position of element to rotate");
	int d=sc.nextInt();
	d=d%size;//Prints only one time the output
	for(int j=0;j<d;j++) {	
		int temp=arr[0];
		for(int i=1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		arr[size-1]=temp;
	}
	
	System.out.println(Arrays.toString(arr));
	
	}

}
