class Solution {
    public String solution(int num) {
        //문제: 짝수와 홀수
        //솔루션: 삼항 연산자 활용
        String answer = "";
        
        answer = (num % 2 ==0) ? "Even" : "Odd";
        return answer;
    }
}
