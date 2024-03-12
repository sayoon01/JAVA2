import javax.swing.*; // 스윙컴포넌트 클래스 경로명
import java.awt.*; // 그래픽 처리 클래스 경로명 <-ex)setLayout()
public class GridLayoutEx extends JFrame {// 스윙 프레임은 JFrame 무조건 상속{
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 배치관리자 사각형 그리드로 분항 각셀에 컴포넌트 하나씩 배치
		GridLayout grid = new GridLayout(4,2); // 행,렬 생성자에서 지정
		grid.setVgap(5);
		
		Container c = getContentPane(); // 컨텐트팬은 컴포넌트 부착공간
		c.setLayout(grid); // c.setLayout(new GridLayout(4,2,5,0));
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
