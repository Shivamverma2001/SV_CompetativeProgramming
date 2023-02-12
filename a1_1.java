import java.util.*;
import java.io.*;

public class a1_1 {
    public static String reverseString(char[] a) {
        if (a.length == 0)
            return "";
        int i = 0, j = a.length - 1;
        char temp;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String(a);
    }

    public static void main(String[] args) {
        String s = "Shivam";
        System.out.println(reverseString(s.toCharArray()));
    }
}