import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> correct = new ArrayList();
        
        for (int i =0; i<arr.length; i++){
            if ((arr[i] % divisor) == 0){
                correct.add(arr[i]);
            }
        }
        if (correct.isEmpty()) {
            correct.add(-1);
        }
        Collections.sort(correct);
        
        return correct;
    }
}
