package com.level01.모의고사;

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
        
        // 코드가 길어질거같아서 메소드 만들어서 뻇습니다!
        int[] tmp = {supo01(answers), supo02(answers), supo03(answers)};
        List<Integer> list = new ArrayList<Integer>();
        
        // 나중에 최고점인 사람을 기록하기 위해...
        int max = 0;
        
        // 최고점수가 몇점인지
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] > max){
                max = tmp[i];
            }
        }
        
        // 최고점수인 사람이 몇명인지 알기위해 + 누구인지 알기위해
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] == max){
                list.add(i);
            }
        }
        
        // list만큼 answer의 배열길이를 정해주고
        int[] answer = new int [list.size()];
        
        // list를 answer 배열로 옮겨옵니다.
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