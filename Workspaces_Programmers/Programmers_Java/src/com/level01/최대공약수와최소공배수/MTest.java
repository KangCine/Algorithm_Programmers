package com.level01.최대공약수와최소공배수;

public class MTest {
	public static void main(String[] args) {
	      int n = 3;
	      int m = 12;

	      Solution solution = new Solution();
	      System.out.println(solution.solution(n, m));
	}
}


class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        if(n > m){
            if(n % m == 0){
                answer[0] = m;
                answer[1] = n;
            }else{
                for(int i = 1; i <= n; i++){
                    if(n % i == 0 && m % i == 0){
                        answer[0] = i;
                    }
                }
                answer[1] = n*m/answer[0];
            }
        }else if(n < m){
            if(m % n == 0){
                answer[0] = n;
                answer[1] = m;
            }else{
                for(int i = 1; i <= m; i++){
                    if(n % i == 0 && m % i == 0){
                        answer[0] = i;
                    }
                }
                answer[1] = n*m/answer[0];
            }
        }
        
        return answer;
    }
}