package com.level01.핸드폰번호가리기;

public class MTest {
	public static void main(String[] args) {
		
	      String phone_number = "01033334444";

	      Soulution solution = new Soulution();
	      System.out.println(solution.solution(phone_number));

	}
}

class Soulution {
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
