package exam;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel implements MouseListener{
	BufferedImage img = null;
	int img_x=100, img_y=100;
	
	public MyPanel2() {
		URL url = getClass().getResource("car.gif");
		try {
			img = ImageIO.read(new File(url.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}

			@Override
			public void mousePressed(MouseEvent e) {
				img_x = e.getY();
				img_y = e.getY();
				repaint();
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

				repaint();  //☆☆☆☆
			}
		});
		
		// 포커스 요청하기
		this.requestFocus();
		setFocusable(true); 
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);  // 이 코드는 직접적으로 호출할 수 없당  ☆☆☆☆
		g.drawImage(img,img_x,img_y,null);  // 이 메소드로 자동차 하나 그려낸거라 생각해
	}


	// 사용자가 4방향의 화살표를 클릭한 경우 
}

public class CarGame2 extends JFrame{  // jpanel 자체는 포커스를 가질수 없다. 
	public CarGame2(){
		 setTitle("자동차 움직이기");
		 setSize(300,300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 add(new MyPanel2());
	 }
	
	public static void main(String[] args) {
		CarGame2 car = new CarGame2();
		car.setVisible(true);
	}
}
