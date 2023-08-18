public class BigO {
    int getItem(int[] arr, int index) {
        return arr[index];
    }
    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
    void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
    int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    void generatePermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(
                        prefix + str.charAt(i),
                        str.substring(0, i) + str.substring(i + 1, n)
                );
            }
        }
    }

}
