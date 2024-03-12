/*import java.util.*;
public class HashMapDicEx {

	public static void main(String[] args) {
		// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap <String,String> dic = new HashMap<String,String>();
		
		// 3개의 (key,value) 쌍을 dic에 저장
		dic.put("baby", "아기"); //baby는 key 아기는 value, key는 삽입되는 위치 저장에 사용, 값 검색 위해 key 반드시 이용
		dic.put("love","사랑"); //put() 함수는 요소 삽입
		dic.put("apple","사과");
		
		//영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String eng = sc.next();
			if(eng.equals("exit")) // String은 == 사용 불가 그래서 .equals() 필요
			{
				System.out.println("종료합니다.");
				break;
			}
			
			// 해시맵에서 '키'eng의 '값'kor 검색
			String kor = dic.get(eng); // 요소 검색 get()메소드
			if(kor == null) // null 비었다
				System.out.println(eng + "는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
		sc.close();
	}

}*/
import java.util.*;

public class HashMapDicEx {
	
	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("apple", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 단어?");
			String eng = sc.next();
			
			if(eng.equals("exit"))
				break;
			
			String kor = dic.get(eng);
			
			if(kor == null)
				System.out.println("없는 단어");
			else
				System.out.println(kor);
		}
		
		sc.close();
	}
}