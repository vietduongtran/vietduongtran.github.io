public class Rectangle implements Polygon {
    
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calArea() {
        // TODO Auto-generated method stub
        System.out.println("Dien tich cua rectangle = " + length*width);
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Chieu dai= " + length + ", chieu ngang = " + width);

    }


}
