// 로또의 최고 순위와 최저 순위
package com.level01.로또의최고순위와최저순위;

import java.util.Arrays;

public class MTest {
	
	public static void main(String[] args) {
		
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		Soulution solution = new Soulution();
		System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));
	}
}

class Soulution{
    public int[] solution(int[] lottos, int[] win_nums) {
    	
    	int count = 0;
        int min = 0;
        int max = 0;
        
        for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			count++;
        		}
        	}
        }
        
        for(int i : lottos) {
        	if(i == 0) {
        		max++;
        	}
        }
        
        switch(count) {
        case 0: min = 6; case 1: min = 6;
        break;
        case 2: min = 5;
        break;
        case 3: min = 4;
        break;
        case 4: min = 3;
        break;
        case 5: min = 2;
        break;
        case 6: min = 1;
        break;
        }
        
        switch(count + max) {
        case 0: max = 6; case 1: max = 6;
        break;
        case 2: max = 5;
        break;
        case 3: max = 4;
        break;
        case 4: max = 3;
        break;
        case 5: max = 2;
        break;
        case 6: max = 1;
        break;
        }
        
        
        int[] answer = {max, min};
        
        return answer;
    }
}