class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(" ", -1);
        for(int i =0; i<word.length; i++){
            if (i !=0) answer +=" ";
            for(int j =0; j<word[i].length();j++){
                answer += j % 2 == 0 ? String.valueOf(word[i].charAt(j)).toUpperCase() : String.valueOf(word                    [i].charAt(j)).toLowerCase();
            }
        }
        return answer;
    }
}
