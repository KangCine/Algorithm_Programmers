package com.level01.���ڼ��ڼ��ڼ��ڼ�;

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
                answer+="��";
            }else{
                answer+="��";
            }
        }
        
        return answer;
    }
}