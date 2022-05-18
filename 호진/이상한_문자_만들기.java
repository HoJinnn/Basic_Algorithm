import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(""); //매개변수s를 
        
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(" ")){
                index = 0;
            }else if(index % 2 == 0){
                arr[i] = arr[i].toUpperCase();
                index++;
            }else if(index % 2 != 0){
                arr[i] = arr[i].toLowerCase();
                index++;
            }
            answer += arr[i];
        }
        return answer;
    }
}
