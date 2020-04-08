package list;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class JListTest3 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest3 frame = new JListTest3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JListTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JList<String> list = new JList<>();
		list.setVisibleRowCount(5);
		list.setModel(new DefaultListModel<String>() {
			String [] values = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
			
			public String getElementAt(int index) {
				return values[index];
			}
			
			@Override
			public int getSize() {
				// TODO Auto-generated method stub
				return values.length;
			}
					 
		});
		scrollPane.setViewportView(list);
		pack();
		
	}
}
