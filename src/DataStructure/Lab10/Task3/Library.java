package DataStructure.Lab10.Task3;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    Book getOldestBook(){
        Book result = null;
        int oldestYear = books.getLast().getYear();
        for (Book book : books){
            if(book.getYear() < oldestYear){
                oldestYear = book.getYear();
                result = book;
            }
        }
        return result;
    }

    Optional<Book> getOldestBookWithJava8(){ // Dùng Optional khi không chắc chắn phương thức trả về
        return books.stream()
                .min(Comparator.comparingInt(Book::getYear));
    }

    Map<Integer, List<Book>> getBookByYears(){
        Map<Integer, List<Book>> result = new TreeMap<>();
        for (Book book : books){
            int year = book.getYear();
            if(!result.containsKey(year)){
                result.put(year, new ArrayList<>());
            }
            result.get(year).add(book);
        }
        return result;
    }

    Map<Integer, List<Book>> getBookByYearsWithJava8(){
        return books.stream()
                .collect(Collectors.groupingBy(Book::getYear));
    }

    Set<Book> findBooks(String authorName, int year){
        Set<Book> result = new TreeSet<>(Comparator.comparing(Book::getTitle));
        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getName().equals(authorName) && book.getYear() == year) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    Set<Book> findBooksWithJava8(String authorName, int year){
        return books.stream()
                .filter(book -> book.getYear() == year
                        && book.getAuthors().stream().anyMatch(author -> author.getName().equals(authorName)))
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public static void main(String[] args){
        Author author = new Author("Honobonoru500", 2004);
        Author author2 = new Author("Nama", 2005);
        List<Author> authors = new ArrayList<>();
        authors.add(author);
        authors.add(author2);
        Library library = getLibrary(authors);
        System.out.println("Trả về cuốn sách lâu đời nhất: " + library.getOldestBook());
        System.out.println("Trả về map những cuốn sách theo năm: " + "\n" + library.getBookByYears());
        System.out.println("Tìm sách theo tên và năm xuất bản: " + "\n" + library.findBooks("Honobonoru500", 2021));
    }

    private static Library getLibrary(List<Author> authors) {
        Book book = new Book("1", "The Weakest Tamer Began a Journey to Pick Up Trash Vol 1", "Lightnovel", 300000, 2020, authors);
        Book book2 = new Book("2", "The Weakest Tamer Began a Journey to Pick Up Trash Vol 2", "Lightnovel", 250000, 2021, authors);
        Book book3 = new Book("2", "The Weakest Tamer Began a Journey to Pick Up Trash Vol 3", "Lightnovel", 350000, 2021, authors);
        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        books.add(book3);
        return new Library("Lightnovel Library", books);
    }
}
