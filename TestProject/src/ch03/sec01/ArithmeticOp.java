package ch03.sec01;

import java.util.Scanner;
import java.text.DecimalFormat; // text 출력 format 설정 클래스 

public class ArithmeticOp {

	public static void main(String[] args) {
		// 산술연산자 : 나머지 연산자(%)
		// 나머지 연산자 규칙 : 나눈 나머지 값은 0 ~ 나눈값 -1 범위에서 나타남
		System.out.println("나머지 :" + (10%3));
		
		// 사용자 입력 (Scanner 사용)
		// 참조 데이터 타입 변수 (인스턴스)
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00"); // 생성자 호출 시 초기 값(인수)로 포맷문자 전달
		
		int kor, eng, math, total;
		float average;
		
		System.out.println("국어점수 입력 :");
		kor = sc.nextInt(); //키보드를 통해서 byte로 입력된 데이터를 int형으로 변환해서 반환
		System.out.println("수학점수 입력 :");
		math = sc.nextInt();
		System.out.println("영어점수 입력 :");
		eng = sc.nextInt();
		
		total = kor + eng + math;
		average = total/3.0f; // 실수 기본 데이터 타입 : double -> f 활용하여 float 리터럴로 변경 -> 나누기 결과 float으로 나오게 됨
		
		System.out.println("==========================");
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + df.format(average)); // + 연산 : 문자와 다른 타입간의 연산이거나 문자 + 문자일 경우 결합 
		
		sc.close(); // 인스턴스 종료
		
}

}
