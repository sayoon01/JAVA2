import javax.swing.*; // 스윙 컴포넌트 클래스 경로명
import java.awt.*; // 그래픽 처리 위한 클래스 경로명 , 폴더 안은 안됌

public class NullContainerEx extends JFrame{

	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); // 배치관리자 삭제 !! 
		
		JLabel la = new JLabel("Hello, Press Buttons !");
		la.setLocation(130,50); // 절대 위치 
		la.setSize(200,20); // 절대 크기 지정은 프로그램 내에서 이뤄저야함 ,, 동시 설정은 setBounds(x,y,w,h)
		c.add(la); // 컨텐트팬에 부착
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 문자열 형식으로, 버튼 생성
			b.setLocation(i*15, i*15); // 마음대로 배치 가능, 개발자가 컴포넌트의 크기 위치 임의 결정 가능
			b.setSize(50,20);
			c.add(b); // 버튼을 컨텐트팬에 부착
		}
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx();

	}

}
