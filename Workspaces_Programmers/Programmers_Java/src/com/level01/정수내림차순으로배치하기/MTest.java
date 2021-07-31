package com.level01.정수내림차순으로배치하기;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		
		int n = 118372;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(n));
	}
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        String tmp = "";
        
        String [] nArr = (n+"").split("");
        
        Arrays.sort(nArr);
        
        for(int i = nArr.length-1; i >= 0; i--){
            tmp += nArr[i];
        }
        
        answer = Long.parseLong(tmp);
        
        return answer;
    }
}