import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;





GameObject(int x, int y, int width, int height){
	x=2;
	y=2;
	width=5;
	height=5;
}

public void draw(Graphics g) {
    g.fillRect(10, 10, 100, 100);

}
}
