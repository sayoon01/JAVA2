import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명 !! 폴더 안은 안됌!!!
import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명

public class FlowLayoutEx extends JFrame {// 모든 스윙프레임은 JFrame 상속
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료버튼 클릭-> 응요프로그램 종료
		
		Container c = getContentPane(); // 컨텐트 팬은 GUI 컴포넌트 부착공간
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40)); // 컨테이너 하나당 배치관리자 하나,
		//컨테이너 크기 변하면 컴포넌트 재배치
		// JFrame의 디폴트 배치관리자는 BorderLayout이지만 FlowLayout으로 새로운 배치관리자 설정
		//배치관리자는 java.awt 패키지에서 구현 
		//FlowLayout은 왼->오 그리고 위->아래 자동 줄바꿈 디폴트 값은 CENTER,5(수평),5(수직간격)
		
		c.add(new JButton("add")); //add로 컨텐트팬에 컴포넌트 부착
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
