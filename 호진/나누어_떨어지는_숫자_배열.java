//문제: 나누어 떨어지는 숫자 배열
//솔루션: 리스트를 활용하여 입력받은 arr를 하나씩 divisor로 나누면서 검사

import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();//int리스트 생성
        
        for(int a : arr){
            if(a % divisor == 0) //arr의 인자를 하나씩 divisor 나눠지면 list에 추가
                list.add(a);
        }
        if(list.isEmpty())//for문을 빠져 나온 후 list가 비어 있으면 list에 -1 추가
            list.add(-1);
        
        list.sort(Comparator.naturalOrder());//리스트를 정렬-> naturalOrder오름차순정렬
        return list;
    }
}
