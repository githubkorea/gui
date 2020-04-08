package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JComboTest1 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest1 frame = new JComboTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JComboTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JComboBox<String> comboBox = new JComboBox<>();  //제너릭 컴파일 단계에서 다른 타입이 담기는 것을 방지  <tu>
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"수성", "금성", "지구", "화성", 
				"목성", "토성", "천왕성", "명왕성", "김동성"}));
		contentPane.add(comboBox, BorderLayout.NORTH);
	}

}
