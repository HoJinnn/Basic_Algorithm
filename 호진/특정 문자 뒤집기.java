5. 특정 문자 뒤집기

설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

예시 입력 1 
a#b!GE*T@S
  
예시 출력 1
S#T!EG*b@a

import java.util.*;

class Main {
    public String solution(String str) {
      String answer = "";
      char[] a = str.toCharArray();
      int lt = 0;
      int rt = str.length()-1;
      
      while (lt < rt) {
        if (!Character.isAlphabetic(a[lt])) lt++;
        else if (!Character.isAlphabetic(a[rt])) rt--;
        else {
          char tmp = a[lt];
          a[lt] = a[rt];
          a[rt] = tmp;
          lt++;
          rt--;
        }
      }
      answer = String.valueOf(a);

      return answer;
  }
  public static void main(String[] args) {
    Main T = new Main();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
  }
}
