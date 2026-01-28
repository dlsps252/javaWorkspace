// 한개 소스에 여러 클래스가 있을 때 public 접근 권한자는 한개의 클래스만 가능
class A {
	
}

class B {
	
}

public class Test {
// public class 이름 = 파일명
	public static void main(String[] args) {
		// 프로그램 시작점
		// static  이므로 객체 없이 바로 사용 가능
		// 실행할때 런타임 (java)이 main을 호출하는 것부터 시작
		// 출력을 위한 코드
		
		//문장 블럭 마지막 세미콜론;
		System.out
		.println("test"
				+ "");
		
		System.out.println("test 입니다");
		//한줄 주석
		
		/*
		 * 여러 줄 주석
		 */
		{
			//영역 범위 표시(클래스, 메소드, 조건문, 반복문 등)
		}
	}

}


