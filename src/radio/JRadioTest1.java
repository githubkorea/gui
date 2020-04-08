package radio;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JRadioButton;

public class JRadioTest1 extends JFrame {
	//라디오 버튼은 여러개 중에 하나만 받을때 사용
	//체크박스는 여러개를 받을때 사용 
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest1 frame = new JRadioTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JRadioTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("선호하는 애완동물은?");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdodog = new JRadioButton("겅어자");
		panel_1.add(rdodog);
		
		JRadioButton rdocat = new JRadioButton("고양이");
		panel_1.add(rdocat);
		
		JRadioButton rdohog = new JRadioButton("고슴도치");
		panel_1.add(rdohog);
		
		JRadioButton rdoalp = new JRadioButton("알파카");
		panel_1.add(rdoalp);
		
		JRadioButton rdotig = new JRadioButton("호랑이");
		panel_1.add(rdotig);
		
		//버튼 그룹 생성  >> 하나밖에 선택됨.
		//radiobutton 은 기본적으로 그룹까지 만들어줘야함.
		ButtonGroup group = new ButtonGroup();
		group.add(rdodog);
		group.add(rdocat);
		group.add(rdohog);
		group.add(rdoalp);
		group.add(rdotig);
	}
	
}
