import java.util.*;

public class HashMapStudentEx {

	public static void main(String[] args) {
		// 학생 이름과 Student 객체를 쌍으로 지정하는 HashMap 컬렉션 생성
		HashMap <String,Student> map = new HashMap<String,Student>();
		
		//3명의 학생 저장
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("이재문", new Student(2,"010-222-2222"));
		map.put("김남윤", new Student(3,"010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름? ");
			String name = sc.nextLine(); // 사용자로부터 이름 입력 nextLine 공백 줄바꿈도 허용 nextInt와 nextLine 혼용시 문제
			
			if(name.equals("exit")) 
				break; //while문 벗어나 프로그램 종료
			
			Student student = map.get(name);
			if(student == null) 
				System.out.println(name + "은 없는 사람입니다.");
			else
				System.out.println("id : " + student.getId()+ ", 전화 : " + student.getTel());
		}
		sc.close();
		
	}

}
