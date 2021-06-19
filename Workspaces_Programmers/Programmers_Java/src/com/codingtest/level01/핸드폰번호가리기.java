package com.codingtest.level01;

public class 핸드폰번호가리기 {
	public static void main(String[] args) {
		
	      String phone_number = "01033334444";

	      Solution핸드폰번호가리기 sol = new Solution핸드폰번호가리기();
	      System.out.println(sol.solution(phone_number));

	}
}

class Solution핸드폰번호가리기 {
    public String solution(String phone_number) {
		
		String [] num = phone_number.split("");
		String answer = "";
		
		for(int i = 0; i < num.length-4; i++) {
			num[i] = "*";
		}

		for(int i = 0; i < num.length; i++) {
			answer += num[i];
		}
		
		return answer;
	}
}
