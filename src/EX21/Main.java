package EX21;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ten1","2005",7,8,9));
        students.add(new Student("Ten2","2004",10,8,4));
        ArrayList<Staff> staffs = new ArrayList<>();
        staffs.add(new Staff("Ten3","1995",20000, "2/3/2015", new PhongBan("Ma1", "Ten1")));
        staffs.add(new Staff("Ten4","1992",30000, "2/3/2015", new PhongBan("Ma2", "Ten2")));
        staffs.add(new Staff("Ten5","1995",25000, "2/2/2015", new PhongBan("Ma3", "Ten3")));
        TruongDaiHoc TDH = new TruongDaiHoc(students, staffs);
        TDH.printStaffList();
        TDH.printStudentList();
        TDH.printStaffSalary();
        TDH.sortStaffSalary();
    }
}
