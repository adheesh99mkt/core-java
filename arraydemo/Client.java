package com.arraydemo;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("\n\nenter the operation: \n1.accept elements\n2.display elements"
					+ "\n3.max element\n4.sum of elements\n5.average of elements\n6.sort array\n");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				ArrayOperation.acceptElement(arr);
				break;
			case 2:
				ArrayOperation.displayElement(arr);
				break;
			case 3:
				int max=ArrayOperation.Max(arr);
				System.out.println("Max="+max);
				break;
			case 4:
				int sum=ArrayOperation.Sum(arr);
				System.out.println("Sum="+sum);
				break;
			case 5:
				float avg=ArrayOperation.Avg(arr);
				System.out.println("Average="+avg);
				break;
			case 6:
				ArrayOperation.Sort(arr);
				ArrayOperation.displayElement(arr);
				break;
				default:
					System.out.println("invalid operation..exited");
					return;
			}
		}
		
	}
	
}
