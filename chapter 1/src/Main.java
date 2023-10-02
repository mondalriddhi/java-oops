public class Main {
    public static void main(String[] args) {
        Student stud1;
        stud1 = new Student();
        stud1.roll=7;
        stud1.marks=56.4f;
        stud1.name="Garud Commando";
        System.out.println(stud1.name);
        System.out.println(stud1.roll);
        System.out.println(stud1.marks);
    }
}
class Student {
    int roll;
    float marks;
    String name;
}
