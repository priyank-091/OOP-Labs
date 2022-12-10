class Student implements Cloneable {
    int id;

    Student(int x) {
        id = x;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class CloneDemo {
    public static void main(String args[]) {
        Student s1 = new Student(121);

        Student s2 = null;
        try {
            s2 = (Student) s1.clone();
            System.out.println("Successful");
        } catch (CloneNotSupportedException cnse) {
            System.out.println("Error in cloning");
        }
    }
}