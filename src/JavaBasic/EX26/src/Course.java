package EX26.src;

public class Course {
    private String tenMH;
    private double diem;

    public Course(String tenMH, double diem) {
        this.tenMH = tenMH;
        this.diem = diem;
    }

    public String getTenMH() {
        return tenMH;
    }
    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
