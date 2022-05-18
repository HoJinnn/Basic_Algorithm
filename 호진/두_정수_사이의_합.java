class Solution {
    //문제: 두 정수 사이의 합 
    //문제 해결 키: Math.min(), Math.max() 메소드 활용
    
    public long solution(int a, int b) {
        long answer = 0;
        
        for(int i = Math.min(a,b); i <= Math.max(a,b); i++){
            // int i에 a,b중 더 작은 값을 저장
            // a,b 대소에 관계없이 작동
            answer += i;
        }
        
    return answer;
    }
