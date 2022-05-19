import java.util.*;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);               //long n을 String s로 변환
        String num = "";
        char[] ch = new char[s.length()];           //String을 char로 쪼갠 후 s를 배열로 만듬
        for(int i =0; i< s.length(); i++) ch[i] +=s.charAt(i);
        
        Arrays.sort(ch);                            //쪼갠 것 오름차순 정리
        for(int i =ch.length-1; i>=0; i--)          //역순으로 String num에 붙임
            num += ch[i];
        long answer = Long.parseLong(num);          //String to long
        return answer;
    }
}
