package Project.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws IOException {
        // Đường dẫn đến file dữ liệu
        String fileName = "src/Project/data/book.txt";

        // Khởi tạo BookManager với danh sách sách rỗng
        BookManager bookManager = new BookManager(new ArrayList<>());

        // Tải dữ liệu sách từ file
        bookManager.loadBook(fileName);
        System.out.println("Book Data: " + bookManager.getListBook());
    }
}

