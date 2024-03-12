import javax.swing.*; // 스윙 컴포넌트 클래스 경로명
import java.awt.*; // 그래픽 처리 클래스 경로명
import java.awt.event.*;  // awt 이벤트 사용을 위한 경로명

public class InnerClassListener extends JFrame { // 스윙 프레임은 JFrame 상속

	public InnerClassListener() {
		
		setTitle("Action 이벤트 리스너에게");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // 컨텐트팬은 GUI 컨포넌트 부착 공간
		c.setLayout(new FlowLayout());// 배치관리자 java.awt 
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // 이벤트 객체
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//이벤트 소스 알아내려면 , 발생한 이벤트 객체 Object 타입으로 return 하므로
			// 다운 캐스팅 하여 사용
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			// 리스너에서 InnerClassListener의 멤버에 대한 접근 용이,private클래스도 접근가능
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출 할 수 있음
			// -> 클래스명, 메소드로 바로 접근 가능	
			InnerClassListener.this.setTitle(b.getText()); // 프레임 타이틀에 버튼 문자열을 출력한다
			
		}
	}
	
	public static void main(String[] args) {
		
		new InnerClassListener();
		
	}

}
