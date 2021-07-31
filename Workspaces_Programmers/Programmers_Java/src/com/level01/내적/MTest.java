package com.level01.³»Àû;

public class MTest {
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4};
		int[] b = {-3, -1, 0, 2};
		
		Solution solution = new Solution();
		System.out.println(solution.solution(a, b));
	}
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        int tmp = 0;
        
        for(int i = 0; i < a.length; i++){
            tmp = a[i] * b[i];
            answer += tmp;
        }
        
        return answer;
    }
}