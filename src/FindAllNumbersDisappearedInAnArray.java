import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] hasNumber = new boolean[nums.length + 1];
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i <nums.length; i++) {
            hasNumber[nums[i]] = true;
        }

        for (int i = 1; i < hasNumber.length; i++) {
            if (!hasNumber[i]) results.add(i);
        }

        return results;
//        time = O(n)
//        space = O(n)
    }
}
