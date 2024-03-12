import java.lang.ArithmeticException;
import java.util.Scanner;

import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수를 입력하세요 : ");
			int dividend = sc.nextInt();  // 나뉨수
			System.out.print("나눗수를 입력하세요 : ");
			int divisor = sc.nextInt();//나눗수
			
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
				break; // <- while문 벗어남
			}
			// ArithmeticExcetpion
			catch (ArithmeticException e) { // ArithmeticException 예외처리코드
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요 ");
			}
		}
		sc.close();
	}
}