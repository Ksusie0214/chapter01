package com.javaex.ex01;

public class Ex07 {
	
	public static void main (String[] args) {
		
		
		//자동형변환
		int var00 = 3+5;
		System.out.println(var00);
		
		
		int a = 3; //3.0으로 자동 형변환되어 계산
		float b = 3.5f;
		double var02 = a+b;
		System.out.println(var02);
		
		//강제형변환
		
		float var04 = 1111.6345f;
		int var05 = (int) var04;
		System.out.println(var04);
		System.out.println(var05);
		
		//축소형변환
		
		int v01 = 10;
		byte v02 = (byte) v01;
		System.out.println(v02); //값이 변하지 않는다. 이유공부
		
		//축소 형변환 (int - -> byte)
		int v03 = 123456789;
		byte v04 = (byte) v03;
		System.out.println(v04); //값이 변하는 이유 공부
		
		//확대 형변환(byte --> int)
		byte v05 = 127;
		int v06 = (int) v05;
		System.out.println(v06); //값이 그대로 나오는 이유 공부

		
		//실수 --> 정수
		
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수
		
		int v09 = 9;
		float v10 = (float)v09;
		System.out.println(v10);
		
		double v001=5/4;
		System.out.println(v01);
		
		
		
		
		
		
		
	}

}
