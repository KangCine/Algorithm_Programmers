package com.level01.서울에서김서방찾기;

public class MTest {
	public static void main(String[] args) {
		
		String[] seoul = {"Jane","Kim"};
		
		Solution solution = new Solution();
		System.out.println(solution.solution(seoul));

	}
}

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        
        return answer;
    }
}