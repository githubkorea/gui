package radio;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioTest2 extends JFrame implements /*ActionListener*/ ItemListener{
	//라디오 버튼은 여러개 중에 하나만 받을때 사용
	//체크박스는 여러개를 받을때 사용 
	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdodog,rdocat,rdohog,rdoalp,rdotig,rdobad; 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest2 frame = new JRadioTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JRadioTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("선호하는 애완동물은?");
		lblNewLabel.setFont(new Font("굴림",Font.PLAIN,10));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		
		rdodog = new JRadioButton("겅어자");
		//rdodog.addActionListener(this);
		rdodog.addItemListener(this);
		panel.add(rdodog);
		
		rdocat = new JRadioButton("고양이");
		//rdocat.addActionListener(this);
		rdodog.addItemListener(this);
		panel.add(rdocat);
		
		rdobad = new JRadioButton("벌꿀오소리");
		//rdobad.addActionListener(this);
		rdodog.addItemListener(this);
		panel.add(rdobad);
		
		rdoalp = new JRadioButton("알파카");
		//rdoalp.addActionListener(this);
		rdodog.addItemListener(this);
		panel.add(rdoalp);
		
		rdotig = new JRadioButton("호랑이");
		//rdotig.addActionListener(this);
		rdodog.addItemListener(this);
		panel.add(rdotig);
		
		//버튼 그룹 생성  >> 하나밖에 선택됨.
		//radiobutton 은 기본적으로 그룹까지 만들어줘야함.
		ButtonGroup group = new ButtonGroup();
		group.add(rdodog);
		group.add(rdocat);
		group.add(rdobad);
		group.add(rdoalp);
		group.add(rdotig);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JRadioButton radio = (JRadioButton)e.getSource();
//		
//		if(radio.isSelected()) {
//			System.out.println("선택됨");
//		}else {
//			System.out.println("선택 안됨");
//		}
//			
//		textField.setText(e.getActionCommand());
//		
//	}
	@Override
	public void itemStateChanged(ItemEvent e) {	 //선택이 되는 상황과 해제 되는 상황 
		JRadioButton radio = (JRadioButton)e.getItem();
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(radio==rdocat) {
				System.out.println("rdocat 선택");
			} else if(radio==rdodog) {
				System.out.println("rdodog 선택");
			}
		}else {
			if(radio==rdocat) {
				System.out.println("rdocat 해제");
			}else if (radio==rdodog)
				System.out.println("rdodog 해제");
		}
	
	}
}


