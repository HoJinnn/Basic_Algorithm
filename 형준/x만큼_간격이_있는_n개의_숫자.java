class Solution {
    public long[] solution(long x, int n) {
        long[] answer =  new long[n];
        for(int i =0; i<n; i++) {
            long y = x*(i+1);
            answer[i] = y;
        }
        return answer;
    }
}
