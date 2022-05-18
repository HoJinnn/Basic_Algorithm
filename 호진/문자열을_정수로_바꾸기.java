//문제: 문자열을 정수로 바꾸기
//솔루션:parseInt를 이용한 String -> int형 형변환 
class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}
