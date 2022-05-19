class Solution {
    public String solution(int a, int b) {
        String answer = "";
        for(int i =1; i<=12; i++){
            switch (i){
                    case 1,3,5,7,8,10,12: {
                        if (b > 31)
                        System.out.println("존재하지 않음");
                        break;
                    }
                    case 4,6,9,11:{
                        if (b > 30)
                        System.out.println("존재하지 않음");
                        break;
                    }
                    default :
                        if (b > 29)
                        System.out.println("존재하지 않음");
                    }
            }
        int days=0;
        int sum =0;
        int total = 0;
        for(int i =1; i<a; i++){
            if (i>12){
                System.out.println("존재하지 않음");
                }else {
                switch (i){
                    case 1,3,5,7,8,10,12: {
                        days = 31;
                        break;
                    }
                    case 4,6,9,11:{
                        days = 30;
                        break;
                    }
                    default :
                        days = 29;
                    }sum +=days;
                }
            }
        total = sum+b;
        for(int i = 0; i<=(total%7); i++){
            switch (i){
                case 0:
                    answer = "THU";
                    break;
                case 1:
                    answer = "FRI";
                    break;
                case 2:
                    answer = "SAT";
                    break;
                case 3:
                    answer = "SUN";
                    break;
                case 4:
                    answer = "MON";
                    break;
                case 5:
                    answer = "TUE";
                    break;
                default :
                    answer = "WED";
            }
        }
        return answer;
    }
}
