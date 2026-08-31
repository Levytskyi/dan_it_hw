package java_hw_7.hw_task_2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> currentListOfStudents = new ArrayList<>();
        StudentHandler studentHandler = new StudentHandler();

        Student firstStudent = new Student(1, "Mykhailo Levytskyi", 34, 7.7);
        studentHandler.addStudent(currentListOfStudents, firstStudent);
        studentHandler.addStudent(currentListOfStudents, new Student(2, "Second Student", 25, 6.9));
        studentHandler.addStudent(currentListOfStudents, new Student(3, "Third Student", 27, 7.9));
        studentHandler.addStudent(currentListOfStudents, new Student(4, "Fourth Student", 45, 8.9));
        studentHandler.addStudent(currentListOfStudents, new Student(5, "Fifth Student", 15, 9.8));

        studentHandler.printAllStudents(currentListOfStudents);

        studentHandler.removeStudentById(currentListOfStudents, 2);

        studentHandler.printAllStudents(currentListOfStudents);

        System.out.println(studentHandler.findStudentByName(currentListOfStudents, "Mykhailo Levytskyi"));
    }
}
