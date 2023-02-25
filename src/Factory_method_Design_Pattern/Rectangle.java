package Factory_method_Design_Pattern;

public class Rectangle implements Shape {
    public Rectangle() {

    }

    @Override
    public void raw_shape() {
        System.out.println("Rectangle created");
    }
}
