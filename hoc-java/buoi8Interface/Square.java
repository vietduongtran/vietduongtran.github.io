public class Square implements Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calArea() {
        // TODO Auto-generated method stub
        System.out.println("Square = " + side*side);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Moi ben cua hinh vuong = " + side);
    }
}
