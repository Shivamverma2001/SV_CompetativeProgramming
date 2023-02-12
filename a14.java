import java.util.*;
import java.io.*;

public class a14 {
    public static long maxSubarraySum(int arr[], int n) {

        // Your code here
        long max = -1000, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, -2, 5 };
        System.out.println(maxSubarraySum(arr, arr.length));
    }
}
