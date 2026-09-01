package java_hw_7.hw_task_2;

import java.util.List;

public class StudentHandler {

    public List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }

    public List<Student> removeStudentById(List<Student> students, int id) {
        if (students.removeIf(studentById -> studentById.getId() == id)) {
            System.out.println("Student with id <" + id + "> has been removed!");
        } else {
            System.out.println("Student hasn't been removed!");
        }
        return students;
    }

    public Student findStudentByName(List<Student> students, String name) {
        Student student = null;
        for (Student currentStudent : students) {
            if (currentStudent.getName().equals(name)) {
                student = currentStudent;
                break;
            }
        }
        if (student == null) {
            System.out.println("Student hasn't been found!");
        }
        return student;
    }

    public void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
