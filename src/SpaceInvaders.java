import javax.swing.JFrame;

public class SpaceInvaders {

	JFrame frame;
 final int height=500;
 final int width=500; 
	
	SpaceInvaders(){
		frame=new JFrame();
	}
	public static void main(String[] args) {
		SpaceInvaders si=new SpaceInvaders();
		si.setup();

	}
	public void setup() {
		frame.show();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
