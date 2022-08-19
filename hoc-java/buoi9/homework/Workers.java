package homework;

public class Workers {
    private String name;
    private String position;
    
    public Workers(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Nhan vien: " + name + ", lam viec tai vi tri: " + position ;
    }
    
}
