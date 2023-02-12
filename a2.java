public class a2 {
    static class MinMax {
        int min = 100000;
        int max = -10000;
    }

    static MinMax getMinMax(int arr[], int low, int high) {
        MinMax minmax = new MinMax();
        MinMax left = new MinMax();
        MinMax right = new MinMax();
        if (low == high)
            return minmax;
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
        int mid = (low + high) / 2;
        left = getMinMax(arr, low, mid);
        right = getMinMax(arr, mid + 1, high);
        if (left.min < right.min)
            minmax.min = left.min;
        else
            minmax.min = right.min;
        if (left.max > right.max)
            minmax.max = left.max;
        else
            minmax.max = right.max;
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = 6;
        MinMax minmax = getMinMax(arr, 0, arr_size - 1);
        System.out.printf("Minimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
