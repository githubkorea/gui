package label;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class JLabelTest3 extends JFrame {

	private JPanel contentPane;
	private JLabel label1, label2, label3, label4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelTest3 frame = new JLabelTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JLabelTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		add(getLabel1());
		add(getLabel2());
		add(getLabel3());
		add(getLabel4());
		setSize(200,300);
	}
	
	public JLabel getLabel1() {	 //이미지를 안줌  / 수평은 왼쪽  기본은 왼쪽정렬
		if(label1==null) {
			label1 = new JLabel();
			label1.setText("JLabel1");
			label1.setHorizontalAlignment(JLabel.LEFT);
			label1.setBorder(new EtchedBorder());
		}
		return label1;
	}

	public JLabel getLabel2() { 	// 수평은 센터 / 순서대로 들어옴  
		if(label2==null) {
			label2 = new JLabel();
			label2.setText("JLabel2");
			label2.setIcon(new ImageIcon(getClass().getResource("camping-tent.png")));
			label2.setHorizontalAlignment(JLabel.CENTER);
			label2.setBorder(new EtchedBorder());
		}
		return label2;
	}
	public JLabel getLabel3() {	 	 // 텍스트 포지션을 왼쪽으로 
		if(label3==null) {
			label3 = new JLabel();
			label3.setText("JLabel3");
			label3.setIcon(new ImageIcon(getClass().getResource("camping-tent.png")));
			label3.setHorizontalAlignment(JLabel.CENTER);
			label3.setHorizontalTextPosition(JLabel.LEFT);
			label3.setBorder(new EtchedBorder());
		}
		return label3;
	}

	public JLabel getLabel4() {	   // 전체적으로 가운데 오게하고 텍스트와 이미지 사이에 갭을 20 준다.
		if(label4==null) {
			label4 = new JLabel();
			label4.setText("JLabel4");
			label4.setIcon(new ImageIcon(getClass().getResource("camping-tent.png")));
			label4.setHorizontalAlignment(JLabel.CENTER);
			label4.setIconTextGap(20);
			label4.setBorder(new EtchedBorder());  // 첫번째 블록이 엣치보더
		}
		return label4;
	}
}
























