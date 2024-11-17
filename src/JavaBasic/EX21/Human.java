package JavaBasic.EX21;

public class Human {
    protected String ten, namSinh;

    public Human(String ten, String namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Human{" +
                "ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                '}';
    }


}
