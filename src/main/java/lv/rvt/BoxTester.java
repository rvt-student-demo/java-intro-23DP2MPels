package lv.rvt;

public class BoxTester {
    public static void main ( String[] args )
    {
    Box box = new  Box(2.5, 5.0, 6.0 ) ;
    
    Box box2 = box.biggerBox(box);
    
    System.out.println( "length: " + box.length + " height: " + box.height + " width: " + box.width )  ;
    System.out.println( "length: " + box2.length + " height: " + box2.height + " width: " + box2.width )  ;

    boolean answer = box.nests(box2);

    System.out.println(answer);
    }
}
