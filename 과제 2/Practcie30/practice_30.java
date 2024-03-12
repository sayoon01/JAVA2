import java.util.Scanner;

public class practice_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("내 키를 입력하세요: ");
		int h1  = sc.nextInt();
		System.out.print("내 몸무게를 입력하세요: ");
		int w1 = sc.nextInt();
		
		System.out.print("당신의 키를 입력하세요: ");
		int h2  = sc.nextInt();
		System.out.print("당신의 몸무게를 입력하세요: ");
		int w2 = sc.nextInt();
		
		BodyData bd1 = new BodyData(h1, w1);
		BodyData bd2 = new BodyData(h2, w2);
		
		if(bd1.isTallerThan(bd2) == true) {
			if(bd1.getHeight() > bd2.getHeight()) {
				System.out.println("키는 내가 더 큽니다.");
			}
			else if(bd1.getHeight() == bd2.getHeight()) {
				System.out.println("나와 당신의 키는 같습니다.");
			}
		}
		else {
			System.out.println("키는 당신이 더 큽니다.");
		}
		
		if(bd1.needDiet() == true) {
			System.out.println("나는 다이어트가 필요합니다.");
		}
		else {
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		}
		
		if(bd2.needDiet() == true) {
			System.out.println("당신은 다이어트가 필요합니다.");
		}
		else {
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		}
	}

}
