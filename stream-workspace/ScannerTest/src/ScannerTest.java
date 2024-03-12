import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		try {
			// Scanner(File file)은 읽기전용으로 파일 오픈하여 입력받음
			Scanner input = new Scanner(new File("numbers.txt")); 
			while(input.hasNext()) {
				n = input.nextInt(); // int형 입력받음
				System.out.println(n);
			}
			input.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("cannot open"); //FileNotFoundException catch문에서 출력은
			// 강제 종료 시킴 !!!!! System.exit(1); 0만 아니면 가능 0은 정상적으로 종료시
			System.exit(1); // Sysetm.out.println이 아니라 System.err.println
			//error 메시지 내보낼 때 사용 !!
		}
	}

}
