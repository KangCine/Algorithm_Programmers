package com.level01.문자열다루기기본;

public class MTest {
	public static void main(String[] args) {
		
		String s = "a234";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(s));
	}
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        String [] sArr = s.split("");
        
        if(sArr.length == 4 || sArr.length == 6){
            for(int i = 0; i < sArr.length; i++){
                if(sArr[i].charAt(0) >= 'a' && sArr[i].charAt(0) <= 'z' || sArr[i].charAt(0) >= 'A' && sArr[i].charAt(0) <= 'Z'){
                    answer = false;
                }
            }
        } else {
            answer = false;
        }
        
        return answer;
    }
}