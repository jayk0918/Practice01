package com.javaex.practice;

public class Ex09 {
	
	public static void main(String[] args) {
		
		double f = 80.0;
		System.out.println(5/9*(f-32.0));
		
		/* 	0이 나오는 이유 : int(5) / int(9) * (double 80.0-32.0)
		 	-> 우선순위를 적용하여 재정리하면 int(5) / int(9) * double(48.0)
		 	-> int(5)/int(9)가 먼저 연산되는데, 이 때 몫이 0이 나옴
		 	-> int는 정수이므로 나머지는 폐기, 0만 연산하는데 후에 *double(48.0)이니 0이 나옴
		*/
		
		// 정상결과 : 모든 정수를 실수(double or float)로 형변환
		System.out.println((double)5/9*(f-32.0));
		
		// reverse experiment
		// -> 섭씨 - 화씨 계산식을 구성하여
		// f에 80.0 => 26.666666...을 도출한 화씨 - 섭씨 계산을 재구성
		
		double c = 26.6666;
		System.out.println((double)(c*9/5)+32);
		//26.6 -> 79.88, 솔직히 무한소수라서 26.6이라고 축약하긴 했지만 유사하지만 약간의 오차는 있는 결과가 나옴
		//소수점 6이 늘어날수록 비교적 정교한 값이 나오긴 하지만 오차는 여전히 존재
	}
	
	
}
