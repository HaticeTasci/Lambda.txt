package arrays;

public class Arrays04 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        }
        if (nums[nums.length - 1] == 6) {
            return true;
        }
        return false;

        // Solution notes: check the first and last elements, returning true
        // if they are == 6. we are given that the array is at least length 1,
        // so we don't need to check the length before using [].
        // A solution can be written very compactly with || as just
        // return(nums[0] == 6 || nums[nums.length - 1] == 6);

    }
}