package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14; // 파이값 3.14 상수지정 + 3.14는 실수이므로 double 적용
		System.out.print("반지름을 입력하세요 : ");
		int radius = sc.nextInt();
		System.out.println("원의 넓이는 " + (radius*radius*pi)); // 원의 면적 : 반지름 * 반지름 * pi
		
		sc.close();
		
		
	}
	
	
}
