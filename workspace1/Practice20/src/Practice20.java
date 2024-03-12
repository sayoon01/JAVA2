import java.util.Random;
public class Practice20 {

	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+ " ");
		System.out.println();
	}
	public static void searchArray(int[] array)
	{
		int i;
		int right=0, wrong=0;
		
		for(i=0;i<array.length;i++)
		{
			if(array[i]==i)
				right++;
			else 
				wrong++;
				
		}
		
		System.out.println("�ڸ��� ���� ��� ���� ���� : " + right + "��");
		System.out.println("�ڸ��� �ٸ��� ���� ���� ���� : " + wrong + "��");
	}
	public static void main(String[] args) {
		
		Random rg = new Random();
		int[] array = new int[3];
		
		int i;
		for(i=0; i<array.length; i++)
		{
			array[i]=rg.nextInt(8)+1;
		}
		printArray(array);
		
		searchArray(array);
		
	}

}