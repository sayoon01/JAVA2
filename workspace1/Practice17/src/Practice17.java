import java.util.Random;
import java.util.Scanner;
public class Practice17 {

	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}
	public static int searchArray(int[] array, int key)
	{
		int i;
		for(i=0;i<array.length;i++)
		{
			if(array[i]==key)
				break;
		}
		
		if(i==array.length)
			return -1;
		else
			return i;
	}
	public static void main(String[] args) {
		
		Random rg = new Random();
		int[] array = new int[10];
		
		int i;
		for(i=0; i<array.length; i++)
		{
			array[i]=rg.nextInt(100);
		}
		printArray(array);
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� ���� ���ڸ� �Է��ϼ��� : ");
		int key = sc.nextInt();
		sc.close();
		
		int index=searchArray(array,key);
		if(index==-1)
			System.out.println("�Է��� ���� " + key + "�� �迭�� �����ϴ�.");
		else
			System.out.println("�Է��� ���� " + key + "�� �迭�� " + (index+1) + "�� �ڸ��� �ֽ��ϴ�.");
		
	}

}