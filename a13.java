import java.util.*;
import java.io.*;
public class a13 {
    public static int findDuplicate(int[] a) {
        if (a.length == 0)
            return 0;
        int slow = a[0], fast = a[0];
        do {
            slow = a[slow];
            fast = a[a[fast]];
        } while (slow != fast);
        slow = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 1, 3, 4, 2 };
        System.out.println(findDuplicate(arr));
    }
}
