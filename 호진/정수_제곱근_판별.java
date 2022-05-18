//문제: 정수 제곱근 판별
//솔루션: Math()메서드 활용

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        Double sqrt = Math.sqrt(n); //양의 정수 n의 제곱근을 구함.
        if(sqrt == sqrt.intValue()){ //제곱근의 값과 제곱근의 정수형 숫자와 값이 같다면
            answer = (long)Math.pow(sqrt + 1, 2); //제곱근 +1의 제곱을 저장.
        }else{
            return -1;//그렇지 않은 경우 -1을 반환.
        }
        return answer;
    }
}
