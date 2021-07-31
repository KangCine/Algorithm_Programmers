package com.level01.같은숫자는싫어;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		
		Solution solution = new Solution();
		System.out.println(solution.solution(arr));
	}
}

class Solution {
    public List solution(int []arr) {
    	
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(arr[0]);
                       
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                answer.add(arr[i]);
            }
            
        }

        return answer;
    }
}