import java.io.*; //<- reader/writer
import java.util.*; // scanner

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		
		//FileWriter는 문자스트림 즉 문자만 다룸
		//int c; 
		try {
			fout = new FileWriter("c:\\Temp\\test.txt"); // 파일 생성
			
			while(true) {
				String line = sc.nextLine();
				
				if(line.length() == 0)
					break;
				
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2); // 줄 바꿈 문자는 파일의 문자에 포함 X
				        // 별도로 추가 저장해준다
			}
			
			fout.close(); // 문자 출력스트림 닫아주깅
		}
		catch (IOException e){ //FileWriter는 IOException을 던짐
			System.out.println("입출력 오류");
		}
		sc.close();
	}

}