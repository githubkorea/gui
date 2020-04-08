package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class JCheckBoxTest2 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JCheckBox checkboxNewCheckBox,checkboxNewCheckBox_1,checkboxNewCheckBox_2;
	private JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxTest2 frame = new JCheckBoxTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JCheckBoxTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		checkboxNewCheckBox_1 = new JCheckBox("사과");
		panel_1.add(checkboxNewCheckBox_1);
		
		checkboxNewCheckBox_2 = new JCheckBox("복숭아");
		panel_1.add(checkboxNewCheckBox_2);
		
		checkboxNewCheckBox = new JCheckBox("포도");
		panel_1.add(checkboxNewCheckBox);
		
		textArea = new JTextArea();
		panel.add(textArea);
		
		checkboxNewCheckBox.addItemListener(this);
		checkboxNewCheckBox_1.addItemListener(this);
		checkboxNewCheckBox_2.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 체크박스가 체크되면 체크된 과일의 이름을 
		// textArea에 보여주기
		// 체크가 해제되면 textArea 에 있던 파일의 이름은
		// 삭제해주기
		// textArea => setText(), append();
		// 항상 새롭게 생성 / 기존의 있던거 뒤에 붙여넣기 차이
		
//		if(checkboxNewCheckBox_1.isSelected()) {
//			textArea.append("사과");
//		}else {
//			
//		}
		JCheckBox check = (JCheckBox)e.getSource();
		if(e.getStateChange()==ItemEvent.SELECTED) {
			textArea.append(" "+check.getText());
		}else {
			//textArea 에 있는 전체 문자열
			String contents = textArea.getText();
			
			//체크가 해제된 체크박스 문자열
			String delTxt = check.getText();
			
			// * String 클래스의 특징인 변화를 줄 수 없어 변화를 주려면 다시 새롭게 담아야됨
			
			//* but, String buffer 와 String builder는 있음.
			StringBuffer buffer = new StringBuffer(contents);
			// **indexOf 쓰면 시작위치 알수있음
			int start = buffer.indexOf(delTxt);
			int end = start+delTxt.length();
			buffer.delete(start, end);
			textArea.setText(buffer.toString());
		}
	}
}
