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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioTest3 extends JFrame implements ActionListener{
	//라디오 버튼은 여러개 중에 하나만 받을때 사용
	//체크박스는 여러개를 받을때 사용 
	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest3 frame = new JRadioTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JRadioTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JRadioButton rdoSmall = new JRadioButton("Small Size");
		panel.add(rdoSmall);
		
		JRadioButton rdoMedium = new JRadioButton("Medium Size");
		panel.add(rdoMedium);
		
		JRadioButton rdoLarge = new JRadioButton("Large Size");
		panel.add(rdoLarge);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("어떤 크기의 피자를 주문하시겠습니까?");
		panel_2.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(30);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdoSmall);
		group.add(rdoMedium);
		group.add(rdoLarge);
		
		rdoSmall.addActionListener(this);
		rdoMedium.addActionListener(this);
		rdoLarge.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		textField.setText(e.getActionCommand()+ "가 선택되었습니다.");
	}
}
