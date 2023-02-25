package Composite_Design_Pattern;

class Primitive implements Component {
    private int value;
    public Primitive( int val ) { value = val; }
    public void traverse()      { System.out.print( value + "  " ); }
    public int getValue()		{return value;}
}
