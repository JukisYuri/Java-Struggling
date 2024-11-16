package EX21;

public class Student extends Human {
    private float diem1, diem2, diem3;

    public Student(String ten, String namSinh, float diem1, float diem2, float diem3) {
        super(ten, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 +
                ", ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                '}';
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }
}
