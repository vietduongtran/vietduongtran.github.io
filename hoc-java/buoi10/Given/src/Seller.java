import java.util.ArrayList;

public class Seller extends Employee {  

    private double revenue;

    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;

    }
    
    /**
     * @param revenue the revenue to set
     */
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }


    public double getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "Seller revenue = " + revenue + "]";
    }

    
    public Seller(String name, double salary) {
        super(name, salary);
        //TODO Auto-generated constructor stub

    }

    public double getSalary() {
        if(revenue<4000) 
        return (super.getSalary() + revenue*0.05);

        return (super.getSalary() + revenue*0.1);
    }
    }

