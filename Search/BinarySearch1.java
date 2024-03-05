public class BinarySearch1 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch1 ob = new BinarySearch1();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int x = 5;
        int result = ob.search(nums, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element is present at index: " + result);
    }
}
