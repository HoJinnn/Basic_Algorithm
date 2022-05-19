import java.lang.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        long ans = (long)sqrt;
        answer = ans*ans == n ? (ans+1)*(ans+1) : -1;
        
        return answer;
    }
}
