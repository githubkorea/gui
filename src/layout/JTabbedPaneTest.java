package layout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {

	public JTabbedPaneTest() { // 탭이 있는 패널
		setTitle("JTabbedPane");
		setSize(500,500);
		setVisible(true);
		
		JTabbedPane jtabbed = new JTabbedPane();
		// tab이 보여질 위치 지정
		jtabbed.setTabPlacement(JTabbedPane.BOTTOM);
		
		//탭에 보여줄 패널 추가
		JPanel first = new JPanel();
		first.setBackground(Color.yellow);
		jtabbed.addTab("첫번째", first);
		
		//탭에 보여줄 패널 추가
		JPanel second = new JPanel();
		second.setBackground(Color.blue);
		jtabbed.addTab("두번째", second);
		
		//탭에 보여줄 패널 추가
		JPanel third = new JPanel();
		third.setBackground(Color.red);
		jtabbed.addTab("세번째", third);
		
		add(jtabbed);
		
	}
	public static void main(String[] args) {
		JTabbedPaneTest pane = new JTabbedPaneTest();

	}

}
