package com.javaex.practice;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 문제 Ex01 ~ Ex04 공통 문제점 : main method에 오타 존재.
		// String[] agrgs로 표기되어 있으므로 전부 String[] args로 수정요망		
		
		/* 	예상 1. (12 / 5 - 3)
			-> 기본 정수형 int 적용, 12/5 = (2.4)에서 0.4 누락, 2 - 3 = -1로 연산될 것.
			예상 2. (5 + 19 % 3)
			-> 기본 정수형 int 적용, 19 % 3 = 몫 6 / 나머지 1에서 1 출력, 5 + 1 = 6으로 연산될 것. */
		
		System.out.println(12/5-3);
		System.out.println(5 + 19 % 3);
		
		
		
	}

}
