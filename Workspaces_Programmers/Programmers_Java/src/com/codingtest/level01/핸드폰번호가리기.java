package com.codingtest.level01;

public class �ڵ�����ȣ������ {
	public static void main(String[] args) {
		
	      String phone_number = "01033334444";

	      Solution�ڵ�����ȣ������ sol = new Solution�ڵ�����ȣ������();
	      System.out.println(sol.solution(phone_number));

	}
}

class Solution�ڵ�����ȣ������ {
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
