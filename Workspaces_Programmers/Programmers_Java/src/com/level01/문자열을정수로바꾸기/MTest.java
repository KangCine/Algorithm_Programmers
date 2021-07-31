package com.level01.문자열을정수로바꾸기;

public class MTest {
	public static void main(String[] args) {
		
		String str = "1234";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(str));
	}
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String [] sArr = s.split("");
        s = "";
        
        
        if(sArr[0].equals("-")){
            for(int i = 1; i < sArr.length; i++){
                s += sArr[i];
            }
                
            answer = 0 - Integer.parseInt(s);
                
        }else {
            for(int i = 0; i < sArr.length; i++){
                s += sArr[i];
            }
                
            answer = 0 + Integer.parseInt(s);
                
        }
        
        return answer;
    }
}