class Solution {
    public int[] solution(long n) {
        String num = new Long(n).toString();  // Long to String
        int[] answer = new int[num.length()];
        for(int i =0; i<num.length();i++){
            char num2 = num.charAt(i);
            answer[num.length()-i-1] = Character.getNumericValue(num2);
        }
        return answer;
    }
}
