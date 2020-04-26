import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        // if n = 1 its happy
        while(n != 1) {
            int current = n;
            int sum = 0;

            // 0^2 = 0 so not worth calculating
            while(current != 0) {
                // mod 10 give you the ones place of the number
                sum += (current % 10) * (current % 10);

                // divide by 10 removes the ones places, which is already calculated in the sum in previous step
                current /= 10;

                // if we have already done this calculation then number cannot be happy because it will keep looping and recalculating
                if (seen.contains(sum)) {
                    return false;
                }

                // track that we have done this calculation before
                seen.add(sum);

                // update what we're trying to calculate
                n = sum;
            }
        }

        return true;
        //        time = O(n)
//        space = O(n)
    }
}
