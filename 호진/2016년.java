//문제: 2016년 
//솔루션: 1월1일(금요일)부터 현재까지의 날짜수를 구한 후 7로 나눠서 현재 요일을 구한다.

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        int dateAll = 0;
        for(int i = 0; i < a - 1; i++){
            dateAll += date[i];    //1월1일부터 현재 달 직전까지 날짜를 더한다.
        }   
        dateAll += b - 1;// 추가로 현재 달의 날짜를 더해준다.
        answer = day[dateAll % 7]; //dateAll을 7로 나눈 나머지를 인덱스에 대입 요일을 구함
        return answer;
    }
}
