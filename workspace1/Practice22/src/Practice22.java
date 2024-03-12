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
		System.out.print("\n찾고 싶은 숫자를 입력해주세요 : ");
		int key = sc.nextInt();
		
		int count = 0;
		for(int e : list)
		{
			count++;
			if(e == key)
			{
				System.out.println("입력 하신 숫자 " + key + "는 배열 " + count + "번째에 잆습니다.");
				break;
			}
		}
		
		if(count == list.length)
			System.out.println("입력 한 숫자는 배열 안에 없습니다");
		
		sc.close();
	}

}
