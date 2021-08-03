package com.level01.약수의합;

public class MTest {
    public static void main(String[] args) {
    	int n = 12;
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(n));
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int i = 1;
        
        while(n >= i){
            if(n % i == 0){
                answer += i;
            }
            i++;
        }
        
        return answer;
    }
}