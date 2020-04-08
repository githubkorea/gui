package button;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class JToggleTest3 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JToggleButton tglbtnNewToggleButton; 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToggleTest3 frame = new JToggleTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JToggleTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tglbtnNewToggleButton = new JToggleButton("이미지를 보려면 클릭하세요");
		tglbtnNewToggleButton.addItemListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.SOUTH);
		
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange()==ItemEvent.SELECTED) {  // 일반버튼
			ImageIcon dog = new ImageIcon(getClass().getResource("pu.jpg"));
			lblNewLabel.setIcon(dog);
			lblNewLabel.setText("그림이 나타났어요");
		} else {
			lblNewLabel.setIcon(null);
			lblNewLabel.setText("그림이 사라졌어요");
		}
	}
}
				
////	JToggleButton tgl = (JToggleButton) e.getSource();  
		// 무엇을 누르던 JToggle버튼으로 바꾸라고 해서 일반버튼 누르면 castException 일어남
		
//		if(e.getSource()==btnNewButton) {  // 일반버튼
//			lblNewLabel.setText("일반버튼 클릭");
//		}else {  // toggle 버튼
//			JToggleButton tgl = (JToggleButton)e.getSource();
//			if(tgl.isSelected()) {
//				lblNewLabel.setText("Button on");
//			} else {
//				lblNewLabel.setText("Button off");
//			}
//		}
		
		
		
		

