package YourselfLearning.Hackerrank;

public class whyamIhere {
    void switchArr(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        whyamIhere obj = new whyamIhere();  // Tạo đối tượng của lớp
        obj.switchArr(arr);  // Gọi phương thức qua đối tượng
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

