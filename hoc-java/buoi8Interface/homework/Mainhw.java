package homework;

public class Mainhw {
    public static void main(String[] args) {
        Student[] student = new Student[4];
       
        student[0].setName("Tran Van A ");
        student[0].setAge(22);
        student[0].setMarks(7);

        student[1].setName("Tran Van B ");
        student[1].setAge(12);
        student[1].setMarks(5);
        
        student[2].setName("Tran Van C ");
        student[2].setAge(21);
        student[2].setMarks(2);

        student[3].setName("Tran Van D ");
        student[3].setAge(32);
        student[3].setMarks(9);

        student[0].classify();
        student[0].display();

        student[1].classify();
        student[1].display();

        student[2].classify();
        student[2].display();

        student[3].classify();
        student[3].display();
    }
    
}
