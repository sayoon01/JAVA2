import java.util.Random;

public class Practice21 {
	public static void main(String[] args)
	{
		
		int sum = 0;
		
		Random rg = new Random();
		int[] list = new int[10];
		
		for(int i=0; i<list.length; i++)
		{
			list[i] = rg.nextInt(100);
		}
		for(int e : list)
		{
			System.out.print(e + " ");
			sum+=e;
		}
		System.out.println();
		for(int i=0; i<list.length; i++)
		{
			list[i] = rg.nextInt(100);
		}
		
		for(int e : list)
		{
			System.out.print(e + " ");
			sum+=e;
		}
		double average = (double)sum/(list.length*2);
		System.out.println("\n�������� ���� : " + sum);
		System.out.println("�������� ��� : " + average);
	}
}
                                          