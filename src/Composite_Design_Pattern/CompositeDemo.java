package Composite_Design_Pattern;

public class CompositeDemo {
    public static void main( String[] args ) {
        Composite first  = new Row( 1 );
        Composite second = new Column( 2 );
        Composite third  = new Column( 3 );
        Composite fourth = new Column( 4 );
        Composite fifth  = new Column( 5 );
        first.add( second );
        first.add( third  );
        third.add( fourth );
        third.add( fifth  );
        first.add(  new Primitive( 6 ) );
        second.add( new Primitive( 7 ) );
        third.add(  new Primitive( 8 ) );
        fourth.add( new Primitive( 9 ) );
        fifth.add(  new Primitive(10 ) );
        first.traverse();
    }
}
