package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		
		// 빛이 1년동안 진행하는 거리 (long)
		// 300000km/s
		// 빌드업 : (초속 300000) * (1분_60초) * (1시간_60분) * (24시간) * (365일)
		
		long speed = 300000L;
		long lightyear = speed * 60L * 60L * 24L * 365L;
		System.out.println("빛이 1년 동안 가는 거리는 " + lightyear + " km 입니다.");
		
	}
	
}
