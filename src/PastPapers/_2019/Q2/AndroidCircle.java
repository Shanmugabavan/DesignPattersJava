package PastPapers._2019.Q2;

public class AndroidCircle implements IShape {
    private int x,y,radius;
    private DrawApi implement;

    public AndroidCircle(int x, int y, int radius,DrawApi implement) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.implement=implement;
    }

    @Override
    public void draw() {
        implement.draw(x,y,radius);
    }
}
