// 바이트 스트림 -> stream으로 끝남, 바이트 단위이지만 문자도 다룰 수 있다
// Writer/Reader & OutputStream/InputStream
// Writer & Output 파일에 출력, 저장 / IO Exception 던질수 있다, append 존재 그래서 true면 파일 끝에 데이터 추가
// Reader & Input / FileNotFoundException , IOException 던질수 있다, read는 int로 return 하고 파일 끝값 -1
import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		
		byte b[] = new byte[6];
		
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			
			int n=0,c;
			while((c=fin.read()) != -1) {
				b[n] = (byte)c; //c는 int형으로 리턴되므로 형변환 필수
				n++;
			}
			
			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++) 
				System.out.print(b[i]+ " ");
			System.out.println();
			
			fin.close();
		}
		/*catch (FileNotFoundException e)  {
			
		}*/
		catch (IOException e) {
			System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
		}

	}

}
