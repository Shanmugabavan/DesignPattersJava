package Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();

        factory.createBiscuit("Rec");
        factory.createBiscuit("Rec");
        factory.createBiscuit("Squ");

    }
}
