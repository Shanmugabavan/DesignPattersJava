package PastPapers._2019.Q2;

public abstract class ShapeDecorator implements IShape {
    private IShape decoratedShape;

    public ShapeDecorator(IShape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public abstract void draw();

    public IShape getDecoratedShape() {
        return decoratedShape;
    }

    public void setDecoratedShape(IShape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
}
