package layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest1 extends JFrame {
	public BorderLayoutTest1() {
		// 타이틀 지정
		setTitle("BorderLayout");
		
		// 크기 지정
		setSize(500,500);
		
		//프로그램종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		//JPanel 생성
		JPanel contentPane = new JPanel();
		
		// layout 지정
		contentPane.setLayout(new BorderLayout());
		
		//버튼 컴포넌트 생성
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		JButton btn4 = new JButton("버튼 4");
		JButton btn5 = new JButton("버튼 5");
		
		//패털에 버튼 부착
		contentPane.add(btn1,BorderLayout.EAST);
		contentPane.add(btn2,BorderLayout.WEST);
		contentPane.add(btn3,BorderLayout.CENTER);
		contentPane.add(btn4,BorderLayout.NORTH);
		contentPane.add(btn5,BorderLayout.SOUTH);
		
		// 프레임에 apnel 부착
		add(contentPane);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest1 border = new BorderLayoutTest1();
	}
}
