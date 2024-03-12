import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
import java.awt.*; // 그래픽 처리 클래스들의 경로명

public class IndepClassListener extends JFrame{ // 스윙 프레임은 Jframe 상속 받음

	// 이벤트 리스너 : 이벤트를 처리하는 코드 , 클래스로 작성한다 . 컴포넌트에 등록되어야 작동 가능 -> 지정 필요
	//JDK에서 리스너 인터페이스 제공 (implements지원) , 개발자가 리스너 인터페이스의 추상 메소드(객체 생성XX) 호출
	public IndepClassListener() { // 이벤트 리스너를 독립 클래스로 작성
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		// JDK는 리스너 인터페이스 제공
		btn.addActionListener(new MyActionListener()); // Action 리스너 달기 , myActionListner라는 객체 생성
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
