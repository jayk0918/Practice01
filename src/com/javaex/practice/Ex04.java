package com.javaex.practice;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// 문제 Ex01 ~ Ex04 공통 문제점 : main method에 오타 존재.
		// String[] agrgs로 표기되어 있으므로 전부 String[] args로 수정요망
		
		int x,y; // 변수 선언 시 ; 누락
		
		x = 10; // 초기화 과정
		y = 20;
		int sum = x+y; // sum 자료형 누락
		
		System.out.println("합은" + sum); //"합은', 큰 따옴표 통일 요망
		
		
		
	}
	
}
