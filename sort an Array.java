public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {5, 2, 3, 1, 4};
        int[] sorted = sol.sortArray(nums);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeFun(int[] arr, int l, int m, int r) {
        int n1 = m + 1 - l;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int i = 0; i < n2; i++) right[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;

        while (i < n1 || j < n2) {
            if (j == n2 || (i < n1 && left[i] < right[j]))
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            mergeFun(arr, low, middle, high);
        }
    }
}
