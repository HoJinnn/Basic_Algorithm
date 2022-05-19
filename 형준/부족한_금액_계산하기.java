class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cost = 0;
        for(int i =0; i<count; i++){
            cost += price*(i+1);
        }
        answer = (cost>=money) ? cost-money:0;
        return answer;
    }
}
