import java.util.*;
public class IteratorVector {

	public static void main(String[] args) {
		
		Vector <Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(-1);
		v.add(-2);
		v.add(10);
		System.out.println("before : " + v);
		
		Iterator <Integer> it = v.iterator();
		while(it.hasNext()) {
			if(it.next()<0)
				it.remove(); // <- Iterator는 인덱스 없이 순차적 탐색 가능!!
		}
		//for문 반복 중 요소 삭제
		for(int i=0; i<v.size(); i++) {
			if(v.get(i) < 0)
				v.remove(i);
		}
		System.out.println("after : " + v); // <- -2가 삭제가 안됌 반복문 통해 요소 삭제 시 Iterator사용 !
		
	}

}
