package com.level01.비밀지도;

import java.util.Arrays;

public class MTest {
	public static void main(String[] args) {
		
		int n = 6;
		int [] arr1 = {46, 33, 33 ,22, 31, 50};
		int [] arr2 = {27 ,56, 19, 14, 14, 10};
		
		Soulution solution = new Soulution();
		System.out.println(Arrays.toString(solution.solution(n, arr1, arr2)));

	}
}


class Soulution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	
    	
    	String [] answer = new String [n];
    	
		for(int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);  
			answer[i] = String.format("%"+ n +"s", answer[i]);
			answer[i] = answer[i].replaceAll("1", "#");
			answer[i] = answer[i].replaceAll("0", " ");
		}
		
		
        return answer;
    }
}