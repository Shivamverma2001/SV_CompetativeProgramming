import java.util.*;
import java.io.*;

public class a7 {
    public static int doUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i < a.length; i++)
            ans.add(a[i]);
        for (int i = 0; i < b.length; i++)
            ans.add(b[i]);
        return ans.size();
    }

    public static void main(String[] args) {
        int n = 6, m = 2;
        int arr[] = new int[] { 85, 25, 1, 32, 54, 6 };
        int arr2[] = new int[] { 85, 2, 7 };
        int ans = doUnion(arr, n, arr2, m);
        System.out.println(ans);
    }
}
