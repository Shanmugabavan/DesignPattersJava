package PastPapers._2019.Q2;

public class AppleCircleImp implements DrawApi{

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing Apple Cirlce");
        System.out.println(x);
        System.out.println(y);
        System.out.println(radius);
    }
}
