class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        String word = s.toLowerCase();
        for(int i =0; i<s.length();i++){
            if(word.charAt(i) == 'p'){
                countP += 1;
            } else if(word.charAt(i) == 'y') {
                countY += 1;
            }
        }
        if(countP != countY) 
            return answer = false;
        return answer;
    }
}
