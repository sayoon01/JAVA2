import java.util.ArrayList;

public class ArratListEx {

	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList <String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Hi");
		a.add("Java");
		System.out.println(a);
		System.out.println("Size : " + a.size()); // ArrayList는 capacity() 함수 없음
		
		a.add(2,"Sahni"); // 삽입하면 뒤로 자동으로 위치 조정
		System.out.println(a);
		
		a.set(2, "James"); // 2번 위치 요소 변경, 원래 2번 요소는 삭제됌
		System.out.println(a);
		
		String str = a.get(1); // get은 인덱스 index의 요소(객체) return ! return은 삭제가 아님
		System.out.println(str);
		System.out.println(a);
	}

}
