import java.util.Random;
import java.util.Scanner;
public class Practice22 {

	public static void main(String[] args) {
		Random rg = new Random();
		
		int[] list = new int[10];
		
		for(int i=0; i<list.length; i++)
			list[i] = rg.nextInt(101);
		
		for(int e : list)
			System.out.print(e + " ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nã�� ���� ���ڸ� �Է����ּ��� : ");
		int key = sc.nextInt();
		
		int count = 0;
		for(int e : list)
		{
			count++;
			if(e == key)
			{
				System.out.println("�Է� �Ͻ� ���� " + key + "�� �迭 " + count + "��°�� ����ϴ�.");
				break;
			}
		}
		
		if(count == list.length)
			System.out.println("�Է� �� ���ڴ� �迭 �ȿ� �����ϴ�");
		
		sc.close();
	}

}