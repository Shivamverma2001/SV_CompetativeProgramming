import java.util.*;
import java.io.*;

public class a5 {
    public static void sort012(int a[], int n) {
        // code here
        int i = 0, j = n - 1, k = 0, temp = 0;
        while (k <= j) {
            if (a[k] == 0) {
                temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                i++;
                k++;
            } else if (a[k] == 2) {
                temp = a[k];
                a[k] = a[j];
                a[j] = temp;
                j--;
            } else
                k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 1, 0, 1, 0, 1, 2, 1 };
        sort012(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}