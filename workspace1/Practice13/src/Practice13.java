import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("철수의 입력 : ");
		String c1 = sc.next();
		while(!c1.equals("가위")&&!c1.equals("바위")&&!c1.equals("보"))
		{
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			c1 = sc.next();
		}
		System.out.print("영희의 입력 : ");
		String c2 = sc.next();
		while(!c2.equals("가위")&&!c2.equals("바위")&&!c2.equals("보"))
		{
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			c2 = sc.next();
		}
		sc.close();
		if(c1.equals("가위"))
		{
			if(c2.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else if(c2.equals("가위"))
				System.out.println("비겼습니다.");
			else if(c2.equals("보"))
				System.out.println("철수가 이겼습니다.");
		}
		else if(c1.equals("바위"))
		{
			if(c2.equals("바위"))
				System.out.println("비겼습니다");
			else if(c2.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if(c2.equals("보"))
				System.out.println("영희가 이겼습니다.");
		}
		else if(c1.equals("보"))
		{
			if(c2.equals("바위"))
				System.out.println("철수가 이겼습니다.");
			else if(c2.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else if(c2.equals("보"))
				System.out.println("비겼습니다.");
		}
		
	}

}
