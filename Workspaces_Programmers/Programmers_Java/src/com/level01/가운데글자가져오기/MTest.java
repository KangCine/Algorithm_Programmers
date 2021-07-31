package com.level01.가운데글자가져오기;

public class MTest {
	public static void main(String[] args) {
		
		String s = "abcde";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(s));
	}
}

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String [] sArr = s.split("");
        
        if(sArr.length % 2 == 0){
            answer = sArr[sArr.length / 2 - 1]+sArr[sArr.length / 2];
        }else{
            answer = sArr[sArr.length / 2];
        }
        
        return answer;
    }
}