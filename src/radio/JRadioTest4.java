package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class JRadioTest4 extends JFrame implements ItemListener,ActionListener {
	private JPanel contentPane;
	private JRadioButton menu1, menu2, menu3, rdoSmall,
	rdoMedium, rdoLarge,toping1,toping2,toping3,toping4;
	private JLabel lbl,pay;
	private JButton btnOrder, btnCancel;
	private ButtonGroup group1,group2,group3;
	private String pizza,topping,size;
	private int money;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest4 frame = new JRadioTest4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JRadioTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("자바 피자에 오신 것을 환영합니다.");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		btnOrder = new JButton("주문");
		btnOrder.addActionListener(this);
		panel_1.add(btnOrder);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		panel_1.add(btnCancel);
		
		lbl = new JLabel("금액 :");
		panel_1.add(lbl);
		
		pay = new JLabel("");
		panel_1.add(pay);
		
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3 = new JPanel();		
		panel_3.setBorder(new TitledBorder(null, "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdoSmall = new JRadioButton("Small");
		panel_3.add(rdoSmall);
		rdoMedium = new JRadioButton("Medium");
		panel_3.add(rdoMedium);
		rdoLarge = new JRadioButton("Large");
		panel_3.add(rdoLarge);
		
		panel_2.add(panel_3);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\uCD94\uAC00\uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		toping1 = new JRadioButton("피망");
		panel_4.add(toping1);
		toping2 = new JRadioButton("치즈");
		panel_4.add(toping2);
		toping3 = new JRadioButton("페퍼로니");
		panel_4.add(toping3);
		toping4 = new JRadioButton("베이컨");
		panel_4.add(toping4);
		
		panel_2.add(panel_4);

		
		JPanel panel_5 = new JPanel();	
		panel_5.setBorder(new TitledBorder(null, "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));	
		
		menu1 = new JRadioButton("콤보");
		menu1.setToolTipText("");
		panel_5.add(menu1);
		menu2 = new JRadioButton("포테이토");
		panel_5.add(menu2);
		menu3 = new JRadioButton("불고기");
		panel_5.add(menu3);
		
		panel_2.add(panel_5);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(menu1);
		group1.add(menu2);
		group1.add(menu3);
		
		menu1.addItemListener(this);
		menu2.addItemListener(this);
		menu3.addItemListener(this);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(toping1);
		group2.add(toping2);
		group2.add(toping3);
		group2.add(toping4);
		
	
		toping1.addItemListener(this);
		toping2.addItemListener(this);
		toping3.addItemListener(this);
		toping4.addItemListener(this);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdoSmall);
		group3.add(rdoMedium);
		group3.add(rdoLarge);
		
		rdoSmall.addItemListener(this);
		rdoMedium.addItemListener(this);
		rdoLarge.addItemListener(this);
		btnOrder.addActionListener(this);
		btnCancel.addActionListener(this);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//종류 : 콤보(10000), 포테이토(12000), 불고기(13000) 
		//추가토핑 : 피망(2000), 치즈(2000), 페페로니(1000), 베이컨(3000)
		//크기 : small(1000), medium(2000), large(3000)
//		JButton btn = (JButton) e.getSource();
		AbstractButton btn = (AbstractButton)e.getSource();
		if(btn == btnCancel) {
			money=0;
			group1.clearSelection();
			group2.clearSelection();
			group3.clearSelection();
			pay.setText("");
		}else { //btnConfirm
			if(pizza==null || topping == null || size == null) {
				JOptionPane.showConfirmDialog(getParent(),"주문이 완료되지 않았습니다." , "주문완료",
						JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			}else {
				if(btn == btnOrder) {
					String option[] = {"주문","변경","취소"};
					JOptionPane.showOptionDialog(this, "종류 : "+ pizza + "\n토핑 : " + topping +"\n크기 : "
							+ size + "\n 가격은 "+pay+"입니다. 주문하시겠습니까?","주문내역", 
							JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null,option, option[0]);
				}
			}
			
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton)e.getItem();
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(radio==menu1) {
				money+=1000;
				pizza = radio.getText();
			} else if (radio==menu2) {
				money+=2000;
				pizza = radio.getText();
			} else if (radio==menu3){
				money+=3000;
				pizza = radio.getText();
			} else if(radio==toping1){
				money+=2000;
				pizza = radio.getText();
			} else if(radio==toping2) {
				money+=2000;
				pizza = radio.getText();
			} else if (radio==toping3) {
				money+=1000;
				pizza = radio.getText();
			} else if (radio==toping4) {
				money+=3000;
				pizza = radio.getText();
			} else if (radio==rdoSmall) {
				money+=1000;
				pizza = radio.getText();
			} else if (radio==rdoMedium) {
				money+=2000;
				pizza = radio.getText();
			} else if (radio==rdoLarge) {
				money+=3000;
				pizza = radio.getText();
			}
		}else {
			if(radio==menu1) {
				money-=1000;
			} else if (radio==menu2) {
				money-=2000;
			} else if(radio==menu3){
				money-=3000;
			} else if(radio==toping1) {
				money-=2000;
			} else if(radio==toping2) {
				money-=2000;
			} else if(radio==toping3) {
				money-=1000;
			} else if(radio==toping4) {
				money-=3000;
			} else if(radio==rdoSmall) {
				money-=1000;
			} else if(radio==rdoMedium) {
				money-=2000;
			} else if(radio==rdoLarge) {
				money-=3000;
			}
		}
		lbl.setText(String.valueOf(money+"원"));
	}
}
