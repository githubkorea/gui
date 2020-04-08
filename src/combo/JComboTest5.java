package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class JComboTest5 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private DefaultComboBoxModel<String> model;
	private JButton btnDel;
	private JComboBox comboBox;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest5 frame = new JComboTest5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JComboTest5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.addActionListener(this);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		panel.add(btnDel);
		
		model=new DefaultComboBoxModel<String>();
		model.addElement("사과");
		model.addElement("수박");
		comboBox = new JComboBox<>(model);
		JComboBox<String> comboBox = new JComboBox<>(model);
		panel.add(comboBox);
		
		
		// 텍스트필드에 이벤트를 달면 엔터치면 변화가 일어난다 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// textField, button
		if(e.getSource()==textField) { //텍스트필드에 입력하고 엔터치면 추가가 되는 상황
			model.addElement(textField.getText());
			
		}else {  // JButton => 삭제
			model.removeElementAt(comboBox.getSelectedIndex());
		}
	}
}
