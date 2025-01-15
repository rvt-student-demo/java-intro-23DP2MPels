package lv.rvt;

public class Box {

    public double width;
    public double height;
    public double length;
    public double side;

    public Box( Box oldBox ) {
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

    public Box( double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box( double side ) {
        this.height = this.length = this.width = side;
    }

    public double length(){
        return this.length;
    }
    public double height(){
        return this.height;
    }
    public double width(){
        return this.width;
    }

    public double volume() {
        return this.height * this.width * this.length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;
    }

    private double faceArea() {
        return this.height * this.width;
    }
    private double topArea() {
        return this.length * this.width;
    }
    private double sideArea() {
        return this.width * this.height;
    }

    public Box biggerBox( Box oldBox ) {
        return new Box( 1.25*oldBox.width(),1.25*oldBox.height(),1.25*oldBox.length() );
    }

    /* parbauda vai kast jeb this. ielīd kaste outsideBox. piemērs: box2 1x1x1 (this.) ielīd box 2x2x2 (outsideBox.) box.nests(box) */
    public boolean nests( Box outsideBox ) {
        if (this.height < outsideBox.height() && this.width < outsideBox.width() && this.length < outsideBox.length()) {
            return true;
        }
        return false;    
    }

}
