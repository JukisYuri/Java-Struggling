package Project.src;

public class Book {
    private String idBook, nameBook, nameAuthor, yearAuthor;
    private int price, quantityRemain;

    public Book(String idBook, String nameBook, String nameAuthor, String yearAuthor, int price, int quantityRemain) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearAuthor = yearAuthor;
        this.price = price;
        this.quantityRemain = quantityRemain;
    }

    public String getIdBook() {
        return idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getYearAuthor() {
        return yearAuthor;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityRemain() {
        return quantityRemain;
    }

    boolean isAvailable(){
        if(quantityRemain > 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "'\n' + Book{" +
                "idBook='" + idBook + '\'' +
                ", Name='" + nameBook + '\'' +
                ", Author='" + nameAuthor + '\'' +
                ", Book_Year='" + yearAuthor + '\'' +
                ", Quantity=" + quantityRemain +
                '}';
    }
}
