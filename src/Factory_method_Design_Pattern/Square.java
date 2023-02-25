package Factory_method_Design_Pattern;

public class Square implements Shape {
    public Square(){

    }

    @Override
    public void raw_shape() {
        System.out.println("Square is created");
    }
}
