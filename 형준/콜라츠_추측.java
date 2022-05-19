class Solution {
    public int solution(int num) {
        int answer = 0;
        long ans = (long)num;               //오버플로우 일어남
        while (ans != 1){
            ans = (ans %2 ==0) ? ans/2: ans*3 +1 ;
            answer ++;
            if (answer >=500) {
                answer = -1;
                break;
             }
    }
        return answer;
    }
}
