package JavaBasic.FinalBoss.Boss1;

public class AuthorBook {
    private String bookName, author, yearRelease, quantityRemain;

    public AuthorBook(String bookName, String author, String yearRelease, String quantityRemain) {
        this.bookName = bookName;
        this.author = author;
        this.yearRelease = yearRelease;
        this.quantityRemain = quantityRemain;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getQuantityRemain() {
        return quantityRemain;
    }

    public void setQuantityRemain(String quantityRemain) {
        this.quantityRemain = quantityRemain;
    }
}
