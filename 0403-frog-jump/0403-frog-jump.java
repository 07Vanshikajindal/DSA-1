import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {

        // Map: stone position -> jumps possible to reach here
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        // Initialize map
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }

        // First jump must be 1
        map.get(0).add(1);

        // Process each stone
        for (int stone : stones) {
            for (int jump : map.get(stone)) {

                int nextStone = stone + jump;

                // If we reached last stone
                if (nextStone == stones[stones.length - 1]) {
                    return true;
                }

                // If next stone exists
                if (map.containsKey(nextStone)) {
                    if (jump - 1 > 0)
                        map.get(nextStone).add(jump - 1);
                    map.get(nextStone).add(jump);
                    map.get(nextStone).add(jump + 1);
                }
            }
        }

        return false;
    }
}