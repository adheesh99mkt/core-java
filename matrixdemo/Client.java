package com.matrixdemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the row and col number:");
		int row=in.nextInt();
		int col=in.nextInt();
		int [][]matrix1=new int[row][col];
		int [][]matrix2=new int[row][col];
		
		System.out.println("Enter the elements in matrix1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix1[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the elements in matrix2");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix2[i][j]=in.nextInt();
			}
		}
		
		MatrixUtility obj=new MatrixUtility();
		int [][]add=obj.matrixAddition(row, col, matrix1, matrix2);
		int [][]sub=obj.matrixSub(row, col, matrix1, matrix2);
		int [][]mul=obj.matrixMult(row, col, matrix1, matrix2);
		int [][]trans=obj.matrixTrans(row, col, matrix1);
		
		System.out.println("Addition:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Substraction:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
