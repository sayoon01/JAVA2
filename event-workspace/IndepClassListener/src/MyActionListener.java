import javax.swing.*; // 스윙 컴포너트 클래스 경로명
import java.awt.event.*; // AWT 이벤트 사용을 위한 경로명


// 객체를 만들어 별도의 클래스로 접근 , 클래스타입 리스너로 접근
class MyActionListener implements ActionListener { //ActionListener 인터페이스 구현
	
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton)e.getSource(); // 다운 캐스팅 , (Object타입)
		if(b.getText().equals("Action"))
			b.setText("액션"); // 한글로 변경시켜라
		else
			b.setText("Action");
	}
	
}
