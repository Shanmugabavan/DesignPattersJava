package Factory_method_Design_Pattern;

public class RectangleFactory extends Factory {
    @Override
    public Shape createShape(int i) {
        System.out.println("Rectangle Created");
        return new Rectangle();

    }
}
