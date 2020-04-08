package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.colorchooser.DefaultColorSelectionModel;

public class JComboTest2 extends JFrame implements ActionListener{

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest2 frame = new JComboTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JComboTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		// 콤보박스에 들어갈 아이템 설정
//		String[] items = {"월","화","수","목","금","토"};
//		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(items);
//		JComboBox<String> combo = new JComboBox<String>();
//		combo.setModel(model);
//		contentPane.add(combo,BorderLayout.SOUTH);
	
		// Vector 이용
		Vector<String> vector = new Vector<String>();
		vector.add("사과");
		vector.add("배");
		vector.add("복숭아");
		vector.add("스트로베리처럼베리베리상큼한사람돈워리워리어리버리한그대주위사람들은모두다이기주의");
		vector.add("이거먹으면나한테바나나는원래하얗다");
		
		JComboBox<String> combo = new JComboBox<String>(vector);
//		combo.setSelectedIndex(2);
		combo.setSelectedIndex(-1);
		contentPane.add(combo,BorderLayout.SOUTH);
		
		JTextField field = new JTextField();
		contentPane.add(field,BorderLayout.NORTH);
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> selected =(JComboBox<String>)e.getSource();
				
				field.setText(selected.getSelectedItem().toString());
			}
		});
		contentPane.add(combo,BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
