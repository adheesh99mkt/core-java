package com.matrixdemo;

public class MatrixUtility {
	//addition
	
	public static void matrixAddition(int row,int col,int [][]m1,int [][]m2){
		int [][]res=new int[3][3];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=m1[i][j]+m2[i][j];
			}
		}
		
	}
	
	//substraction
	public static void matrixSub(int row,int col,int [][]m1,int [][]m2){
		int [][]res=new int[3][3];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=m1[i][j]-m2[i][j];
			}
		}
		
	}
	//Multiplication
	public static void matrixMult(int row,int col,int [][]m1,int [][]m2){
		int [][]res=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=0;
				for(int k=0;k<row;k++) {
					res[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
	}
	public static void matrixTrans(int row,int col,int [][]m1){
		int [][]res=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=m1[j][i];
			}
		}
		
	}
}
