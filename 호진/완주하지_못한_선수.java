//문제: 완주하지 못한 선수
//솔루션: 해쉬맵을 이용해 참가자와 완주자를 비교해 결과값을 도출

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashList = new HashMap<>();
        
        for(String player : participant) 
            hashList.put(player, hashList.getOrDefault(player, 0) + 1); 
            //for-each문을 사용해 참가자를 한명씩 불러와 hashmap의 키값으로 넣는데
            //이미 값이 있다면(동명이인) 구분하기 위해 +1 해주도록 함.
        for(String player : completion)
            hashList.put(player, hashList.get(player) -1);
            //완주자를 한명씩 불러와 hashmap에 이미 key값으로 있다면 -1 한다.
        
        for(String key : hashList.keySet()){
            //hashlist의 모든 키 값을 가져온다.
            if(hashList.get(key) != 0){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}
