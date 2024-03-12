import java.io.*;  // 입출력 스트림

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7,51,3,4,-1,24};
		
		try {
			// 바이트 스트림 , 바이너리 파일 다루는
			// FileWriter와 유사
			//IO Exception 던질수 있음 -> checked Exception이므로 예외처리 필수필수
			
			FileOutputStream fout = new FileOutputStream ("c:\\Temp\\test.out");
			
			for(int i=0; i<b.length; i++) 
				fout.write(b[i]); // 한 바이트를 파일에 출력 배열 b의 바이너리를 그대로! 기록
				
			
			fout.close();
		}
		catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요");
			return;
		}
		System.out.println("c:\\Temp\\test.out을 저장하였습니다."); 
	}

}