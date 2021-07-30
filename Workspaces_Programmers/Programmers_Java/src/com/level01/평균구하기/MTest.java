package com.level01.Æò±Õ±¸ÇÏ±â;

public class MTest {
	public static void main(String[] args) {
	      int[] arr = {1, 2, 3, 4};

	      Solution solution = new Solution();
	      System.out.println(solution.solution(arr));
	}
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        answer = answer / arr.length;
        
        return answer;
    }
}