class Student {
    private int id;
    private String name;
    private int age;
    private int[] marks = { 0, 0, 0 };

    public Student(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setMarks(int m1, int m2, int m3) {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    public void studentDetails() {
        System.out.println("Name: " + this.name + " ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.print("Marks =");
        for (int mark : marks) {
            System.out.print(" " + mark);
        }
        System.out.println();
    }
}

public class p5 {
    public static void main(String[] args) {
        Student raj = new Student(105, "Raj", 21);
        Student gopal = new Student(109, "Gopal", 23);
        raj.setMarks(67, 90, 65);
        gopal.setMarks(70, 75, 55);
        raj.studentDetails();
        gopal.studentDetails();
    }
}
