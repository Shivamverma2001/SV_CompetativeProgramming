import java.util.*;
import java.io.*;

public class a6 {
    public static void negativeOneSide(int arr[]) {
        int i = 0, k = 0, temp = 0;
        while (i < arr.length) {
            if (arr[i] < 0) {
                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        negativeOneSide(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
