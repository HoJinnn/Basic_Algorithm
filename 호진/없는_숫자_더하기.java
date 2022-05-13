//문제: 없는 숫자 더하기
//솔루션: 0~9까지 더한 수에서 numbers 배열에 속한 수를 빼기
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int i : numbers)    answer -= i;
        //numbers에서 i로 하나씩 빼서 answer에서 뻬준다.
        return answer;
    }
}
