package PastPapers._2019.Q2;

public class AppleCircle implements IShape {
    private int x,y,radius;
    private DrawApi implement;

    public AppleCircle(int x, int y, int radius,DrawApi implement) {
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
