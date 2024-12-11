package DataStructure.Lab10.Task3;

import java.util.List;

public class Book {
    private String id, title, type;
    private int price, year;
    private List<Author> authors;

    public Book(String id, String title, String type, int price, int year, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
        this.authors = authors;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", authors=" + authors +
                '}' + "\n";
    }
}
