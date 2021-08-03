package com.level01.이상한문자만들기;

public class MTest {
    public static void main(String[] args) {
    	String s = "try hello world";
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(s));
	}
}

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split(" ", -1);
        
        for(int i = 0; i < sArr.length; i++){
            
            String[] sArr02 = sArr[i].split("");
            
            for(int j = 0; j < sArr02.length; j++){
                
                if(j % 2 == 0){
                    sArr02[j] = sArr02[j].toUpperCase();
                }else{
                    sArr02[j] = sArr02[j].toLowerCase();
                }
                answer += sArr02[j];
            }
            if(i < sArr.length-1){
                answer += " ";    
            }
        }
        
        return answer;
    }
}