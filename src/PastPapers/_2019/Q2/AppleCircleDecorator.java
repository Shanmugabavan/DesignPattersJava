package PastPapers._2019.Q2;

public class AppleCircleDecorator extends ShapeDecorator {
    private String color;
    private String boarderStyle;

    public AppleCircleDecorator(IShape decoratedShape, String color, String boarderStyle) {
        super(decoratedShape);
        this.color = color;
        this.boarderStyle = boarderStyle;
    }

    @Override
    public void draw() {
        super.getDecoratedShape().draw();System.out.println("Decorated Apple Circle");
        super.getDecoratedShape().draw();
        System.out.println(color);
        System.out.println(boarderStyle);
    }
}
