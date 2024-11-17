package EX19;

import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> sts;

    public StudentManagement(Student[] sts) {
        this.sts = new ArrayList<>();
    }

    public void addStudent(Student students) {
        System.out.println("Đã thêm? " + sts.add(students));
    }

    public String findNameStudent(String nameSts) {
        for (Student student : sts) {
            String result = student.findNameStudent(nameSts);
            if (!result.equals("Không tìm thấy sinh viên đó")) {
                return result;
            }
        }
        return "Không tìm thấy sinh viên đó";
    }

    public double avgScore() {
        for (Student student : sts) {
            double result = student.avgScore();
            return result;
        }
        return 0.0;
    }
    public void displayStudent(){
        System.out.println("Danh sách học sinh: ");
        for (int i = 0; i < sts.size(); i++) {
            if(sts.get(i) != null){
                System.out.println("Học sinh " + (i+1) + ":");
                System.out.println(sts.get(i));
                System.out.println("-----------------------------");
            }
        }
    }
    public void sortByScore() {
        double maxScoreValue = Double.MIN_VALUE;
        Student studentWithMaxScore = null;
        for (Student student : sts) {
            double studentMaxScore = student.getMaxScore();
            if (studentMaxScore > maxScoreValue) {
                maxScoreValue = studentMaxScore;
                studentWithMaxScore = student;
            }
        }
        if (studentWithMaxScore != null) {
            displayStudent();
        }
    }

}

