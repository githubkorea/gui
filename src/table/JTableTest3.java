package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JTableTest3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTable table;
	private DefaultTableModel model;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableTest3 frame = new JTableTest3();
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
	public JTableTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("이름");
		panel.add(lblNewLabel);
		
		txtName = new JTextField();
		panel.add(txtName);
		txtName.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("나이");
		panel.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		panel.add(txtAge);
		txtAge.setColumns(5);
		
		JLabel lblNewLabel_2 = new JLabel("성별");
		panel.add(lblNewLabel_2);
		
		txtGender = new JTextField();
		panel.add(txtGender);
		txtGender.setColumns(5);
		
		JButton btnInput = new JButton("입력");
		panel.add(btnInput);
		
		JButton btndel = new JButton("삭제");
		panel.add(btndel);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//컴럼명 작성
		String columnNames[]= {"이름","나이","성별"};
		model = new DefaultTableModel(columnNames,0);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		btnInput.addActionListener(this);
		btndel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd.equals("입력")) {
			// 사용자가 입력한 이름,나이,성별 가져오기
			String name = txtName.getText();
			String age = txtAge.getText();
			String gender = txtGender.getText();
			
			// 모델에 추가하기
			model=(DefaultTableModel)table.getModel(); 
			//	TableModel model = table.getModel();
			// 만든 테이블 모델로 사용하면 훨씬더 많은걸 사용할수있음.
			//	Object rowData[]= {name,age,gender};
			//		model.addRow(rowData);
			Vector<String> rowData=new Vector<String>();
			rowData.add(name);
			rowData.add(age);
			rowData.add(gender);
			model.addRow(rowData);
		
			// 다른 데이터를 입력할 수 있도록 기존 데이터 삭제하기
			txtName.setText("");
			txtAge.setText("");
			txtGender.setText("");
		}else { //삭제
			int selectRow = table.getSelectedRow();
			model.removeRow(selectRow);
		}
	}

}
