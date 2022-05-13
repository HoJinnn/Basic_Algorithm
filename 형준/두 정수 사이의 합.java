//내 풀이
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
                for(int i = b; i<=a; i++){
                    answer = answer + i;
                }
        }else if(b>a){
        }for(int i = a; i<=b; i++){
                    answer = answer + i;
                }
        return answer;
    }
}

//상운님 풀이
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
                for(int i = b; i<=a; i++){
                    answer = answer + i;
                }
        }else if(b>a){
        }for(int i = a; i<=b; i++){
                    answer = answer + i;
                }
        return answer;
    }
}
