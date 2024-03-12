import javax.swing.*;
import java.awt.*;


public class P1 extends JFrame{

	public P1() {
		setTitle("4X4 color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		JLabel[] jl = new JLabel[16];
		Color[] cl = {Color.RED,Color.BLUE,Color.ORANGE,Color.PINK,Color.BLACK,Color.WHITE,Color.GRAY,Color.GREEN,Color.CYAN,Color.DARK_GRAY,Color.MAGENTA,Color.YELLOW,Color.LIGHT_GRAY,Color.darkGray,Color.orange,Color.pink};
		
		for(int i=0; i<jl.length; i++) {
			// 컴포넌트 배경색 보이게 하려면 setOpaque(true); 
			
			jl[i] = new JLabel(Integer.toString(i));
			jl[i].setOpaque(true);
			jl[i].setBackground(cl[i]);
			
			c.add(jl[i]);
		}
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 grid = new P1();
	}

}
