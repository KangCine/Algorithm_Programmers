package com.level01.나누어떨어지는숫자배열;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(arr, divisor));
	}
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int j = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                j++;
            }
        }
        
        answer = new int [j];
        
        j = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[j] = arr[i];
                j++;
            }
        }
        
        Arrays.sort(answer);
        
        
        if(answer.length == 0){
            answer = new int [1];
            answer[0] = -1;
        }
        
        return answer;
    }
}