//문제: x만큼 간격이 있는 n개의 숫자
//솔루션: for문을 이용해서 배열 index 채우기

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i = 1; i <= answer.length; i++){
            answer[i-1] = i * num;
        }
        return answer;
    }
}
