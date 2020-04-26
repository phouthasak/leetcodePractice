import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
//    public boolean solve(List<Integer> l, int target, int[] cand, int start, List<List<Integer>> ans) {
//        if (target < 0) return false;
//        if (target == 0) {
//
//        }
//
//        for (int i = start; i < cand.length; i++) {
//            if (target - cand[i] >= 0) {
//                l.add(cand[i]);
//                if (!solve(new ArrayList<Integer>(l), target - cand[i], cand, i, ans));
//                l.remove(l.size() - 1);
//            }
//        }
//    }
//
//    public List<List<Integer>> combinationSum(int[] cand, int target) {
//        List<List<Integer>> results = new ArrayList<>();
//        solve(new ArrayList<Integer>(), target, cand, 0,results);
//        return results;
//    }
}
