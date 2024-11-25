package Test;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testData {
    public static final String RESET = "\u001B[0m"; // Reset lại màu mặc định
    public static final String RED = "\u001B[31m"; // Đỏ
    public static final String GREEN = "\u001B[32m"; // Xanh lá
    public static final String YELLOW = "\u001B[33m"; // Vàng
    public static final String BLUE = "\u001B[34m"; // Xanh dương
    public static final String CYAN = "\u001B[36m"; // Xanh lơ

    public static void main(String[] args) {
        // Đường dẫn đến file JSON
        String filePath = "src/Test/data.json"; // Thay đổi thành đường dẫn file

        try {
            // Đọc nội dung file JSON
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Parse nội dung JSON thành JSONObject
            JSONObject jsonObject = new JSONObject(content);

            // Lấy mảng "bookManager"
            JSONArray bookManagerArray = jsonObject.getJSONArray("bookManager");

            // Duyệt qua từng phần tử trong mảng
            for (int i = 0; i < bookManagerArray.length(); i++) {
                JSONObject bookInfo = bookManagerArray.getJSONObject(i).getJSONObject("bookInfo");

                // Lấy các thuộc tính của bookInfo
                String title = bookInfo.getString("title");
                String author = bookInfo.getString("author");
                String kindlePrice = bookInfo.getString("kindlePrice");
                String paperbackPrice = bookInfo.getString("paperbackPrice");
                String description = bookInfo.getString("description");
                String productId = bookInfo.getString("ASIN");
                String publisher = bookInfo.getString("publisher");
                String publisherDate = bookInfo.getString("publisherDate");

                // In thông tin ra màn hình
                System.out.println(BLUE + "Book " + (i+1) + ":" + RESET);
                System.out.println(GREEN + "Title: " + RESET + title);
                System.out.println(GREEN + "Author: " + RESET + author);
                System.out.println(GREEN + "Kindle Price (USD): " + RESET + kindlePrice);
                System.out.println(GREEN + "Paperback Price (USD): " + RESET + paperbackPrice);
                System.out.println(GREEN + "Product ID: " + RESET + productId);
                System.out.println(GREEN + "Publisher: " + RESET + publisher);
                System.out.println(GREEN + "Publisher Date: " + RESET + publisherDate);
                System.out.println(GREEN + "Description: " + RESET + description);
                System.out.println(YELLOW + "------------------------------------------------" + RESET);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error processing JSON: " + e.getMessage());
        }
    }
}
