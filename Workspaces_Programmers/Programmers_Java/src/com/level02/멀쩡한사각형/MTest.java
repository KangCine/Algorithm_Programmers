package com.level02.�����ѻ簢��;

public class MTest {
	public static void main(String[] args) {
		
	      int w = 8;
	      int h = 12;

	      Solution solution = new Solution();
	      System.out.println(solution.solution(w, h));

	}
}

class Solution {
    public long solution(long w, long h) {
        long answer = w * h;
        
        long cnt = 0;
        long tmp = 0;
        
        // �ִ� ����� ���ϱ�����
        // cnt = �ִ�����
        for(long i = 1; i <= w; i++){
            if(w % i == 0 && h % i == 0){
                cnt = i;
            }
        }
        
        w /= cnt;
        h /= cnt;
        
        if(w == h){
            tmp = w;
        }else{
            tmp = w + h - 1;
        }
        
        answer -= cnt * tmp;
        
        return answer;
    }
}