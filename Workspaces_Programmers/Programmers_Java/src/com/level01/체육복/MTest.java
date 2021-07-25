package com.level01.ü����;

public class MTest {

	public static void main(String[] args) {

		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};

	    Solution solution = new Solution();
	    System.out.println(solution.solution(n, lost, reserve));

	   }
	}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int firstStart = FirstStart(n, lost, reserve);
        int lastStart = LastStart(n, lost, reserve);
        
        int answer = firstStart > lastStart ? firstStart : lastStart;
        
        return answer;
    }
    
    
    // �տ��� ����
    private int FirstStart(int n, int[] lost, int[] reserve){
        int firstStart = n - (lost.length + reserve.length);
        
        // �ڱ� �ڽ��� ���� ü������ �����Դµ� �������� ��� ���� �����ؾ���
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                
                if(lost[i] == reserve[j]){
                    lost[i] = -11;
                    reserve[j] = -99;
                }
            }
        }
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                
                if(lost[i] == reserve[j]-1){
                    lost[i] = -11;
                    reserve[j] = -99;
                }
                
                if(lost[i] == reserve[j]+1){
                    lost[i] = -11;
                    reserve[j] = -99;
                }
            }
        }
        
        
        
        for(int i = 0; i < lost.length; i++){
            if(lost[i] == -11){
                firstStart++;
            }
        }
        
        firstStart += reserve.length;
        
        return firstStart;
    }
    
    // �ڿ��� ����
    private int LastStart(int n, int[] lost, int[] reserve){
        int lastStart = n - (lost.length + reserve.length);
        
        // �ڱ� �ڽ��� ���� ü������ �����Դµ� �������� ��� ���� �����ؾ���
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                
                if(lost[i] == reserve[j]){
                    lost[i] = -11;
                    reserve[j] = -99;
                }

            }
        }
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                
                
                if(lost[i] == reserve[j]-1){
                    lost[i] = -11;
                    reserve[j] = -99;
                }
                
                if(lost[i] == reserve[j]+1){
                    lost[i] = -11;
                    reserve[j] = -99;
                }
            }
        }
        
        for(int i = 0; i < lost.length; i++){
            if(lost[i] == -11){
                lastStart++;
            }
        }
        
        lastStart += reserve.length;
        
        return lastStart;
    }
    
    
}