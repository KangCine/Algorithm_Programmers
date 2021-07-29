package com.level01.���ǰ��;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		
		int n = 6;
		int [] answers = {1,2,3,4,5};
		
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(answers)));

	}
}


class Solution {
    public int[] solution(int[] answers) {
        
        // �ڵ尡 ������Ű��Ƽ� �޼ҵ� ���� �P���ϴ�!
        int[] tmp = {supo01(answers), supo02(answers), supo03(answers)};
        List<Integer> list = new ArrayList<Integer>();
        
        // ���߿� �ְ����� ����� ����ϱ� ����...
        int max = 0;
        
        // �ְ������� ��������
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] > max){
                max = tmp[i];
            }
        }
        
        // �ְ������� ����� ������� �˱����� + �������� �˱�����
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] == max){
                list.add(i);
            }
        }
        
        // list��ŭ answer�� �迭���̸� �����ְ�
        int[] answer = new int [list.size()];
        
        // list�� answer �迭�� �Űܿɴϴ�.
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i) + 1;
        }
        
        return answer;
    }
    
    
    private int supo01(int[] answers){
        int[] supoza = {1, 2, 3, 4, 5};
        int count = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == supoza[i % supoza.length]){
                count++;
            }
        }
        
        return count;
    }
    
        private int supo02(int[] answers){
        int[] supoza = {2, 1, 2, 3, 2, 4, 2, 5};
        int count = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == supoza[i % supoza.length]){
                count++;
            }
        }
        
        return count;
    }
    
        private int supo03(int[] answers){
        int[] supoza = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == supoza[i % supoza.length]){
                count++;
            }
        }
        
        return count;
    }
}