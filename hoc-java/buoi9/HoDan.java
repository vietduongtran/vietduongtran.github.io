import java.util.ArrayList;

public class HoDan {
    private int numberOfMembers;
    private String houseNumber;
    private ArrayList<Person> people;
   
    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    @Override
    public String toString() {
        return "HoDan [houseNumber=" + houseNumber + ", numberOfMembers=" + numberOfMembers + ", people=" + people
                + "]";
    }
    

}
