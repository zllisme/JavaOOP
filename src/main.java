import model.Student;

public class main {
    public static void main(String[] args) {
        Student student = new Student("Mike", 21, "male", "88888");
        System.out.println("name:" + student.getName());
        System.out.println("age:" + student.getAge());
        System.out.println("sex:" + student.getSex());
        System.out.println("studentNumber:" + student.getStudentNumber());
    }
}
