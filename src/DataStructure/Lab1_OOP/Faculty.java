package DataStructure.Lab1_OOP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Faculty {
    private String name, address;
    private Course[] courses;

    public Faculty(String name, String address, Course[] courses) {
        this.name = name;
        this.address = address;
        this.courses = courses;
    }

    public int countStudentsFacultyInGivenYear(String nameInputFaculty, int yearInputFaculty) {
        int countStudents = 0;
        if (nameInputFaculty.equals(this.name)) {
            HashSet<String> uniqueStudentNames = new HashSet<>();
            for (Course course : courses) {
                for (Student student : course.getStudents()) {
                    if (student.getYear() == yearInputFaculty && !uniqueStudentNames.contains(student.getName())) {
                        uniqueStudentNames.add(student.getName());
                        countStudents++;
                    }
                }
            }
        }
        return countStudents;
    }

    public Course getHighestStudents(){
        ArrayList<Integer> listStudents = new ArrayList<>();
        Course result = null;
        for(Course course : courses){
            listStudents.add(course.countStudentsInCourse());
        }
        for (int i = 0; i < listStudents.size() - 1; i++) {
            if(listStudents.get(i) >= listStudents.get(i+1)){
                result = courses[i];
            } else {
                result = courses[i+1];
            }
        }
        return result;
    }
    public ArrayList<Course> getAllCoursesByGivenLecturer(String nameLecturerInput) {
        ArrayList<Course> listCourses = new ArrayList<>();
            for (Course course : courses) {
                if (nameLecturerInput.equals(course.getLecturer())) {
                    listCourses.add(course);
                }
            }
        return listCourses;
    }
}
