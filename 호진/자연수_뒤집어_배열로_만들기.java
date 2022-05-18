//문제: 자연수 뒤집어 배열로 만들기
//솔루션: 자연수를 문자열로 바꿔서 문자열의 길이를 구한 후 그 길이 만큼의 int[] 생성
//자연수 n을 10을 이용해 나머지를 구해서 배열에 추가 10으로 나눠서 일의 자리 소거 -> 반복

class Solution {
    public int[] solution(long n) {
        String s = "" + n;
        int[] answer = new int[s.length()];
        int count = 0;
        while(n > 0){
            answer[count] =(int)(n % 10);
            n /= 10;
            count++;
        }
        return answer; 
    }
}
