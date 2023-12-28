package com.javaex.ex01;

public class Ex13 {
	
	public static void main (String [] args) {
		//논리 연산자
		//&& and연산자
		System.out.println(true && true);  //t
		System.out.println(true && false); //f
		System.out.println(false && true );//f
		System.out.println(false && false);//f
		
		System.out.println("-----------------------");
		
		
		//|| or 연산자
		System.out.println(true || true);  //t
		System.out.println(false || false);//f
		System.out.println(true || false); //t
		System.out.println(false || true); //t
		
		System.out.println("-----------------------------");
		
		//응용
		int a = 5;
		int b = 7;
		
		System.out.println( (a>b)&&(a<b) );      //f&&t f
		System.out.println((a>b)&&(a>b));        //f&&f f
		System.out.println((a>b)||(a<b));        //f||t t
		System.out.println((a>b)&&(a<b)||(a<b)); //f&&t||t t
		System.out.println((a>b)||(a<b)||(a<b)); //f||t||t t
		
		System.out.println("----------------------------------");
		
		System.out.println( !(a<b) ); //!t = f
		System.out.println( !(a>b) ); //!f = t
		
		System.out.println("-------------------------------");
		
		
		
		
	}

}
