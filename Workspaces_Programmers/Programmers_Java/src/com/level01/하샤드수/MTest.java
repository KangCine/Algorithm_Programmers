package com.level01.ÇÏ»þµå¼ö;

public class MTest {
	public static void main(String[] args) {
	      int arr = 10;

	      Solution solution = new Solution();
	      System.out.println(solution.solution(arr));
	}
}

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = 0;
        String [] xArr = (x+"").split("");
        
        for(int i = 0; i < xArr.length; i++){
            tmp += Integer.parseInt(xArr[i]);
        }
        
        if(!(x % tmp == 0)){
            answer = false;
        }
        
        return answer;
    }
}