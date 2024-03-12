import java.util.Scanner;

public class practice_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형1의 가로를 입력: ");
		int w1  = sc.nextInt();
		System.out.print("사각형1의 세로를 입력: ");
		int h1 = sc.nextInt();
		
		System.out.print("사각형2의 가로를 입력: ");
		int w2 = sc.nextInt();
		System.out.print("사각형2의 세로를 입력: ");
		int h2 = sc.nextInt();
		
		Square s1 = Square.getInstance(w1, h1);
		Square s2 = Square.getInstance(w2, h2);
		
		if(s1.isSmallerThan(s2) == true) {
			System.out.println("사각형1의 넓이가 더 작습니다.");
		}
		else if(s2.isSmallerThan(s1) == true) {
			System.out.println("사각형2의 넓이가 더 작습니다.");
		}
		else {
			System.out.println("두 사각형의 넓이가 같습니다.");
		}

	}

}
