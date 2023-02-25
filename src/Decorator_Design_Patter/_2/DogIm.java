package Decorator_Design_Patter._2;

public class DogIm implements Dog {
    private String name;

    public DogIm(String name) {
        this.name = name;
    }

    @Override
    public void getProperties() {
        System.out.println(this.name);
    }
}
