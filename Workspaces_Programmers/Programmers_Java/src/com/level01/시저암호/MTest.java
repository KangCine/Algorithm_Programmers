package com.level01.시저암호;

public class MTest {
	public static void main(String[] args) {
		String s = "AB";
		int n = 3;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(s, n));
	}
}

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            if(ch == ' '){
                answer += ' ';
            }
            if(ch >= 'a' && ch <= 'z'){
                ch += n;
                if(ch > 'z'){
                    ch -= 26;
                }
                answer += ch;
            }else if(ch >= 'A' && ch <= 'Z'){
                ch += n;
                if(ch > 'Z'){
                    ch -= 26;
                }
                answer += ch;
            }

        }
        
        return answer;
    }
}