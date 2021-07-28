package com.level01.K¹øÂ°¼ö;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(array, commands)));
	}
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        
        for(int i = 0; i < commands.length; i++){
            
            int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            Arrays.sort(tmp);
            
            answer[i] = tmp[commands[i][2]-1];
        }
        
        return answer;
    }
}