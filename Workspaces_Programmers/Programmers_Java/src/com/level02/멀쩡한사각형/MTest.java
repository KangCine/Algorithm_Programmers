package com.level02.멀쩡한사각형;

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
        
        // 최대 공약수 구하기위함
        // cnt = 최대공약수
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