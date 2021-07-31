package com.level01.문자열내마음대로정렬하기;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(strings, n));
	}
}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String [strings.length];
        
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}