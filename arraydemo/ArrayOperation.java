package com.arraydemo;

import java.util.Scanner;

public class ArrayOperation {
	//inserting elemnt
	public static void acceptElement(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	//display array
	
	public static void displayElement(int [] arr) {
		System.out.println("elements in array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	//MAX element
		public static int Max(int []arr) {
			int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
		//SUM 
		public static int Sum(int []arr) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			return sum;
		}
		//AVG
		public static float Avg(int []arr) {
			float avg=(Sum(arr)/arr.length);
			return avg;
		}
		//sort
		public static void Sort(int []arr) {
			int temp;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			
		}
}
