public class ConstantTimeAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int firstElement = constantTimeAlgorithm(arr);
        System.out.println("The first element is: " + firstElement);
    }

    public static int constantTimeAlgorithm(int[] arr) {
        return arr[0];
    }
}