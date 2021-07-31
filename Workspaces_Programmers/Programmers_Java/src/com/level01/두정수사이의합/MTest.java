package com.level01.두정수사이의합;

public class MTest {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(a, b));
	}
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a == b){
            answer = a;
        }else if(a < b){
            for(int i = 0; i <= b-a; i++){
                answer += a+i;
            }
        }else if(a > b){
            for(int i = 0; i <= a-b; i++){
                answer += b+i;
            }
        }
        
        return answer;
    }
}