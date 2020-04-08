package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class jLabelTest2 extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JToggleButton tglbtnNewToggleButton;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jLabelTest2 frame = new jLabelTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jLabelTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.addItemListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("이미지를 보려면 버튼을 누르세요");
		tglbtnNewToggleButton.add(lblNewLabel);
		
		JButton btnClick = new JButton("");
		btnClick.addItemListener(this);
		tglbtnNewToggleButton.add(btnClick);
		
		lblNewLabel_1 = new JLabel();
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
//		ImageIcon dog = new ImageIcon(getClass().getResource("dog.gif"));
//		lblNewLabel_1.setIcon(dog);
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			ImageIcon icon = new ImageIcon(getClass().getResource("dog.gif"));
			
		} else {
			lbImage.setIcon(null);
			lblImage.setText("그림이 사라졌어요");
		}
		
	}

}
