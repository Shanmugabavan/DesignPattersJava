package PastPapers._2019.Q2;

public class AndroidCircleDecorator extends ShapeDecorator {
    private String color;
    private String boarderStyle;

    public AndroidCircleDecorator(IShape decoratedShape, String color, String boarderStyle) {
        super(decoratedShape);
        this.color = color;
        this.boarderStyle = boarderStyle;
    }

    @Override
    public void draw() {
        System.out.println("Decorated Android Circle");
        super.getDecoratedShape().draw();
        System.out.println(color);
        System.out.println(boarderStyle);

    }
}
