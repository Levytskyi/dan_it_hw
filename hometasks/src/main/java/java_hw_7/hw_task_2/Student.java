package java_hw_7.hw_task_2;

public class Student {
    private int id;
    private String name;
    private int age;
    private double averageGradePoint;

    public Student(int id, String name, int age, double averageGradePoint) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.averageGradePoint = averageGradePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGradePoint() {
        return averageGradePoint;
    }

    public void setAverageGradePoint(double averageGradePoint) {
        this.averageGradePoint = averageGradePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", averageGradePoint=" + averageGradePoint +
                '}';
    }
}
