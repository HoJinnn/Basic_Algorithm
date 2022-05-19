import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);   //5   
        Arrays.sort(completion);    //4
        for (int i =0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
                }
        }
        if(answer.equals(""))
            answer = participant[participant.length-1];
        return answer;
    }
}
