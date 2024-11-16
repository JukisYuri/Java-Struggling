package EX26.src;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String mssv;
    private String tenSV;
    private List<Course> courses;

    public Student(String mssv, String tenSV) {
        this.mssv = mssv;
        this.tenSV = tenSV;
        this.courses = new ArrayList<>();
    }

    public String getMssv() {
        return mssv;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void addCourse(String tenMH, double diem) {
            courses.add(new Course(tenMH, diem));

    }

    public List<Course> getCourses() {
        return courses;
    }
    public void addScore(String tenMH, double diem){
        courses.add(new Course(tenMH, diem));
    }
}
