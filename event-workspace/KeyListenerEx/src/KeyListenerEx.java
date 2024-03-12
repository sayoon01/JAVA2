import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {

	private JLabel[] keyMessage;
	
	public KeyListenerEx() {
		
		setTitle("keylistener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MykeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel("getKeyCode()");
		keyMessage[1] = new JLabel("getKeyChar()");
		keyMessage[2] = new JLabel("getKeyText()");
		
		for(int i=0; i<keyMessage.length; i++) {
			
			c.add(keyMessage[i]); // 부착
			keyMessage[i].setOpaque(true); //컴포넌트 불투명 지정 , 컴포넌트의 바탕색이 보이게 하도록
			keyMessage[i].setBackground(Color.YELLOW); 
		}
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true); // 키 이벤트를 받을 수 있을 조건은 focus 컴포넌트
		c.requestFocus(); // 그러려면 이 두 개의 문장이 필요
	}

	class MykeyListener extends KeyAdapter { //인터페이스X 상속
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 입력된 가상키 값 알아내기
			char keyChar = e.getKeyChar();  // 문자코드(유니코드) 리턴, 문자 키인 경우만 적용
		
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode)); // e.getKeyText(keyCode)<- static 메소드
			// keyCode의 코드값(가상키)에 해당하는 키의 이름 문자열로 리턴
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
