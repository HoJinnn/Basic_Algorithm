import java.util.Scanner;

class Solution {
    //문제: 직사각형 별찍기
    //솔루션: 이중 for문 활용
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 0; i < m; i++){
            //첫번째 for문은 m번만큼 세로의 길이를 제어
            for(int j = 0; j < n; j++){
                //두번째 for문은 n번만큼 별의 개수를 제어
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
