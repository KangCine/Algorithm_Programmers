// ¦���� Ȧ��
package com.codingtest.level01;

public class ¦����Ȧ�� {
	public static void main(String[] args) {
    	Solution¦����Ȧ�� solution02 = new Solution¦����Ȧ��();
    	System.out.println(solution02.solution(3));
	}
}

class Solution¦����Ȧ�� {
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