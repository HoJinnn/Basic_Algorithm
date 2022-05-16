//문제: 서울에서 김서방 찾기
//솔루션: 문자가 같은지 비교하는 equals()메서드 활용 

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";             
            }
        }
        return answer;
    }
}
