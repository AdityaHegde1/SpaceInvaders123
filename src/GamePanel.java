

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener {
Timer timer;
GameObject go = new GameObject(5, 5, 5, 5);
	
	
	
	public GamePanel(){
	timer=new Timer(1000/60,this);
	
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("why");
		go.update();
		if ()
repaint();
	}
	@Override

	public void paintComponent(Graphics g){
go.draw(g);

	                

	        }
	public void startGame() {
		timer.start();
		
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("typed");
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed");
		if (e.getKeyCode() == KeyEvent.VK_UP) {

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship1.y += 25;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship1.x -= 25;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship1.x += 25;
		}
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("released");
	}
}
