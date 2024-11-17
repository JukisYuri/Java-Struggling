package JavaBasic.EX20;

public class CDList {
    private CD[] cds;
    private int capacity, size;
    public CDList(CD[] cds, int capacity) {
        super();
        this.cds = new CD[capacity];
        this.capacity = capacity;
        this.size = 0;
    }
    public void addCD(CD cd) {
        if (size < capacity) {
            cds[size] = cd;
            size++;
            System.out.println("Thêm CD thành công");
        } else {
            System.out.println("Thêm CD không thành công");
        }
    }
    public int countCD(){
        int countCDS = 0;
        for (int i = 0; i < cds.length; i++) {
            if(cds[i] != null){
                countCDS++;
            }
        }
        return countCDS;
    }
    public double sumCD() {
        double totalCost = 0.0;
        for (int i = 0; i < cds.length; i++) {
            totalCost += cds[i].getSaleSong();
        }
        return totalCost;
    }
    public void displayCD(){
        System.out.println("Danh sách các CD: ");
        for (int i = 0; i < cds.length; i++) {
            if(cds[i] != null){
                System.out.println("CD " + (i+1) + ":");
                System.out.println(cds[i]);
                System.out.println("-------------------------");
            }
        }
        }
        public void sortBySale(){
        CD maxValueSale = cds[0];
            for (int i = 0; i < cds.length; i++) {
                if(cds[i].getSaleSong() > maxValueSale.getSaleSong()){
                    maxValueSale = cds[0];
                    displayCD();
                }
            }
        }
        public void sortByCDTitle(){
        CD maxValueTitle = cds[0];
            for (int i = 0; i < cds.length; i++) {
                if(cds[i].getTitleCD().length() > maxValueTitle.getTitleCD().length()){
                    maxValueTitle = cds[0];
                    displayCD();
                }

            }
        }

    }


