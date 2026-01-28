package ch03.sec02;

import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		// 초를 입력 받아서 시간, 분, 초로 나누어 출력
		Scanner sc = new Scanner(System.in);
		
		int input;
		int hour;
		int minute;
		int second;
		
		System.out.println("시간 입력(초):");
		input = sc.nextInt();
		
		hour = input / 3600;
		minute = (input % 3600)/60;
		second = input % 60;
		
		System.out.println(input + "초는");
		System.out.print(hour + "시간,");
		System.out.print(minute + "분,");
		System.out.print(second + "초 입니다.");
		
		sc.close();

	}

}
