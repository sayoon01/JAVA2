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
		
		System.out.println("자리와 값이 모두 같은 숫자 : " + right + "개");
		System.out.println("자리는 다르고 값만 같은 숫자 : " + wrong + "개");
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
