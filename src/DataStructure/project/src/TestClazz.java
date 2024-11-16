package DataStructure.project.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestClazz {
    public static void main(String[] args) throws IOException {
        // Task 1
        String fileName = "src/DataStructure/project/data/students.txt";
        Clazz clazz = new Clazz("DH23DT", "2023");
        clazz.loadStudents(fileName);
        System.out.println("Data: " + clazz.getStudents());
        // Task 2
        clazz.sortStudents(Comparator.comparing(Student::getGPA).reversed());
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo GPA giảm dần:");
        // Task 3
        System.out.println(clazz.getStudents());
        List<Student> studentChoosenList = clazz.getTopNStudents(3);
        System.out.println("Top 3 sinh viên có GPA cao nhất: " + '\n' + studentChoosenList);
        // Task 4
        ArrayList<Student> studentRandomChoosenList = clazz.getRandomNStudents(5);
        System.out.println("Lấy ngẫu nhiên 5 bạn: " + '\n' + studentRandomChoosenList);
        // Task 5
        boolean removeStudentById = clazz.removeStudent("23130110");
        System.out.println("Đã xoá 1 bạn có ID 23130110: " + removeStudentById);
        // Task 6
        ArrayList<Student> listStudentByBirthYear = clazz.getStudentByBirthYear(1997);
        System.out.println("Danh sách sinh viên theo năm sinh: " + '\n' + listStudentByBirthYear);
        // Task 7
        ArrayList<Student> listStudentsSameBirthInCurrentMonth = clazz.getStudentsHavingBirthdaysInCurrentMonth();
        System.out.println("Danh sách sinh viên sinh năm cùng tháng hiện tại: " + "\n" + listStudentsSameBirthInCurrentMonth);
        // Task 9
        Student oldestStudent = clazz.getOldestStudent();
        System.out.println("Sinh viên lớn tuổi nhất: " + '\n' + oldestStudent);
        // Task 10
        Student highestGpaStudentInGivenYear  = clazz.getHighestGPAStudent(2023);
        System.out.println("Sinh viên có GPA cao nhất trong năm nhập học 2023: " + '\n' + highestGpaStudentInGivenYear);
    }
}
