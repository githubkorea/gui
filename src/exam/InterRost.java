package exam;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class InterRost extends JFrame{
	private JTextField text;
	
	public InterRost(){
		setSize(649,633);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자계산기");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("거리를 마일 단위로 입력하세요");
		panel.add(lblNewLabel);
		
		text = new JTextField();
		panel.add(text);
		text.setColumns(10);
		
		JButton btnNewButton = new JButton("변환");
		getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JTextArea textResult = new JTextArea();
		getContentPane().add(textResult, BorderLayout.SOUTH);
		
		
		
		
	}
	public static void main(String[] args) {
		InterRost inter = new InterRost();
	}
}
