//문제: 하샤드 수
//솔루션: while문, if문 활용

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int y = x; //매개변수로 받은 x를 저장
        while(y > 0){
            sum += y % 10; //y의 각 자리 숫자를 분리해서 sum에 누적
            y /= 10;
        }
        if(x % sum != 0){ //처음 받은 x의 sum이 나눠지지 않으면 하샤드 수가 아님
            return false;
        }
        return true;
    }
}
