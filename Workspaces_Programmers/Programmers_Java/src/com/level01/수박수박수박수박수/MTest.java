package com.level01.수박수박수박수박수;

public class MTest {
	public static void main(String[] args) {
		int n = 3;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(n));
	}
}

class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++){
            if(i%2==0){
                answer+="수";
            }else{
                answer+="박";
            }
        }
        
        return answer;
    }
}