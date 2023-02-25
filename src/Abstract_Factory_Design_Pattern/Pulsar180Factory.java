package Abstract_Factory_Design_Pattern;

public class Pulsar180Factory extends BajajFactory{
    @Override
    public Head getHead() {
        System.out.println("pulsar180 Head is created");
        return new Head_pulsar180();
    }

    @Override
    public Wheel getWheel() {
        System.out.println("pulsar180 Wheel is created");
        return new Wheel_pulsar180();
    }
}
