import java.io.*; // FileReader는 java.io 패키지
public class FileReaderEx {

	public static void main(String[] args) {
		
		// 스트림은 단방향 입출력 장치와 응용프로그램 연결
		// 선입 선출 순차적으로 입출력
		// 동시에 입출력 이뤄지지 않음
		// 문자 스트림은 문자만 입출력 가능 사진이나 동영상 바이너리 파일 절ㄷㅐ 안됌, 텍스트 파일만 불러올수 있음
		//문자스트림은 Reader,Writer로 끝나고
		//Reader,Writer는 추상 클래스 , java.io 패키지다 그리고 FileNotFoundException 꼭필요하고
		//FileNotFoundException의 메소드는 read(), read(char[] charf,int offset,int length),close()
		//close()로 스트림을 꼭 닫아줘라, 스트림 닫으면 파일도 닫힌다.
		//이 메소드들은 IO Exception이고
		//FileNotFoundEXception과 IOException둘다 checekd Exception 자바 예외처리 꼭해야함 아니면 오류 남
		FileReader fin = null; //<- 문자 입출력 스트림
		//FileReader는 읽기전용으로 파일 열림
		try {
			fin = new FileReader("");
			int c; // read(),는 한문자씩 읽고 리턴은 정수형으로 한다.
	
			// read()가 -1를 리턴한다면 파일의 끝
			while((c = fin.read()) != -1) {
				System.out.print((char)c); //c는 int형이기 때문에 char로 형변환하여 출력
			}
			fin.close();// <-Filereader꼭 닫아줘라 그래야 파일도 닫힌단다
		}
		catch(FileNotFoundException e) {//FileNotFoundException은 FileReader에 의해
			System.out.println("파일 오픈 오류");
		}// FileNotFoundException 부터 catch 해야함 첫번째 catch만 실행 되므로 순서 중
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
