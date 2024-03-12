import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class P1 extends JFrame{

	JLabel label;
	public P1() {
		setTitle("+- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());


		
		label = new JLabel("Love Java");
		label.setSize(200,50);
		
		
		label.setFont(new Font("Arial", Font.PLAIN, 10));
	
		label.addKeyListener(new keyListener() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+')
					label.setFont(new Font("Arial",Font.PLAIN,label.getFont().getSize() +5));
				else if(e.getKeyChar() == '-') {
					if(label.getFont().getSize() > 5)
					label.setFont(new Font("Arial",Font.PLAIN,label.getFont().getSize()-5));
				}
			}
		});
		c.add(label);
		
		setSize(300,200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P1();
	}

}
