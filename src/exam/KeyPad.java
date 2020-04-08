package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private JTextField txtInput;
	private JButton[] buttons = new JButton[9];
	
	public KeyPad() {
		setTitle("키패드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		add(contentPane);
		
		txtInput = new JTextField();
		txtInput.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(txtInput,BorderLayout.NORTH); // north부분에 txt필드 하나 붙이고
		
		JPanel btnPanel = new JPanel();	  // 패널하나 생성하고 이름을 btnpanel
		btnPanel.setLayout(new GridLayout(0,3));	//btn패널에 크기 지정 하고
		contentPane.add(btnPanel, BorderLayout.CENTER); // center에 붙이고 !
		
		for(int i = 0; i<buttons.length;i++) {
			buttons[i] = new JButton((i+1)+""); //jbutton이라는 배열에 담을꺼야 그래서 배열의 객체생성 해줬지
			btnPanel.add(buttons[i]);	// 하나씩 9번 생성해서 붙여주고!
			
			buttons[i].addActionListener(this); // 밑에 addaction 코드랑 차이점을 알라!
		}
						//  ↑↑↑↑ 코드비교
		//buttons[0].addActionListener(this);  << 시간이 너무 남아돌아
		setVisible(true);  // 보여주고!
		
	
	}
	public static void main(String[] args) {
		KeyPad keyPad = new KeyPad();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼이 눌러지면, 해당 버튼의 text  값을 
		String str = e.getActionCommand();
		
		// txtinput에 보여주기 
		//txtInput.setText(str);  // 이전값을 무시하고 항상 새롭게 세팅
		txtInput.setText(txtInput.getText()+str);
		
		
	}

}
