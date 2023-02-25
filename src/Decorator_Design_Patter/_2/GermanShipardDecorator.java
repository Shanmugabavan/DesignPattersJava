package Decorator_Design_Patter._2;

public class GermanShipardDecorator extends DogDecorator {
    private String color;
    private String type;
    public GermanShipardDecorator(Dog dog) {
        super(dog);
        this.color="Black";
        this.type="Wild";
    }

    @Override
    public void getProperties() {
        super.getProperties();
        this.getAdditionalProperties();
    }

    public void getAdditionalProperties(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
