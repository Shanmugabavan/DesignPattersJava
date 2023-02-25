package Factory_method_Design_Pattern;

public abstract class Factory {
    public Shape anOperation(int i){
        Shape shape=createShape(i);
        return shape;
    }

    public abstract Shape createShape(int i);
}
