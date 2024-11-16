package DataStructure.Lab1_OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String id, title, type, lecturer;
    private Student[] students;

    public Course(String id, String title, String type, String lecturer, Student[] students) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.lecturer = lecturer;
        this.students = students;
    }
    public String getLecturer() {
        return lecturer;
    }
    public Student[] getStudents() {
        return students;
    }
    public boolean checkGivenStudents(String nameInput){
        for(Student student : students){
            if(nameInput.equalsIgnoreCase(student.getName())){
                return true;
            }
        }
        return false;
    }
    public int countStudentsEnrolledGivenYear(int yearInput){
        int countStudents = 0;
        for(Student student : students){
            if(yearInput == student.getYear()){
                countStudents++;
            }
        }
        return countStudents;
    }

    public int countStudentsInCourse() {
        int countStudents = 0;
            for (Student student : students) {
                countStudents++;
            }
        return countStudents;
    }
    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", lecturer='" + lecturer + '\'' + '\n' +
                ", students=" + Arrays.toString(students) +
                '}' + '\n';
    }
}
