package com.reshma.cts.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClockWiseRotate {

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
		d=d%size;
		for(int j=0;j<d;j++) {
			int temp=arr[size-1];
				for(int i=size-1;i>0;i--) {
					arr[i]=arr[i-1];
		}
				arr[0]=temp;
				System.out.println(Arrays.toString(arr));
		}

	}

}
