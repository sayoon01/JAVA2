import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello"); //inner class 독립사용 XXXX
	
	public MouseListenerEx() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); //이벤트 리스너는 클래스 작성해서 불러옴
		
		c.setLayout(null); // 배치 관리자 삭제 Why? 마우스에 따라 수시로 위치 바뀌기 때문임
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener { // 인터페이스 implement
		public void mousePressed(MouseEvent e) {
			
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		
		public void mouseReleased(MouseEvent e) {		
		}	
		public void mouseClicked(MouseEvent e) {	
		}
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
		//MouseListener는 5가지 다 기재 단점 : 필요없는 것도 다!! 구현해야함
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
