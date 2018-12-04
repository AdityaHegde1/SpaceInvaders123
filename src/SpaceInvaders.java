import javax.swing.JFrame;

public class SpaceInvaders {

	JFrame frame;
 final int height=500;
 final int width=500; 
 GamePanel gp=new GamePanel();
	SpaceInvaders(){
		frame=new JFrame();
		
	}
	public static void main(String[] args) {
		SpaceInvaders si=new SpaceInvaders();
		si.setup();

	}
	public void setup() {
frame.show();
frame.setSize(width, height);
frame.add(gp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gp.startGame();
		gp.addKeyListener(gp);
		frame.addKeyListener(gp);

	}
}
