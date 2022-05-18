//문제: 자릿수_더하기
//솔루션: while문 활용, %, / 연산자 이용해 한자리씩 소거

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
