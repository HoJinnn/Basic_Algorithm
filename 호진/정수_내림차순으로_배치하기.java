import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String a : arr){
            sb.append(a);
        }
        return Long.parseLong(sb.toString());
    }
}
