// ¦���� Ȧ��
package com.level01.¦����Ȧ��;

public class MTest {
	public static void main(String[] args) {
		Soulution solution = new Soulution();
    	System.out.println(solution.solution(3));
	}
}

class Soulution {
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