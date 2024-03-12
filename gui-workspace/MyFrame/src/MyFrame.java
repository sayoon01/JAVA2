import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명

public class MyFrame extends JFrame{ // 스윙 프레임은 JFrame 상속 받아 구현
	
	public MyFrame() {// 생성자 (main의 생성자 초기화)
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300); // 프레임 크기 300x300 
		setVisible(true); // 프레임 출력
	}
	
	// 권장
	public static void main(String[] args) {
		MyFrame frame = new MyFrame(); // 객체 생성 , Jcompenent 스윙 컴포넌트는 객체생성 불가		                                            // ex) new JComponent() XX
	}
	
}
