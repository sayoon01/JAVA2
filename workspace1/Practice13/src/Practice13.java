import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ö���� �Է� : ");
		String c1 = sc.next();
		while(!c1.equals("����")&&!c1.equals("����")&&!c1.equals("��"))
		{
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			c1 = sc.next();
		}
		System.out.print("������ �Է� : ");
		String c2 = sc.next();
		while(!c2.equals("����")&&!c2.equals("����")&&!c2.equals("��"))
		{
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			c2 = sc.next();
		}
		sc.close();
		if(c1.equals("����"))
		{
			if(c2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(c2.equals("����"))
				System.out.println("�����ϴ�.");
			else if(c2.equals("��"))
				System.out.println("ö���� �̰���ϴ�.");
		}
		else if(c1.equals("����"))
		{
			if(c2.equals("����"))
				System.out.println("�����ϴ�");
			else if(c2.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(c2.equals("��"))
				System.out.println("���� �̰���ϴ�.");
		}
		else if(c1.equals("��"))
		{
			if(c2.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(c2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(c2.equals("��"))
				System.out.println("�����ϴ�.");
		}
		
	}

}