package LinkedList;

public class Student {
    public String name;
    public int course;


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
