package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class KeyEventTest2 extends JFrame implements KeyListener{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyEventTest2 frame = new KeyEventTest2();   // KeyAdepter() 는 클래스야. KeyListener는 인터페이스
					frame.setVisible(true); 					 // 키 리스터를 임플리먼트 하면 메소드가 3개 생성되는데 어뎁터 하나로 받을수 있는 이유
				} catch (Exception e) {							 // ~~LIstener 는 인터페이스  / ~~Adepter 는 클래스 필요한 것만 끌어다 쓰려면 어뎁터사용  
					e.printStackTrace(); 						
				}
			}
		});
	}

	public KeyEventTest2() {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 이용하여 입력을 하는 경우
		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 사용자가 키를 누르면 발생
		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키에서 손을 뗄때 발생 
		System.out.println("keyReleased");
	}

}
