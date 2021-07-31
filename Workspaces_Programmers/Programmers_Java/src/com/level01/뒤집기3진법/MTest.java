package com.level01.뒤집기3진법;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		
		int n = 45;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(n));
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        int tmp = 0;
        
        
        while(n > 0){
            tmp = n % 3;
            n = n / 3;
            list.add(tmp);
        }
        
        for(int i = 0; i < list.size(); i++){
            answer += zegub(i) * list.get(list.size()-i-1);
            
        }
        
        return answer;
    }
    
    
    private int zegub(int num){
        int res = 1;
        
        for(int i = 0; i < num; i++){
            res *= 3;
        }
        
        return (res==0) ? 1 : res;
    }
}