//문제: 부족한 금액 계산하기
//솔루션: for문과 if문을 이용하여 이용료는 계산하여 가진 돈보다 크다면 (이용료 - 가진 돈) 반환

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        if(sum > money){
            answer = sum - money;
        }
        return answer;
    }
}
