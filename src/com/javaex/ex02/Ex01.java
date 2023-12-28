package com.javaex.ex02;

public class Ex01 {
	
	public static void main (String[] args) {
		
		int i = 12345;
		double d = 3.14;
		char c = '한';
		String hello = "안녕하세요";
		String name = "김수빈";
		String str = "안녕하세요";
		
		System.out.println(i);
		
		System.out.println("안녕하세요");
		
		System.out.println(str);
		System.out.println("안녕하세요");
		
		
		System.out.print("안녕하세요");
		System.out.println("안녕하세요");
		
		System.out.println(hello+hello); //헬로(줍바꿈) hello
		System.out.print(name+hello+hello); //이름 안녕하세요
		
		System.out.println(i+i);
		System.out.println(d+d);
		System.out.println(d+i);
		
		System.out.println(c+c); //캐릭터형을 더하면 숫자로 판단하여 숫자로 출력
		
		System.out.println(name+i); //글자가 추가된 경우 더하기는 뒤에 붙이는 역할을 한다
		
		System.out.println("-------------------------------");
		
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		
		
		
	}

}
