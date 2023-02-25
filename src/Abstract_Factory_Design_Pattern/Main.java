package Abstract_Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        BajajFactory bajajFactory1=new Pulsar180Factory();
        BajajFactory bajajFactory2=new Pulsar220Factory();

        bajajFactory1.getHead();
        bajajFactory1.getWheel();
        bajajFactory2.getHead();
        bajajFactory2.getWheel();

    }
}
