package EX20;

public class Main {
    public static void main(String[] args) {
        CD cd1 = new CD(1, 20, "Title12", "CaSy1", 200);
        CD cd2 = new CD(2, 16, "Title2", "CaSy2", 300);
        CD cd3 = new CD(3, 17, "Title3", "CaSy3", 250);
        CDList cdList = new CDList(new CD[3], 2);
        cdList.addCD(cd1);
        cdList.addCD(cd2);
        cdList.addCD(cd3);
        cdList.displayCD();
        System.out.println("Số lượng CD được thêm: " + cdList.countCD());
        System.out.println("Tổng số lượng CD: " + cdList.sumCD());
        cdList.sortByCDTitle();
        cdList.sortBySale();
    }
}
