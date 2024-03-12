import java.util.Formatter; 
// Formatter 클래스는 java.util 패키지 !
import java.io.FileNotFoundException; //1번
// FileNotFoundException은 java.io 패키지
//
public class FormatterTest {

	public static void main(String[] args) {
		
		try {
			Formatter output = new Formatter("numbers.txt");
			for(int i=0; i<10; i++)
				output.format("%d\r\n",i);
			output.close();
		}
		//FileNotFoundException은 IO Exception이고 입출력파일 open시 발생 할 수 있다
		catch(FileNotFoundException e) { //FileNotFoundException은 Checked Exception
			//catch or declare requirement 강제 , 컴파일러가 예외대응여부 검사 , 예외처리대상
			System.err.println("cannot open"); // 2번 //error 메시지 출력시
			       //System.err.println
			System.exit(1); // 3번 비정상적으로 종료 될 때 0이 아닌 수
		}
	}

}