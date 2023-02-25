package Composite_Design_Pattern;

class Row extends Composite {
    public Row( int val ) { super( val ); }
    public void traverse() {
        System.out.print( "Row" );
        super.traverse();
    }
}
