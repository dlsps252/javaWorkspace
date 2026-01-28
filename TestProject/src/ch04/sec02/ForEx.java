package ch04.sec02;

public class ForEx {
	public static void main(String[] args) {

		for (int m = 2; m <= 9; m++) {
			System.out.print(m + "단\t");
		}
		System.out.println(); // 줄바꿈

		// 실제 곱셈 출력
		for (int n = 1; n <= 9; n++) {
			for (int m = 2; m <= 9; m++) {
				System.out.print(m + "×" + n + "=" + (m * n) + "\t");
			}
			System.out.println(); // 한 줄 끝
		}
	}
}