package homework1;

public class Mainhw {
    public static void main(String[] args) {
        Student student = new Student();
       
        student.setName("Tran Van A ");
        student.setAge(22);
        student.setMarks(7);

        student.classify();
        student.display();
    }
    
}
