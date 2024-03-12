import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame{

	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		c.add(btn);
		
		
		// 익명 클래스 일회성 사용할때 인스턴스 생성 한번에 작성 , 클래스 이름 없다.!
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				
				setTitle(b.getText());
					
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}