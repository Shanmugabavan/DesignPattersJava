package Factory_method_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Factory fac=new RectangleFactory();
        Factory fac2=new SquareFactory();
        fac.anOperation(1);
        fac2.anOperation(1);
    }
}
