package Composite_Design_Pattern;

class Column extends Composite {
    public Column( int val ) { super( val ); }
    public void traverse() {
        System.out.print( "Col" );
        super.traverse();
    }  }
