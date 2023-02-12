import java.util.*;
import java.io.*;

public class a3 {
    public static void main(String[] args) {
        int N = 6;
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++)
            pq.add(arr[i]);
        while (k-- > 1)
            pq.remove();
        System.out.println(pq.peek());
    }
}
