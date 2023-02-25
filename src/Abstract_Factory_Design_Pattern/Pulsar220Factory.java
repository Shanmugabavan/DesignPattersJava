package Abstract_Factory_Design_Pattern;

public class Pulsar220Factory extends BajajFactory{
    @Override
    public Head getHead() {
        System.out.println("pulsar220 Head is created");
        return new Head_pulsar220();
    }

    @Override
    public Wheel getWheel() {
        System.out.println("pulsar220 Head is created");
        return new Wheel_pulsar220();
    }
}
