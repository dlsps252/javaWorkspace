package ch04.sec01;
import java.util.Scanner;

public class ControlEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("*******상품정보*******");
			System.out.println("1 노트북 : 1,200,000원");
			System.out.println("2 디지털카메라 : 400,000원");
			System.out.println("******************************");
			System.out.print("상품번호 입력 : ");

		int num = sc.nextInt();

		if (num != 1 && num != 2) {
			System.out.println("잘못 입력하였습니다. 종료합니다.");
			sc.close();
		}

		String name = "";
		int price = 0;

		if (num == 1) {
			name = "노트북";
			price = 1200000;
		} else if (num == 2) {
			name = "디지털카메라";
			price = 400000;
		}

		System.out.print("주문 수량 입력 : ");
		int qty = sc.nextInt();

		int orderPay = price * qty;
		int discount = 0;

		// 할인 계산
		if (orderPay >= 1000000) {
			discount = (int)(orderPay * 0.10);
		} else if (orderPay >= 500000) {
			discount = (int)(orderPay * 0.05);
		}

		int totalPay = orderPay - discount;

		System.out.println("*******주문내용*******");
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price + "원");
		System.out.println("주문 수량: " + qty + "개");
		System.out.println("주문액: " + orderPay + "원");
		System.out.println("할인액: " + discount + "원");
		System.out.println("총지불액: " + totalPay + "원");

		sc.close();
	}
}