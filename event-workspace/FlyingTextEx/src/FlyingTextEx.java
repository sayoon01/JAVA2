import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

rpublic class FlyingTextEx extends JFrame{

	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("Hello");th
	
	public FlyingTextEx() {
		setTitle("상하좌우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 배치 관리자 삭제
		c.addKeyListener(new MyKeyListener());
		
	    la.setLocation(50,50); // 초기값
	    la.setSize(100,20);
	    c.add(la);
	    
	    setSize(300,300);
	    setVisible(true);
	    
	    c.setFocusable(true);
	    c.requestFocus();
	    
	    c.addMouseListener(new MouseAdapter() {
	    	
	    	public void mouseClicked (MouseEvent e) {
	    		Component com = (Component)e.getSource();
	    		com.setFocusable(true);
	    		com.requestFocus();
	    	}
	    	
	    }); // 익명클래스 클래스 정의 인스턴스 생성 한번에 , 일회성, 클래스 이름 노필요
	}
	
	class MyKeyListener extends KeyAdapter {
		
		public void keyPressed (KeyEvent e) {
			
			int keyCode = e.getKeyCode(); // 가상 키 얻기
			
			switch(keyCode) {
			case KeyEvent.VK_UP :
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN :
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT :
				la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT :
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
