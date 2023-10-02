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

        Student one = new Student();
        one.printEverything();
        one.name = "Ridh";
        System.out.println("Changed name:"+one.name);
    }
}
class Student {
    int roll;
    float marks;
    String name;

    Student(){
        this("Deafult name", 0, 100.0f);
    }
    Student(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void printEverything() {
        System.out.println("NAME:"+this.name);
        System.out.println("ROLL:"+this.roll);
        System.out.println("MARKS:"+this.marks);
    }

}
