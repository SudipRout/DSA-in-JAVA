import java.util.HashSet;

public class CheckDuplicate {
    public static boolean containsDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 4, 14 };
        System.out.println("Output: " + containsDuplicate(nums));
    }
}