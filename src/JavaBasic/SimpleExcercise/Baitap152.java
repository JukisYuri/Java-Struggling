package JavaBasic.SimpleExcercise;

public class Baitap152 {
    public static void main(String[] args) {
        // Giả sử đây là mảng số nguyên đã cho
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        findMax(arr);
        findMin(arr);
    }

    public static void findMax(int[] array) {
        int maxIndex = 0; // Giả định phần tử đầu tiên là lớn nhất
        int maxValue = array[0]; // Giá trị của phần tử lớn nhất

        // Duyệt qua mảng để tìm giá trị lớn nhất
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        // In ra vị trí và giá trị của phần tử lớn nhất
        System.out.println("Vị trí của phần tử lớn nhất: " + maxIndex);
        System.out.println("Giá trị của phần tử lớn nhất: " + maxValue);
    }
    public static void findMin(int[] array2){
        int minIndex = 0;
        int minValue = array2[0];

        for (int i = 0; i < array2.length; i++) {
            if(array2[i] < minValue){
                minValue = array2[i];
                minIndex = i;
            }

        }
        System.out.println("Vị trí của phần tử nhỏ nhất: " + minIndex);
        System.out.println("Giá trị của phần tử nhỏ nhất: " + minValue);
    }
}
