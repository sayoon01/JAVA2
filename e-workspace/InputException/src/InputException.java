import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요 : ");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			try {
				System.out.print(i + ">>");
				n = sc.nextInt();
				sum += n;
			}
			//InputMismatchException
			//InputMismatchException
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); // <- 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--;
				continue;
			}
		}
		System.out.println("합은 " + sum);
		sc.close();
	}

}
