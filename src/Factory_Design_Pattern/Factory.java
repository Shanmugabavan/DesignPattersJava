package Factory_Design_Pattern;

public class Factory {
    public Factory(){

    }

    public Shape createBiscuit(String shapeString){
        if (shapeString.equals("Rec")){
            Shape shape=new Rectangle();
            shape.raw_shape();
            return shape;
        }
        else if (shapeString.equals("Squ")){
            Shape shape=new Square();
            shape.raw_shape();
            return shape;
        }
        else {
            return null;
        }
    }
}
