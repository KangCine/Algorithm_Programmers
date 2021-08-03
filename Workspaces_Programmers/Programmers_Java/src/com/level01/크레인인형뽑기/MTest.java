package com.level01.크레인인형뽑기;

import java.util.*;

public class MTest {
    public static void main(String[] args) {
    	int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int[] moves = {1,5,3,5,1,2,1,4};
    	
    	Solution solution = new Solution();
    	System.out.println(solution.solution(board, moves));
	}
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i < moves.length; i++){
            // 집에서 stack에 넣음
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    
                    // stack이 비어있다면 stack.peek()가 실행이 안됨!
                    if(!stack.empty()){
                        if(board[j][moves[i]-1] == stack.peek()){
                            stack.pop();
                            // 삭제할때마다 카운트업
                            answer++;
                        } else {
                            stack.push(board[j][moves[i]-1]);
                        }
                    // stack이 비어있다면 실행됨(최초의 한번, 중복으로 인해 pop 됐을 경우)
                    }else {
                        stack.push(board[j][moves[i]-1]);
                    }
                    
                    board[j][moves[i]-1] = 0;
                    
                    break;
                }
            }
        }
        return answer *= 2;
    }
}