package Composite_Design_Pattern;

import java.util.ArrayList;

abstract class Composite implements Component {
    private ArrayList<Component>  parts = new ArrayList<Component>();
    private int total = 0;
    private int value;
    public Composite( int val )    { value = val; }
    public void add( Component c ) {
        total++;
        parts.add(c);
    }
    public void traverse() {
        System.out.print( value + "  " );
        for (int i=0; i < total; i++){
            (parts.get(i)).traverse();
        }
    }
    public int getValue()		{return value;}
}
