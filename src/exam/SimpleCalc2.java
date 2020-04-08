package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimpleCalc2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtOp1,txtOp2,txtResult;
	private JButton btnOk,btnCancle,btnAdd,btnSubt,btnDiv,btnMul,btnReset;
	private JLabel labelSymbol;
	int op1,op2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc2 frame = new SimpleCalc2();
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
	public SimpleCalc2() {
		setTitle("사칙연산계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtOp1 = new JTextField();
		panel.add(txtOp1);
		txtOp1.setColumns(10);
		
		labelSymbol = new JLabel("?");
		labelSymbol.setFont(new Font("굴림", Font.PLAIN, 18));
		panel.add(labelSymbol);
		
		txtOp2 = new JTextField();
		panel.add(txtOp2);
		txtOp2.setColumns(10);
		
		labelSymbol = new JLabel("=");
		panel.add(labelSymbol);
		txtResult = new JTextField();
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		txtOp1 = new JTextField();
		btnAdd = new JButton("+");
		btnAdd.addActionListener(this);
		panel.add(btnAdd);
		
		
		btnSubt = new JButton("-");
		btnAdd.addActionListener(this);
		panel.add(btnSubt);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(this);
		panel.add(btnMul);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		panel.add(btnDiv);
		
		btnReset = new JButton("reset");
		btnReset.addActionListener(this);
		panel.add(btnReset);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			//txtop1,txtop2 숫자를 가져오기
			getOp();
			//사칙연산 라벨 표시
			labelSymbol.setText("+");
			//txtResult 결과 표시
			txtResult.setText(String.valueOf(op1+op2));
		} else if (e.getSource()==btnSubt) {
			getOp();
			labelSymbol.setText("-");
			txtResult.setText(String.valueOf(op1-op2));
		}else if(e.getSource()==btnMul){
			getOp();
			labelSymbol.setText("*");
			txtResult.setText(String.valueOf(op1*op2));
		}else if(e.getSource()==btnDiv) {
			getOp();
			labelSymbol.setText("/");
			txtResult.setText(String.valueOf(op1*op2));		
		}	
	}

	public void getOp() {
			op1 = Integer.parseInt(txtOp1.getText());
			op2 = Integer.parseInt(txtOp2.getText());
	}
}
	
		
		

