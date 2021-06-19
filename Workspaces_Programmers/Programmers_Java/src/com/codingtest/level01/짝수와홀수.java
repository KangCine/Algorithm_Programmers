// Â¦¼ö¿Í È¦¼ö
package com.codingtest.level01;

public class Â¦¼ö¿ÍÈ¦¼ö {
	public static void main(String[] args) {
    	SolutionÂ¦¼ö¿ÍÈ¦¼ö solution02 = new SolutionÂ¦¼ö¿ÍÈ¦¼ö();
    	System.out.println(solution02.solution(3));
	}
}

class SolutionÂ¦¼ö¿ÍÈ¦¼ö {
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