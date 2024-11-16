package DataStructure.Lab1_OOP;

public class testFaculty {
    public static void main(String[] args){
        Student S1 = new Student("112", "Nguyễn Văn Hiếu", 2004);
        Student S2 = new Student("113", "Võ Dương Trà Mi", 2005);
        Student S3 = new Student("114", "Jukis Yuri", 2005);
        Student S4 = new Student("115", "Yukis Mike", 2005);
        Student S5 = new Student("116", "Iju Ryy", 2007);
        Student[] students = {S1,S2,S3};
        Student[] students2 = {S4,S5};
        Course C1 = new Course("12", "Advance Programming", "Dev", "A", students);
        Course C2 = new Course("15", "Basic Programming", "Basic Dev", "B", students2);
        Course C3 = new Course("13", "Data Structures & Algorithms", "...", "A", students2);
        Course[] courses = {C1,C2,C3};
        Faculty F1 = new Faculty("IT", "ABC", courses);
        boolean isFound = C1.checkGivenStudents("nguyễn văn hiếu");
        System.out.println("Kết quả tìm kiếm: " + isFound); // Câu 2
        System.out.println("Số lượng sinh viên ở năm 2005: " + C1.countStudentsEnrolledGivenYear(2005)); // Câu 3
        System.out.println("Số lượng sinh viên trong khoa ở năm 2005: " + F1.countStudentsFacultyInGivenYear("IT", 2005)); // Câu 4
        System.out.println(F1.getHighestStudents()); // Câu 5
        System.out.println(F1.getAllCoursesByGivenLecturer("A")); // Câu 6
    }
}
