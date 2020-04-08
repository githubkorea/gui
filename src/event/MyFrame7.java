package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame7 extends JFrame implements ActionListener{ 
	// 5번을 3번방법으로 변경한거

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnYellow, btnRed;
	private JButton btnClose;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame7 frame = new MyFrame7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFrame7() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		btnYellow = new JButton("노랑");
		btnYellow.addActionListener(this);
		panel.add(btnYellow);
		
	
		btnRed = new JButton("빨강");
		btnRed.addActionListener(this);
		panel.add(btnRed);		
		
		
		btnClose = new JButton("닫기");
		btnClose.addActionListener(this);
		panel.add(btnClose);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// btnYellow or btnRed
		if (e.getSource()==btnYellow) {
			contentPane.setBackground(Color.yellow);
			panel.setBackground(Color.yellow);
			
		}else if(e.getSource()==btnRed){
			contentPane.setBackground(Color.red);
			panel.setBackground(Color.red);
		}else { //btnClose
			//프레임 종료
			System.exit(0);	
		}
	}
}




