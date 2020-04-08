package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockSciserPaper extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnRock,btnScissor,btnPaper;
	private static final int ROCK=0;
	private static final int SCISSOR=1;
	private static final int PAPER=2;
	
	public RockSciserPaper() {
		setTitle("가위바위보");
		setSize(500,500);
		JLabel lblNewLabel = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		lblNewLabel.setFont(new Font("굴림",Font.PLAIN,16));
		getContentPane().add(lblNewLabel,BorderLayout.NORTH);
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0,3,0,0));
		
		btnRock = new JButton("ROCK");	
		btnRock.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnRock);
		
		btnScissor = new JButton("SCISSOR");
		btnScissor.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnScissor);
		
		btnPaper = new JButton("PAPER");		
		btnPaper.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnPaper);
		
		setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		RockSciserPaper rock = new RockSciserPaper();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//커ㅁ퓨터의 가위,바위,보 생성하기
		Random random = new Random();
		// random.nextInt(3) : 괄호안의 숫자는 미포함해서 
		// 0,1,2 중에서 나오게 함 
		int computer = random.nextInt(3);
		
		
		//사용자가 누른 버튼의 값을 가져온 후
		String user = e.getActionCommand();
		if (user.equals("ROCK")) {  // 사용자가 주먹을 선택한 경구
			if(computer==ROCK) {
				textField.setText("비겼네");
			}else if(computer==SCISSOR) {
				textField.setText("이겼네");
			}else {
				textField.setText("졌네");
			}
		}else if (user.equals("PAPER")) { // 사용자가 보를 선택한 경우
			if(computer==PAPER) {
				textField.setText("비겼네");
			}else if(computer==SCISSOR) {
				textField.setText("졌네");
			}else {
				textField.setText("이겼네");
			}
		} else { // 사용자가 가위를 선택한 경우
			if(computer==SCISSOR) {
				textField.setText("비겼내");
			}else if(computer==ROCK) {
				textField.setText("비겼네");
			}else {
				textField.setText("졌네");
			}
			
		}
		//가위바위보를 해서 누가 이겼는지
		//textField에 보여주기
		
	}

}
