package exam;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x=100, img_y=100;
	
	public MyPanel() {
		URL url = getClass().getResource("car.gif");
		try {
			img = ImageIO.read(new File(url.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			// keyPressed 에서만 작업 할께요 
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
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

public class CarGame extends JFrame{  // jpanel 자체는 포커스를 가질수 없다. 
	public CarGame(){
		 setTitle("자동차 움직이기");
		 setSize(300,300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 add(new MyPanel());
	 }
	
	public static void main(String[] args) {
		CarGame car = new CarGame();
		car.setVisible(true);
	}
}
