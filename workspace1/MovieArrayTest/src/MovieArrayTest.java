import java.util.Scanner;

public class MovieArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie[] list = new Movie[10];
		list[0] = new Movie("������ǻ��", "�ι�Ʈ ����Ű��");
		list[1] = new Movie("Ƽ�ĴϿ��� ��ħ��", "������� ������ũ");
		
		for(int i=0; i<Movie.count; i++) {
			System.out.println("======================");
			System.out.println("���� : " + list[i].title);
			System.out.println("���� : " + list[i].director);
			System.out.println("======================");
		}
		sc.close();
	}

}