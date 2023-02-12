public class a4 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0, j = n - 1, p = 0, temp = 0;
        int a[] = { 0, 2, 1, 2, 0 };
        while (p <= j) {
            if (a[p] == 0) {
                temp = a[p];
                a[p] = a[i];
                a[i] = temp;
                i++;
                p++;

            } else if (a[p] == 2) {
                temp = a[p];
                a[p] = a[j];
                a[j] = temp;
                j--;
            } else
                p++;
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}
