// ¦���� Ȧ��
package com.level.level01;

public class level01_02¦����Ȧ�� {
	public static void main(String[] args) {
    	Solution02 solution02 = new Solution02();
    	System.out.println(solution02.solution(3));
	}
}

class Solution02 {
    public String solution(int num) {
    	
    	String answer = "";

    	if(num % 2 == 0) {
    		answer = "Even";
    	} else {
    		answer = "Odd";
    	}
        return answer;
    }
}