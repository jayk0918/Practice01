package com.javaex.practice;

public class Ex08 {
	
	public static void main(String[] args) {
		
		/*	int x,y = 0;	// x와 y를 모두 0으로 초기화 /
			실험 : int x,y=0;을 출력하면?
			System.out.println(x);
			System.out.println(y);
			여기에서 x가 초기화되지 않았다고 나옴
			(The local variable x may not have been initialized)
		*/
		
		int x = 0;
		int y = 0;
		//or
		
		int X,Y;
		X = 0;
		Y = 0;
		
		// 위 2가지 스타일로 정리할 수 있음
		
		
		char grade = 'A'; // 문자 A를 char를 써서 grade에 대입하려면 작은따옴표 써야죠
		
		int salary = 2000000; // salary에 2,000,000을 대입인데 ,는 빼세요(정수값)
		
		//byte n = 1000; // n에 1000을 대입인데 byte 수용범위는 -128 ~ 127임
		int n = 1000; // 정교한 메모리 작업을 원하면 short도 가능 하지만 굳이? / long + L도 가능(메모리 사치)
		
	}
	
	
}
