package JavaBasic.EX21;

import java.util.ArrayList;

public class TruongDaiHoc {
    private ArrayList<Student> students;
    private ArrayList<Staff> staffs;

    public TruongDaiHoc(ArrayList<Student> students, ArrayList<Staff> staffs) {
        this.students = students;
        this.staffs = staffs;
    }
    public void displayStudentList(){
        System.out.println("Danh sách Sinh Viên:");
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i) != null){
                System.out.println("Sinh viên" + (i+1) + ":");
                System.out.println(students.get(i));
                System.out.println("----------------------");
            }
        }
    }
    public void displayStaffList(){
        System.out.println("Danh sách Nhân Viên:");
        for (int i = 0; i < staffs.size(); i++) {
            if(staffs.get(i) != null){
                System.out.println("Nhân viên" + (i+1) + ":");
                System.out.println(staffs.get(i));
                System.out.println("-----------------------");
            }
        }
    }
    public void printStudentList(){
        displayStudentList();
    }
    public void printStaffList(){
        displayStaffList();
    }
    public void printStaffSalary(){
        System.out.println("Lương Nhân Viên:");
        for (int i = 0; i < staffs.size(); i++) {
            if(staffs.get(i) != null){
                System.out.println("Nhân viên" + (i+1) + ":");
                System.out.println(staffs.get(i).getLuong());
            }
        }
    }
    public void sortStaffSalary() {
        int n = staffs.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (staffs.get(j).getLuong() < staffs.get(minIndex).getLuong()) {
                    minIndex = j;
                }
            }
            // Swap staffs[i] and staffs[minIndex]
            Staff temp = staffs.get(i);
            staffs.set(i, staffs.get(minIndex));
            staffs.set(minIndex, temp);
        }
        displayStaffList();
    }
}

