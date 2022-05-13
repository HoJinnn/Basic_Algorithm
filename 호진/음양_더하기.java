//문제: 음양 더하기
//솔루션: boolean의 특성과 배열의 길이가 서로 같은 것을 활용
//참 거짓 결과값에 따라 absolutes 값을 더할지 뺄지 정한다.
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++){
            if(signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }
        return answer;
    }
}
