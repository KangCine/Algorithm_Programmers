package com.level01.Äİ¶óÃ÷ÃßÃø;

public class MTest {
	public static void main(String[] args) {
	      int n = 6;

	      Solution solution = new Solution();
	      System.out.println(solution.solution(n));
	}
}

class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long a = num;
        
        while(a != 1){
            if(a % 2 == 0){
                a /= 2;
            }else if(a % 2 != 0){
                a = (a * 3) + 1;
            }
            
            answer++;
            
            if(answer >= 500){
                answer = -1;
                a = 1;
            }
        }
        
        return answer;
    }
}