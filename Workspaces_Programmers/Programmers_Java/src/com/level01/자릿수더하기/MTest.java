package com.level01.자릿수더하기;

public class MTest {
    public static void main(String[] args) {
    	int n = 123;
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(n));
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String [] nArr = (n+"").split("");

        for(int i = 0; i < nArr.length; i++){
            answer += Integer.parseInt(nArr[i]);
        }

        return answer;
    }
}