//문제: 제일 작은 수 제거하기

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){ //arr의 배열의 길이가 1인 경우 -1 반환
            answer = new int[1];
            answer[0] = -1;
        }else{
        
        
            answer = new int[arr.length - 1]; //숫자 하나가 없어지기 때문에 arr길이 -1
            int min = arr[0];//가장 작은 숫자를 저장할 변수 초기화

            for(int i = 0; i < arr.length; i++){//for문을 돌면서 min과 arr의 index비교
                min = Math.min(min, arr[i]);//비교 숫자 중 낮은 숫자는 min에 저장
            }
            int index = 0;
            for(int i = 0; i < arr.length; i++){
                if(min == arr[i]){ //가장 작은 숫자는 배열에 포함시키지 않는다.
                    continue;
                }
                answer[index] = arr[i];
                index++;
            }
        }    
        return answer;
    }
}
