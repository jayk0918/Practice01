package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		//구의 부피
		
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14; // 원주율값은 그냥 상수선언
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		System.out.println("구의부피는: " + (double) 4/3*pi*radius*radius*radius +" 입니다.");
		
		sc.close();
		
	}
	
	
	
}
