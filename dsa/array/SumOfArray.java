package com.reshma.dsa.array;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
		
		
	}

}
