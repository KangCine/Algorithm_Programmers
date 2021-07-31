package com.level01.´Þ·Â2016³â;

public class MTest {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 24;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(a, b));
	}
}

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int tmp = 0;

        switch(a - 1) {
		    case 12: tmp += 31;
            case 11: tmp += 30;
            case 10: tmp += 31;
            case 9: tmp += 30;
            case 8: tmp += 31;
            case 7: tmp += 31;
            case 6: tmp += 30;
            case 5: tmp += 31;
            case 4: tmp += 30;
            case 3: tmp += 31;
            case 2: tmp += 29;
            case 1: tmp += 31;
        }

        tmp += b;
        
        switch(tmp % 7){
            case 0: answer = "THU"; break;
            case 1: answer = "FRI"; break;
            case 2: answer = "SAT"; break;
            case 3: answer = "SUN"; break;
            case 4: answer = "MON"; break;
            case 5: answer = "TUE"; break;
            case 6: answer = "WED"; break;
        }
        
        
        return answer;
    }

}