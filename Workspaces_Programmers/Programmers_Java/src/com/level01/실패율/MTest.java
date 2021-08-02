package com.level01.실패율;

import java.util.*;


public class MTest {
	public static void main(String[] args) {
		int n = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		Solution solution = new Solution();
		System.out.println(solution.solution(n, stages));
	}
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        
        double[] percentage = new double [N];
        double[] tmpArr = new double [N];
        
        double tmp = stages.length;
        double cnt = 0;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i+1){
                    cnt++;
                }
            }
            
            percentage[i] = cnt/tmp;
            tmpArr[i] = cnt/tmp;
            
            // 해당스테이지에 남아있는 도전자가 아무도 없어서 아무도 도달하지 못했을경우
            if(cnt == 0 && tmp == 0){
                percentage[i] = 0;
                tmpArr[i] = 0;
            }
            
            tmp -= cnt;
            cnt = 0;
        }
        
        Arrays.sort(percentage);
        
        for(int i = percentage.length-1; i >= 0; i--){
            for(int j = 0; j < tmpArr.length; j++){
                if(percentage[i] != -1 && percentage[i] == tmpArr[j]){
                    answer[percentage.length-1-i] = j+1;
                    percentage[i] = -1;
                    tmpArr[j] = -1;
                }
            }
        }
        
        return answer;
    }
}