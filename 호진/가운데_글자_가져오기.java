class Solution {
    public String solution(String s) {
        //문제: 가운데 글자 가져오기
        //솔루션: substring(), s.length() 활용
        
        String answer = "";
        
        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2-1, s.length()/2+1);
            //substring메소드를 활용해 answer길이의 나누기 2의-1부터 2+1 전까지 가져온다
        } else{
            answer = s.substring(s.length()/2, s.length()/2+1);
            //substring메소드를 활용해 answer길이의 나누기 2부터 2+1 전까지 가져온다
        }
        return answer;
    }
}
