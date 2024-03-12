import javax.swing.*; // 스윙 컴포넌트 클래스 경로명
import java.awt.*; // 그래픽 처리 클래스 경로명

public class BorderLayoutEx extends JFrame{

	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		//써야하는 이유 스윙프로그램 종료 조건은 실행중인 사용자 스레드가 하나도 없을 때인데
		//main()이 종료되면 메인스레드는 종료되어도 이벤트 분배 스레드는 살아있어 
		//프레임, 마우스 또는 키 입력을 받기 때문에 프레임이 살아있는것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료 클릭 -> 응용프로그램 종료
		
		Container c = getContentPane(); // 컨텐트팬은 GUI 컴포넌트 부착 공간
		
		//BorderLayout은 5 구역으로 분할 배치 E,W,S,N,C
		//BorderLayout의 디폴트 값은 0,0
		c.setLayout(new BorderLayout(30,20)); // 컨테이너 하나 당 배치관리자 하나
		
		c.add(new JButton("Caculate"),BorderLayout.CENTER);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
