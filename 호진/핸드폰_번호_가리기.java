//문제: 핸드폰 번호 가리기
//솔루션: 조건문, 반복문, String관련 함수를 이용한 문자열 채우기

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++){
            if(i < phone_number.length() - 4){
                answer += "*";
            }else{
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }
}
