package com.level01.x만큼간격이있는n개의숫자;

public class MTest {
	public static void main(String[] args) {
		
		long x = 2;
		int n = 5;
		
		Solution solution = new Solution();
		System.out.println(solution.solution(x, n));
	}
}

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long [n];
        
        for(int i = 1; i < n+1; i++){
            answer[i-1] = x * i;
        }
        
        return answer;
    }
}