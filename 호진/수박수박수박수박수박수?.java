//문제: 수박수박수박수박수박수?
//솔루션: for문, if문 활용 짝수 인덱스에 "수", 홀수 인덱스에 "박" 추가

class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0)
                answer += "수";
            else
                answer += "박";
        }
        return answer;
    }
}
