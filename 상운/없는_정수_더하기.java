import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 0부터 9까지의 합: 45
        return 45 - Arrays.stream(numbers).sum();
    }
}