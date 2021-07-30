package com.level01.제일작은수제거하기;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
	      int[] arr = {4, 3, 2, 1};

	      Solution solution = new Solution();
	      System.out.println(solution.solution(arr));
	}
}


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length - 1];
        int[] tmp = arr.clone();
        List<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(tmp);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != tmp[0]){
                list.add(arr[i]);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        // 처음으로 주어진 배열의 길이가 1이면 무조건 -1 리턴
        if(answer.length == 0){
            answer = new int [1];
            answer[0] = -1;
        }
        
        return answer;
    }
}