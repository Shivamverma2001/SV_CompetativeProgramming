import java.util.*;
import java.io.*;

public class a12 {
    public static int minJumps(int[] arr) {
        // your code here
        int n = arr.length;
        int pos = 0, reach = 0, jump = 0;
        for (int i = 0; i < n; i++) {
            if (reach < i)
                return -1;
            reach = Math.max(reach, arr[i] + i);
            if (pos == i && i != n - 1) {
                pos = reach;
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(minJumps(arr));
    }
}
