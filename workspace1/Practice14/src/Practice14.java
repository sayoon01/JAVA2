import java.util.Scanner;
import java.util.Random;
public class Practice14 {
	public static int whoswin(String com, String you)
	{
		if(com.equals(you))
		{return 0;}
		else if(com.equals("����"))
		{
			if(you.equals("����"))
				return 1;
			else 
				return -1;
		}
		else if(com.equals("����"))
		{
			if(you.equals("����"))
				return -1;
			else 
				return 1;
		}
		else
		{
			if(you.equals("����"))
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
			com = "����";
		else if(num == 1)
			com= "����";
		else
			com= "��";
		
		System.out.println("��ǻ���� ���� : " + com);
		
		System.out.print("����� �Է� : ");
		String user = sc.next();
		while(!user.equals("����")&&!user.equals("����")&&!user.equals("��"))
		{
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			user = sc.next();
		}
		sc.close();
		
		int winCheck = whoswin(com, user);
		if(winCheck == -1)
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		else if(winCheck == 0)
			System.out.println("�����ϴ�.");
		else if(winCheck == 1)
			System.out.println("����� �̰���ϴ�.");
		
		
	}
	
	

}