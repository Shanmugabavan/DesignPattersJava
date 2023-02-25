package Decorator_Design_Patter._2;

public abstract class DogDecorator implements Dog{
    private Dog dog;

    public DogDecorator(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void getProperties() {
        dog.getProperties();

    }
}
