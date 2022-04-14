package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		//동전별 개수 + 총금액
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int num_500 = sc.nextInt();
		System.out.print("100원 개수: ");
		int num_100 = sc.nextInt();
		System.out.print("50원 개수: ");
		int num_50 = sc.nextInt();
		System.out.print("10원 개수: ");
		int num_10 = sc.nextInt();
		System.out.println
		("동전의 총합은 " + (500*num_500 + 100*num_100 + 50*num_50 + 10*num_10) + " 원 입니다.");
		
		sc.close();
		
		
	}
	
	
}
