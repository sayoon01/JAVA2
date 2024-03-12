import java.util.Scanner;
import java.util.Random;

public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input;
		String com;
		int win = 0, lose = 0, equal = 0;
		int key;
		
		do
		{
			System.out.println("���� ����� ���� : " + win + "�� " + lose + "�� " + equal + "��");
			
			com = computerInput();
			System.out.println("��ǻ���� �Է� : " + com);
			
			System.out.print("����� �Է� (����/����/��) : ");
			input = sc.next();
			
			if(input.equals("�׸�"))
			{
				System.out.println("���α׷��� �����մϴ�.");
			}
			
			else {
			key = whoswin(com,input);
	
			if(key == -1)
			{
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				lose++;
			}
			else if(key == 0)
			{
				System.out.println("�����ϴ�.");
				equal++;		
			}
			else	
			{
				System.out.println("����� �̰���ϴ�.");
				win++;
			}
			
			}	
		}while(!input.equals("�׸�")); 
		sc.close();
		
	}
	
	static String computerInput()
	{
		Random rg = new Random();
		
		int randomNum = rg.nextInt(3);
		
		if(randomNum == 0)
			return "����";
		else if(randomNum == 1)
			return "����";
		else
			return "��";
	}
	
	static int whoswin(String com, String you)
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

}