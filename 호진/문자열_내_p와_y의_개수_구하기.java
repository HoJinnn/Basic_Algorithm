//문제: 문자열 내 p와 y의 개수
//솔루션: 문자열 관련 함수(toLowerCase(), split() 활용)
//for문 활용으로 각 index내 "p", "y" 유무 검사

class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        String[] arr = s.toLowerCase().split("");
        
        for(int i = 0; i < arr.length; i++){
            if("p".equals(arr[i])){
                p++;
            }else if("y".equals(arr[i])){
                y++;
            }
    
        }
        if(p != y){
            return false;
        }
            return true;
    }
}
