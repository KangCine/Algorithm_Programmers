package com.level01.¾à¼öÀÇ°³¼ö¿Íµ¡¼À;

import java.util.*;

public class MTest {
    public static void main(String[] args) {
    	
    	int left = 13;
    	int right = 17;
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(left, right));
    	
	}
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        
        
        for(int i = left; i <= right; i++){
            
            List<Integer> list = new ArrayList<Integer>();
            
            for(int j = 1; j <= i; j++){
                if((i % j) == 0){
                    list.add(j);
                }
            }
            if(list.size() % 2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        
        return answer;
    }
}