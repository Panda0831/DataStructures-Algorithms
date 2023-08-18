public class LinearTimeAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        linearTimeAlgorithm(arr);
    }

    public static void linearTimeAlgorithm(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}