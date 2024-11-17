package JavaBasic.EX21;

public class PhongBan {
    private String maPB, tenPB;

    public PhongBan(String maPB, String tenPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
    }

    @Override
    public String toString() {
        return "PhongBan{" +
                "maPB='" + maPB + '\'' +
                ", tenPB='" + tenPB + '\'' +
                '}';
    }
}
