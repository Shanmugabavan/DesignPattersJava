package Decorator_Design_Patter._2;

public class BomerianDecorator extends DogDecorator {
    private String color;
    private String type;

    public BomerianDecorator(Dog dog) {
        super(dog);
        this.color = "Brown";
        this.type = "Home";
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
