public class smallestArray {
    public static int region (int[] array, int low, int high) {
        int inital = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= inital) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static int quickselect(int[] array, int low, int high, int k) {
        if (low < high) {
            int initialIndex = region(array, low, high);

            if (initialIndex == k - 1) {
                return array[initialIndex];
            } else if (initialIndex > k - 1) {
                return quickselect(array, low, initialIndex - 1, k);
            } else {
                return quickselect(array, initialIndex + 1, high, k);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arrayNum = {15, 22, 51, 28, 13, 24, 5, 12};
        int N = 4;

        // Find the Nth smallest element
        int result = quickselect(arrayNum, 0, arrayNum.length - 1, N);
        System.out.println(result);
    }
}
