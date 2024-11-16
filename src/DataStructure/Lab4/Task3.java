package DataStructure.Lab4;

import java.util.Random;

public class Task3 {
    // Hàm để tạo mảng ngẫu nhiên
    public static int[] getArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000); // Change how much index
        }
        return array;
    }

        public static void main(String[] args) {
        int arrayLength = 1000; // Change length
        int iterations = 10;
        long totalTime = 0;

        for (int i = 0; i < iterations; i++) {
            int[] randomArray = getArray(arrayLength);
            long startTime = System.currentTimeMillis();
            // List time check
            Task1.selectionSort(randomArray);
            //Task1.bubbleSort(randomArray);
            //Task1.insertionSort(randomArray);
            //MergeSort.mergeSort(randomArray, 0 , arrayLength - 1);
            //QuickSort.quickSort(randomArray);

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            totalTime += elapsedTime;

            System.out.println("Iteration " + (i + 1) + ": " + elapsedTime + " ms");
            System.out.println("----------------------------------------------------------");
        }
        long averageTime = totalTime / iterations;
        System.out.println("Average time over " + iterations + " iterations: " + averageTime + " ms");
    }
}
