package com.javaex.practice;

public class Ex06 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;
		
		/* 	예상
			-> 첫번째 출력문에서는 i에 대한 10 그대로 나올것임 (초기화 이후 영향을 주는 수식이 없음)
				-> 응 아니야 / i++이 있으니 11이지 / n변수에 정의한 값이라도 영향을 받음 / 11이 나오지
			-> 두번째 출력문에서는 (연산자 우선순위 참고)
			++(우선) > %(차선)이므로 10+1이 된 11%2, 즉 나머지값 1이 나올것임
				-> 아무래도 ++i를 생각한듯 / i++은 그 라인에서는 이전 값을 출력함
				-> 그러므로 10%2, 나머지값이 0이므로 0이 나옴
		*/
		System.out.println(i);
		System.out.println(n);
		
	}
	
	
}
