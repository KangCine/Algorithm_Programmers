package com.level01.정수제곱근판별;

public class MTest {
    public static void main(String[] args) {
    	int n = 121;
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(n));
	}
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = 1;
        
        while(i*i <= n){
            
            if(n == i * i){
                answer = (i+1) * (i+1);
            }else{
                answer = -1;
            }
            
            i++;
        }
        
        return answer;
    }
}