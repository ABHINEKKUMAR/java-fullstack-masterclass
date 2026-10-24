// StudentDemo: ICSE Java worked example.
public class StudentDemo {
    public static void main(String[] args) {
        Student student=new Student("Riya",95);student.display();
    }
}
class Student {
    private String name; private int marks;
    Student(String name,int marks){this.name=name;this.marks=marks;}
    void display(){System.out.println(name+" scored "+marks);}
}
