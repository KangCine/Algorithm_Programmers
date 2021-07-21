package com.level01.음양더하기;

public class MTest {

    public static void main(String[] args) {
    	
    	int [] absolutes = {4,7,12};
    	boolean [] signs = {true,false,true};
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(absolutes, signs));
    	
	}
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            if(!signs[i]){
                absolutes[i] = -absolutes[i];
            }
        }
        
        for(int i = 0; i < absolutes.length; i++){
            answer += absolutes[i];
        }
        
        return answer;
    }
}