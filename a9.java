public class a9 {
    public static void rotate(int arr[], int n) {
        int k = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = k;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 1, 0, 1, 0, 1, 2, 1 };
        rotate(arr, arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
