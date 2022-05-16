//문제: 문자열 다루기 기본
//솔루션: 문자가 숫자인지 확인해주는 메서드 활용

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6) return false; //문자열의 길이가 4 or 6 아니면 false 반환
            
        for(int i = 0; i < s.length(); i++){//입력받은 문자열 길이만큼 반복
            if(!Character.isDigit(s.charAt(i)))//입력받은 문자열 s의 각 문자가 Character.isDigit 즉 숫자인지 검사
                return false;
        }
        return answer;
    }
}
