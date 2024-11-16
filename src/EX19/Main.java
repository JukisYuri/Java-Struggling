package EX19;


public class Main {
    public static void main(String[] args){
        score s1 = new score(1 ,"Van", 8.2);
        score s2 = new score(2, "Toan", 7.9);
        score s3 = new score(3, "English", 8.6);
        StudentManagement S = new StudentManagement(new Student[3]);
        Student stu1 = new Student("Nguyen Van A", 1, "24/5/2005", new score[]{s1, s2});
        Student stu2 = new Student("Nguyen Van B", 1, "12/3/2005", new score[]{s1, s3});
        S.addStudent(stu1);
        S.addStudent(stu2);
        System.out.println(S.findNameStudent("Nguyen Van A"));
        System.out.println(S.findNameStudent("Nguyen Van B"));
        System.out.println("Điểm trung bình SV1: " + S.avgScore());
        System.out.println("Điểm trung bình SV2: " + S.avgScore());
        S.sortByScore();

    }

}
