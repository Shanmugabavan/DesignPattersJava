package PastPapers._2019.Q2;

public class Testing {
    public static void main(String[] args) {
        IShape circle1=new AndroidCircle(10,11,12,new AndroidCircleImp());
        IShape circle2=new AppleCircle(13,14,15,new AppleCircleImp());

        IShape circle3=new AndroidCircleDecorator(circle1,"Black","Dot Dot");
        IShape circle4=new AppleCircleDecorator(circle2,"Blue","Solid");

        circle1.draw();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        circle2.draw();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        circle3.draw();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        circle4.draw();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
