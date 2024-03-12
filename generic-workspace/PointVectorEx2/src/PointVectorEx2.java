import java.util.Vector;

public class PointVectorEx2 {

	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 벡터 생성
		Vector <Point> v = new Vector<Point>();
		
		//3 개의 Point 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		System.out.println("contains (-5,20) ? " + v.contains(new Point(-5,20))); 
		// 데이터는 같지만 새로 생성했으므로 서로 다른 객체임!!
		
		// Point 클래스에 코드 추가시
		// 서로 다른 객체이지만, 컬렉션은 동일한 데이터로 판별!
		}

}
