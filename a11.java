import java.util.*;
import java.io.*;

public class a11 {
    public static int getMinDiff(int[] arr, int n, int k) {
        int min = 0, max = 0, r = 0;
        Arrays.sort(arr);
        r = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= k) {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[i] - k, arr[0] + k);
                r = Math.min(r, max - min);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 9, 12, 16, 20 };
        System.out.println(getMinDiff(arr, arr.length, 3));
    }
}