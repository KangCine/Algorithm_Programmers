package com.level01.문자열내p와y의개수;

public class MTest {
	public static void main(String[] args) {
		
		String s = "pPoooyY";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(s));
	}
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p = 0;
        int y = 0;

        String [] sArr = s.split("");
        
        for(int i = 0; i < sArr.length; i++){
            
            if(sArr[i].equals("P") || sArr[i].equals("p")){
                p++;
            }else if(sArr[i].equals("Y") || sArr[i].equals("y")){
                y++;
            }
        }
        
        if(p != y){
            answer = !answer;
        }

        return answer;
    }
}