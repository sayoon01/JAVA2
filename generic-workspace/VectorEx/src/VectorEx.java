import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//정수가 값만 다루는 제너릭 벡터 생성 (구체화)
		Vector <Integer> v = new Vector <Integer>(); //<- 초기 용량 지정X
		
		v.add(5); 
		v.add(4);
		v.add(-1); // 삽입
		
		// 백터 중간에 삽입하기
		v.add(2,100); // index 2에 100 삽입
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("백터의 현재 용량 : " + v.capacity());
		
		//System.out.println(v);
		//모든 요소 정수 출력
		for(int i=0; i<v.size();i++) {
			int n = v.get(i); // index i의 객체 return
			System.out.println(n);
		}
		
		//벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
