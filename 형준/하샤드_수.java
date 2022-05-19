class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num =0 ;
        int y = x;
        while (x>0) {
            num = num + (x%10);
            x /= 10;
            }
        return  answer = (y%num ==0) ? true: false ;
    }
}
