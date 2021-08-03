package com.level01.¿¹»ê;

import java.util.*;

public class MTest {
    public static void main(String[] args) {
    	int[] d = {1, 3, 2, 5, 4};
    	int budget = 9;
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(d, budget));
	}
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int tmp = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if((tmp + d[i]) <= budget){
                tmp += d[i];
                answer++;
            }

        }
        return answer;
    }
}