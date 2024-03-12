import java.util.Scanner;
import java.util.Random;
public class Practice14 {
	public static int whoswin(String com, String you)
	{
		if(com.equals(you))
		{return 0;}
		else if(com.equals("가위"))
		{
			if(you.equals("바위"))
				return 1;
			else 
				return -1;
		}
		else if(com.equals("바위"))
		{
			if(you.equals("가위"))
				return -1;
			else 
				return 1;
		}
		else
		{
			if(you.equals("가위"))
				return -1;
			else 
				return 1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		
		String com;
		
		int num = rg.nextInt(3);
		if(num == 0)
			com = "가위";
		else if(num == 1)
			com= "바위";
		else
			com= "보";
		
		System.out.println("컵퓨터의 생성 : " + com);
		
		System.out.print("당신의 입력 : ");
		String user = sc.next();
		while(!user.equals("가위")&&!user.equals("바위")&&!user.equals("보"))
		{
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			user = sc.next();
		}
		sc.close();
		
		int winCheck = whoswin(com, user);
		if(winCheck == -1)
			System.out.println("컴퓨터가 이겼습니다.");
		else if(winCheck == 0)
			System.out.println("비겼습니다.");
		else if(winCheck == 1)
			System.out.println("당신이 이겼습니다.");
		
		
	}
	
	

}
