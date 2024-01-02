package com.javaex.ex05;

public class Ex08 {
	public static void main(String[] args) {
		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30,};
		
		//방갯수 비교
		if(leftArray.length == rightArray.length){
			//방의 갯수가 같으면
			//세부검사
			for(int i=0; i<leftArray.length; i++) {
			if(leftArray[i] != rightArray[i]) { //같은 방의 값이 다르면
				System.out.println(i+"번째 값이 다릅니다.");
				}
			}
		}else {
			//방의 갯수가 다르면
			System.out.println("두 배열의 크기가 다릅니다.");
		}
		
		
		
		
		
		
		
		
		
		
		/*
		if(leftArray!=rightArray) {
			if(leftArray[0]!=rightArray[0]) {
				System.out.println("0번째 값이 다릅니다.");
			}
			if(leftArray[1]!=rightArray[1]) {
				System.out.println("1번째 값이 다릅니다.");
			}
			if(leftArray[2]!=rightArray[2]) {
				System.out.println("2번째 값이 다릅니다.");
			}
			
		}
		else if(leftArray.length!=rightArray.length) {
				System.out.println("두 배열의 크기가 다릅니다.");
			}
		*/
		
		
		
	}

}
