class Solution {
    public String solution(String b) {
        String answer = "";
        String star = "*";
        answer = star.repeat(b.length()-4)+b.substring(b.length()-4);
        return answer;
    }
}
