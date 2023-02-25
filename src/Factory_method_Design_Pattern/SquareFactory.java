package Factory_method_Design_Pattern;

public class SquareFactory extends Factory {
    @Override
    public Shape createShape(int i) {
        System.out.println("Squre Created");
        return new Square();
    }
}
