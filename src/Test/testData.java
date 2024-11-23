package Test;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testData {
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
                String price = bookInfo.getString("priceByUSD");
                String description = bookInfo.getString("description");
                String productId = bookInfo.getString("productId");

                // In thông tin ra màn hình
                System.out.println("Book " + (i + 1) + ":");
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Price (USD): " + price);
                System.out.println("Description: " + description);
                System.out.println("Product ID: " + productId);
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error processing JSON: " + e.getMessage());
        }
    }
}
