import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 다음 프로그램을 위해 프로그램 종료 + window 창닫기
		
		Container contentPane = getContentPane(); // Container contentPane은 컴포넌트들 부착공간
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // FlowLayout은 배치관리자 , 스윙 지원 안되므로 awt import
		 // frame.setLayout(new FlowLayout());은 새로운 배치관리자 설정                                                          // import.java.awt.*;
		contentPane.add(new JButton("OK")); //add , JButton은 컴턴트펜에 컴포넌트 달기
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
