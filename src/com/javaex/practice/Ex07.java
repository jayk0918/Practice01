package com.javaex.practice;

public class Ex07 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		/*
		  예상
		  -> 아까 Ex06에서 실수했으니 이젠 암
		  -> i는 11, n은 11%2, 나머지값 1이 나옴
		*/
		
		System.out.println(i);
		System.out.println(n);
	}
	
	
	
}
