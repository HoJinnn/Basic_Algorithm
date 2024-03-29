9. 격자판 최대합

설명
5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
Image1.jpg
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
최대합을 출력합니다.

예시 입력 1 
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
  
예시 출력 1
155

풀이1 (내가 푼 풀이)
import java.util.*;
  
public class Main {
  public int solution(int n, int[][] m){
    int answer = 0;
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<n; i++){
      int column = 0;
      int row = 0;
      int diagonal = 0; 
      for(int j=0; j<n; j++){
         column += m[i][j];
         row += m[j][i];
         diagonal += m[j][j];
      }
      list.add(column);
      list.add(row);
      list.add(diagonal);
    }
    int max = 0;
    for(int k=0; k<list.size(); k++){
      if(list.get(k) > max) max = list.get(k);
    }
    answer = max;
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] m = new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        m[i][j] = sc.nextInt(); 
      }
    }
    System.out.println(T.solution(n, m));
  }
}

풀이2 (강의해설을 통한 풀이)
import java.util.*;
  
public class Main {
  public int solution(int n, int[][] m){
    int answer = Integer.MIN_VALUE;
    int sum1, sum2;
    for(int i=0; i<n; i++){
      sum1=sum2=0;
      for(int j=0; j<n; j++){
        sum1 += m[i][j];
        sum2 += m[j][i];
      }
      answer = Math.max(answer, sum1);
      answer = Math.max(answer, sum2);
    }
    sum1=sum2=0;
    for(int i=0; i<n; i++){
      sum1 += m[i][i];
      sum2 += m[i][n-i-1];
    }
    answer = Math.max(answer, sum1);
    answer = Math.max(answer, sum2);
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] m = new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        m[i][j] = sc.nextInt(); 
      }
    }
    System.out.println(T.solution(n, m));
  }
}
