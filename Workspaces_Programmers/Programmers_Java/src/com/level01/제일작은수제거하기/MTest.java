package com.level01.���������������ϱ�;

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
        
        // ó������ �־��� �迭�� ���̰� 1�̸� ������ -1 ����
        if(answer.length == 0){
            answer = new int [1];
            answer[0] = -1;
        }
        
        return answer;
    }
}