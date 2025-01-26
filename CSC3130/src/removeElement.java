public class removeElement {

    public static int removeElement(int[] nums, int n) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == n) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String args[]) {
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int n = 3;
        System.out.println(removeElement(nums, n));

    }
    }


