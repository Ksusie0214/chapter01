package com.javaex.ex05;

public class Ex07 {
	public static void main(String[] args) {
		//A배열 선언
		int[] arrA = new int[3];
		//값 대입
		arrA[0]= 3;
		arrA[1]= 6;
		arrA[2]= 9;
		
		//B배열 선언
		int[] arrB = new int[3];
		
		for(int i = 0; i< arrA.length; i++) {
			arrA[i] = arrB[i];
		}
	
		
	}

}
