package com.level01.자연수뒤집어배열로만들기;

public class MTest {
    public static void main(String[] args) {
    	int n = 12345;
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(n));
	}
}

class Solution {
    public int[] solution(long n) {
        String [] strArr = (n+"").split("");
        
        int[] answer = new int [strArr.length];
        
        for(int i = 0, j = strArr.length-1; i < strArr.length; i++, j--){
            answer[i] = Integer.parseInt(strArr[j]);
        }
        
        return answer;
    }
}