package JavaBasic.Leetcode;

import java.util.Arrays;

public class twoSum{
public int[] twoSumMethod(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i,j};
            }
        }
    }
    return null;
}
public static void main(String[] args){
    int[] arr = {2,7,11,15};
    twoSum twoSum = new twoSum();
    System.out.print(Arrays.toString(twoSum.twoSumMethod(arr, 9)));
}
}
