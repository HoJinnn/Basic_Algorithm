//문제: 평균_구하기
//솔루션: 배열의 값을 for문으로 꺼내서 더한후 배열의 길이만큼 나눔
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int a : arr)
            answer += a;
        
        answer /= arr.length;
        return answer;
    }
}
