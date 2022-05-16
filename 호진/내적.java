//문제: 내적
//솔루션: a, b의 배열의 길이가 같기 때문에 배열의 길이만큼 for문으로 돌면서
//서로 같은 인덱스의 값을 곱한 후 answer에 누적하면 해결.

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
