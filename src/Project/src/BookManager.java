package Project.src;

import DataStructure.project.src.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Predicate;

public class BookManager {
    private List<Book> listBook = new ArrayList<>();

    public BookManager(List<Book> listBook) {
        this.listBook = listBook;
    }

    public List<Book> getListBook() {
        return listBook;
    }

    void loadBook(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            // Tách chuỗi bằng dấu "|"
            String[] tokens = line.split("\\|");

            String idBook = tokens[0].trim();
            String nameBook = tokens[1].trim();
            String nameAuthor = tokens[2].trim();
            String yearAuthor = tokens[3].trim();
            int price = Integer.parseInt(tokens[4].trim());
            int quantityRemain = Integer.parseInt(tokens[5].trim());

            this.listBook.add(new Book(idBook, nameBook, nameAuthor, yearAuthor, price, quantityRemain));
        }
        reader.close();
    }

    List<Book> filterBooks(Predicate<Book> condition) {
        List<Book> result = new ArrayList<>();
        for (Book book : listBook) {
            if (condition.test(book)) {
                result.add(book);
            }
        }
        return result;
    }
    List<Book> findByBookName(String findByBookName) {
        return filterBooks(book -> book.getNameBook().equals(findByBookName));
    }

    List<Book> findByPriceToLower(int price) {
        return filterBooks(book -> book.getPrice() <= price);
    }

    List<Book> findByQuantityRemain() {
        return filterBooks(Book::isAvailable);
    }
}
