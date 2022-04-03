package three.tclass;

public class Main {
    public static void main(String[] args) {
        student student=new Student();
        teacher teacher=new Teacher();
        employee employee=new Employee();

        student.ShowRole();
        teacher.ShowRole();
        employee.ShowRole();
        
    }
}