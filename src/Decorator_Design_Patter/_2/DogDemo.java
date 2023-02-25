package Decorator_Design_Patter._2;

public class DogDemo {
    public static void main(String[] args) {
        Dog germanShipard=new GermanShipardDecorator(new DogIm("GermanShipard"));
        Dog bomerian=new BomerianDecorator(new DogIm("Bomerian"));

        germanShipard.getProperties();
        bomerian.getProperties();
    }
}
