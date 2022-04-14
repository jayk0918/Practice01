package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {

		// 문제 Ex01 ~ Ex04 공통 문제점 : main method에 오타 존재.
		// String[] agrgs로 표기되어 있으므로 전부 String[] args로 수정요망
		
		int x = 1;
		int y = 1;
		
		int a = ++x * 2;
		int b = y++ * 2;
		
		/* 	예상 1. "a=" + a
		  	-> ++x로 x는 +1되어 2*2로 연산될 것, 4가 나올것임
		  	-> 8
		  	
			예상 2. "b=" + b
		  	-> y++은 y값이 1에서 2로 증가하였으나 연산에 반영되지는 않을 것.
		  	-> 따라서 y는 현재값인 1이 출력되어 b = 1*2 = 2가 나올것임
		  	
			예상 3. "x=" + x / "y=" + y
		  	-> 1, 2라는 일련의 연산을 통해 x는 2, y는 예상 2. 과정을 통해 예상 2.의 출력과 별개로 +1이 되어 2 나올것임
		  	
		  	번외. 순간 ""속에 a= 를 변수로 착각하는 삽질이 있었음
		*/
		
		System.out.println("a="+ a); // 4
		System.out.println("b="+ b); // 2
		System.out.println("x="+ x); // 2
		System.out.println("y="+ y); // 2
		
	}
	
}
